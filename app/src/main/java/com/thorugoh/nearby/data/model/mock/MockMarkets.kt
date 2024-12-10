package com.thorugoh.nearby.data.model.mock

import com.thorugoh.nearby.data.model.Market
import com.thorugoh.nearby.data.model.Rule

val mockMarkets = listOf(
    Market(
        id = "1",
        categoryId = "1",
        name = "Mercado do João",
        description = "O melhor mercado da região",
        coupons = 3,
        latitude = -23.550520,
        longitude = -46.633308,
        address = "Rua do João, 123",
        phone = "(11) 99999-9999",
        cover = "https://picsum.photos/200/300",
//        rules = listOf(
//            Rule( id = "1", marketId= "1", description = "Valido até 25/12" ),
//            Rule( id = "2", marketId= "1", description = "Disponivel apenas para consumo no local" ),
//        )
    ),
    Market(
        id = "2",
        categoryId = "2",
        name = "Farmácia do Zé",
        description = "A farmácia mais barata da região",
        coupons = 5,
        latitude = -23.550520,
        longitude = -46.633308,
        address = "Rua do Zé, 123",
        phone = "(11) 99999-9999",
        cover = "https://picsum.photos/200/300"
    ),
)