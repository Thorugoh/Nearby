package com.thorugoh.nearby.ui.screens.market_details

sealed class MarketDetailsUiEvent {
    data class OnFetchRules(val marketId: String): MarketDetailsUiEvent()
    data class OnFetchCoupon(val qrCodeContent: String): MarketDetailsUiEvent()
    data object OnResetCoupon: MarketDetailsUiEvent()
}