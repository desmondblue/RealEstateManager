package com.desmondblue.RealEstateManager.service

import com.desmondblue.RealEstateManager.dto.repository.OwnerRepository
import com.desmondblue.RealEstateManager.dto.repository.PropertyRepository
import com.desmondblue.RealEstateManager.dto.resource.PropertyResource
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class ListingService(
    private val propertyRepository: PropertyRepository,
    private val ownerRepository: OwnerRepository
) : IListingService{
    override fun createPropertyListing(resource: PropertyResource): Long {
        TODO("Not yet implemented")
    }

    override fun deletePropertyListing(id: Long): Long {
        TODO("Not yet implemented")
    }

    override fun updatePropertyListing(propertyResource: PropertyResource): PropertyResource {
        TODO("Not yet implemented")
    }

}