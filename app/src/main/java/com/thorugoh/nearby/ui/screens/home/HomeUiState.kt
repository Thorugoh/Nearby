package com.thorugoh.nearby.ui.screens.home

import com.google.android.gms.maps.model.LatLng
import com.thorugoh.nearby.data.model.Category
import com.thorugoh.nearby.data.model.Market

data class HomeUiState(
    val categories: List<Category>? = null,
    val markets: List<Market>? = null,
    val marketLocations: List<LatLng>? = null
)
