package com.desmondblue.RealEstateManager.service

import com.desmondblue.RealEstateManager.dto.repository.CustomerRepository
import com.desmondblue.RealEstateManager.dto.repository.OwnerRepository
import com.desmondblue.RealEstateManager.dto.repository.PropertyRepository
import com.desmondblue.RealEstateManager.dto.resource.PropertyResource
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service


@Service
@Transactional
class BrokerService(
    private val propertyRepository: PropertyRepository,
    private val ownerRepository: OwnerRepository,
    private val customerRepository: CustomerRepository
) : IBrokerService{
    override fun fetchPropertiesForOwner(ownerId: Long): List<PropertyResource> {
        TODO("Not yet implemented")
    }

    override fun fetchPropertiesForLocation(location: String): List<PropertyResource> {
        TODO("Not yet implemented")
    }

}