package com.thorugoh.nearby.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Rule(
    val id: String,
    val marketId: String,
    val description: String
)
