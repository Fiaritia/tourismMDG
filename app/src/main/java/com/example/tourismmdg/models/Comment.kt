package com.example.tourismmdg.models

import java.util.Date

data class Comment(
    val username: String,
    val publicationId: String,
    val comment: String = ":)",
    val commentDate: Date = Date(),
    val likes: List<String> = emptyList(),
    val nbLikes: Int = 0,
    val photos: List<String> = emptyList()
)

