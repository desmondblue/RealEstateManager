package com.desmondblue.RealEstateManager.dto.resource

data class OwnerResource(
    val id: Long,
    val name: String,
    val location: String,
    val properties: List<PropertyResource>
)
