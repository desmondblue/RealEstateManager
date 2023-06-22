package com.desmondblue.RealEstateManager.service

import com.desmondblue.RealEstateManager.dto.resource.PropertyResource

interface IListingService {

    fun createPropertyListing(resource: PropertyResource): Long
    fun deletePropertyListing(id: Long): Long
    fun updatePropertyListing(propertyResource: PropertyResource): PropertyResource
}