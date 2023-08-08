package com.example.tourismmdg.models

import java.util.Date

data class Publication(
    val title: String,
    val description: String,
    val city: String,
    val publicationDate: Date = Date(),
    val coordonates: Coordonates? = null,
    val defaultPhotos: List<String> = emptyList(),
    val categories: List<Categorie> = emptyList(),
    val contact: Contact = Contact(),
    val notes: List<Note> = emptyList(),
    val nbNotes: Int = 0,
    val score: Int = 0,
    val rate: Double = 0.0,
    val comments: List<Comment> = emptyList(),
    val nbComments: Int = 0,
    val gallery: List<String> = emptyList()
)

data class Coordonates(
    val latitue: Double,
    val longitude: Double
)

data class Contact(
    val phones: List<Phone> = emptyList(),
    val mails: List<Mail> = emptyList(),
    val links: List<Link> = emptyList()
)

data class Phone(
    val value: String,
    val desc: String
)

data class Mail(
    val value: String,
    val desc: String
)

data class Link(
    val value: String,
    val desc: String
)

data class Note(
    val username: String,
    val note: Int
)

