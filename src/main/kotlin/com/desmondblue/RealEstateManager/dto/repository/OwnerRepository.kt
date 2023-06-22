package com.desmondblue.RealEstateManager.dto.repository

import com.desmondblue.RealEstateManager.dto.model.Owner
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface OwnerRepository: JpaRepository<Owner, Long>, JpaSpecificationExecutor<Owner> {
}