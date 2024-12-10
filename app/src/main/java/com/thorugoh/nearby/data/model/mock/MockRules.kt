package com.thorugoh.nearby.data.model.mock

import com.thorugoh.nearby.data.model.Rule

val mockRules = listOf(
    Rule(
        id = "1",
        marketId = "1",
        description = "Válido apenas para consumo no local"
    ),
    Rule(
        id = "2",
        marketId = "2",
        description = "Disponivel ate 12/12/2024"
    ),
)