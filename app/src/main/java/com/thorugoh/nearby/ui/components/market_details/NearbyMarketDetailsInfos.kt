package com.thorugoh.nearby.ui.components.market_details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thorugoh.nearby.R
import com.thorugoh.nearby.data.model.Market
import com.thorugoh.nearby.data.model.mock.mockMarkets
import com.thorugoh.nearby.ui.theme.Gray400
import com.thorugoh.nearby.ui.theme.Gray500
import com.thorugoh.nearby.ui.theme.Typography

@Composable
fun NearbyMarketDetailsInfos(modifier: Modifier = Modifier, market: Market) {
    Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text(text = "Informações", style = Typography.headlineSmall, color = Gray400)
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    tint = Gray500,
                    painter = painterResource(id = R.drawable.ic_ticket),
                    contentDescription = "Ícone de localização"
                )
                Text(
                    text = "${market.coupons} cupons disponíveis",
                    style = Typography.bodyMedium,
                    color = Gray500
                )
            }

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    tint = Gray500,
                    painter = painterResource(id = R.drawable.ic_map_pin),
                    contentDescription = "Ícone de endereço"
                )
                Text(
                    text = market.address,
                    style = Typography.bodyMedium,
                    color = Gray500
                )
            }

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    tint = Gray500,
                    painter = painterResource(id = R.drawable.ic_phone),
                    contentDescription = "Ícone de telefone"
                )
                Text(
                    text = market.phone,
                    style = Typography.bodyMedium,
                    color = Gray500
                )
            }

        }
    }
}

@Preview
@Composable
private fun MarketDetailsInfosPreview() {
    NearbyMarketDetailsInfos(market = mockMarkets.first())
}