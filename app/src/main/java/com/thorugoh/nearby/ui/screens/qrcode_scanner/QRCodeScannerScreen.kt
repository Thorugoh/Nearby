package com.thorugoh.nearby.ui.screens.qrcode_scanner

import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale
import androidx.core.content.ContextCompat
import com.journeyapps.barcodescanner.ScanContract
import com.journeyapps.barcodescanner.ScanOptions
import com.thorugoh.nearby.MainActivity

@Composable
fun QRCodeScannerScreen(modifier: Modifier = Modifier, onCompletedScan: (String) -> Unit) {
    val context = LocalContext.current

    val scanOptions = ScanOptions()
        .setDesiredBarcodeFormats(ScanOptions.QR_CODE)
        .setPrompt("Leia O QR Code do cupom")
        .setBeepEnabled(true)
        .setBeepEnabled(false)
        .setOrientationLocked(false)
        .setBarcodeImageEnabled(true)

    val barCodeLauncher = rememberLauncherForActivityResult(ScanContract()) { result ->
        onCompletedScan(result.contents.orEmpty())
    }

    val cameraPermissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            ActivityResultContracts.RequestPermission()
        } else {
            barCodeLauncher.launch(scanOptions)
        }

    }

    fun checkCameraPermission() {
        if (ContextCompat.checkSelfPermission(
                context,
                android.Manifest.permission.CAMERA
            ) == android.content.pm.PackageManager.PERMISSION_GRANTED
        ) {
            barCodeLauncher.launch(scanOptions)
        } else if (shouldShowRequestPermissionRationale(
                context as MainActivity,
                android.Manifest.permission.CAMERA
        )) {
            Toast.makeText(context, "Necessário permissão de câmera para continuar", Toast.LENGTH_SHORT).show()
        } else {
            cameraPermissionLauncher.launch(android.Manifest.permission.CAMERA)
        }
    }

    LaunchedEffect(true) {
        checkCameraPermission()
    }

    Column(modifier = modifier.fillMaxSize()){ }
}