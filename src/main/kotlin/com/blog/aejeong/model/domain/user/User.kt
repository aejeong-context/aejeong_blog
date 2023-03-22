package com.blog.aejeong.model.domain.user

import jakarta.persistence.*
import java.util.UUID

@Table(name = "users")
@Entity
class User(
    var name: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}