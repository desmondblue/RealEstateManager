package com.desmondblue.RealEstateManager.dto.resource

data class PropertyResource(
    val id: Long,
    val name: String,
    val location: String,
    val ownerId: Long
)
