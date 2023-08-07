package com.example.tourismmdg.models

import android.os.Parcelable
data class PublicationItem(
    val id: Int,
    val title: String,
    val imageUrl: String,
    val likes: Int,
    val comments: Int
)
