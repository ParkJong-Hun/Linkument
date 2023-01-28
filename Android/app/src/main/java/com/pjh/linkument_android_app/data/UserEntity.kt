package com.pjh.linkument_android_app.data

import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

data class UserEntity(
    @SerializedName("id")
    val id: Long,
    @SerializedName("nickname")
    val nickname: String,
    @SerializedName("createTime")
    val createTime: LocalDateTime,
    @SerializedName("updateTime")
    val updateTime: LocalDateTime,
) {
    fun toUser() = User(id, nickname)
}