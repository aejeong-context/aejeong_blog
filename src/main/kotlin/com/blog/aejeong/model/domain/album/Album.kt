package com.blog.aejeong.model.domain.album

import com.blog.aejeong.model.domain.user.User
import jakarta.persistence.*
import java.util.UUID

@Table(name = "album")
@Entity
class Album(
    _writer: User
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @ManyToOne
    @JoinColumn(name = "writer_id",nullable = false)
    var writer: User = _writer
}