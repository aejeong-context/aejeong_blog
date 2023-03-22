package com.blog.aejeong.model.domain

import com.blog.aejeong.model.domain.album.Album
import com.blog.aejeong.model.domain.user.User
import com.blog.aejeong.repository.AlbumRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager

@DataJpaTest(showSql = true)
internal class UserTest {
    @Autowired
    lateinit var testEntityManager: TestEntityManager
    @Autowired
    lateinit var albumRepository: AlbumRepository

    @Test
    fun createUser() {
        // given
        val user = User("신애정")
        val album = Album(user)

        testEntityManager.persistAndFlush(user)
        testEntityManager.persistAndFlush(album)
        testEntityManager.detach(user)
        testEntityManager.detach(album)

        // when
        val actualAlbum = user.id?.let { albumRepository.findById(it).orElseThrow() };

        // then
        if (actualAlbum != null) {
            Assertions.assertEquals(user.id,actualAlbum.writer.id)
        };

    }
}
