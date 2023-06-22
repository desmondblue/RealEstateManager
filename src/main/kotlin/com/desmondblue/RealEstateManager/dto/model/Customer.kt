package com.desmondblue.RealEstateManager.dto.model

import jakarta.persistence.*

@Entity
data class Customer(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override val id: Long = 0,

    @Column
    private val name: String,

    @Column
    private val location: String,

    @OneToOne
    @JoinColumn(name="property_id", referencedColumnName = "id")
    private val property: Property

): User{
    @Override
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Customer) return false
        if (name != other.name || location != other.location) return false
        return true
    }

    @Override
    override fun hashCode(): Int {
        return 37 + name.hashCode() + location.hashCode()
    }
}
