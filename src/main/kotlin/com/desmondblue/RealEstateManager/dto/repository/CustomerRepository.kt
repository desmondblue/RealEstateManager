package com.desmondblue.RealEstateManager.dto.repository

import com.desmondblue.RealEstateManager.dto.model.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository :  JpaRepository<Customer, Long>, JpaSpecificationExecutor<Customer> {
}