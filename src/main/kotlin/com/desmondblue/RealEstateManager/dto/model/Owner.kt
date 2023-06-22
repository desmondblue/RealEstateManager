package com.desmondblue.RealEstateManager.dto.model

import jakarta.persistence.*

@Entity
data class Owner(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override val id: Long = 0,

    @Column
    private val name: String,

    @Column
    private val location: String,

    @Column
    @ElementCollection(fetch = FetchType.LAZY)
    private val properties: List<Property>

) : User {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Owner) return false
        if (name != other.name || location != other.location) return false
        return true
    }

    override fun hashCode(): Int {
        return 37 + name.hashCode() + location.hashCode()
    }

}
