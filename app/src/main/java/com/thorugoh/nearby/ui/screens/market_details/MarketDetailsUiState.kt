package com.thorugoh.nearby.ui.screens.market_details

import com.thorugoh.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null
)