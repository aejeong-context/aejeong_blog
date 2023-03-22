package com.blog.aejeong.repository

import com.blog.aejeong.model.domain.album.Album
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface AlbumRepository : JpaRepository<Album, Long> {
}