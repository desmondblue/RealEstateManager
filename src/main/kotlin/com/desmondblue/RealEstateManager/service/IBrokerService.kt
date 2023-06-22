package com.desmondblue.RealEstateManager.service

import com.desmondblue.RealEstateManager.dto.resource.PropertyResource

interface IBrokerService {
    fun fetchPropertiesForOwner(ownerId: Long): List<PropertyResource>
    fun fetchPropertiesForLocation(location: String): List<PropertyResource>
}