package com.thorugoh.nearby.ui.components.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.thorugoh.nearby.R
import com.thorugoh.nearby.ui.theme.Typography


@Composable
fun WelcomeContent(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(24.dp)) {
        Text(text = "Veja como funciona:", style = Typography.bodyLarge)
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title = "Encontre estabelecimentos",
            subtitile = "Veja locais proximos que são parceiros do Nearby",
            iconRes = R.drawable.ic_map_pin
        )
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title = "Ative o cupom com QRCode",
            subtitile = "Escaneie o codigo no estabelecimento para usar o benefício",
            iconRes = R.drawable.ic_qrcode
        )
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title = "Garanta vantagens perto de você",
            subtitile = "Ative cupons onde estiver, emd diferentes tipos de estabelecimentos",
            iconRes = R.drawable.ic_ticket
        )
    }
}
