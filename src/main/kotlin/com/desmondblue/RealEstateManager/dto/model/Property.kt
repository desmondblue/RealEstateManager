package com.desmondblue.RealEstateManager.dto.model

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
data class Property(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,

    @Column
    private val name: String,

    @Column
    private val location: String,

    @JoinColumn(name="owner_id")
    @ManyToOne(cascade = [CascadeType.ALL])
    private val owner: Owner
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Property) return false
        if (name != other.name || location != other.location) return false
        return true
    }

    override fun hashCode(): Int {
        return 37 + name.hashCode() + location.hashCode()
    }
}