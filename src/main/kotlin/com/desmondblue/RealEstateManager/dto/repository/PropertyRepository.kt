package com.desmondblue.RealEstateManager.dto.repository

import com.desmondblue.RealEstateManager.dto.model.Property
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface PropertyRepository: JpaRepository<Property, Long>, JpaSpecificationExecutor<Property> {
}