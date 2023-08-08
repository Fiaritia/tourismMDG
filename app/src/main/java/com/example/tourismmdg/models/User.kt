package com.example.tourismmdg.models

import com.example.tourismmdg.utilities.Constants

data class User(
    val username: String,
    val email: String,
    val nom: String,
    val prenom: String,
    val pwd: String,
    val photo: String = "",
    val role: List<String> = listOf(Constants.ROLES[0]), // Assuming ROLES.user is defined elsewhere
    val favoris: List<Publication> = emptyList(),
    val comments: List<Comment> = emptyList()
)

