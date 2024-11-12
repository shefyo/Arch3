package ru.netology.nmedia.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.netology.nmedia.repository.PostRemoteMediator

@Entity
data class PostRemoteKeyEntity(
    @PrimaryKey
    val type: PostRemoteMediator.KeyType,
    val id: Long,
) {
    enum class KeyType {
        AFTER, BEFORE
    }
}

