package com.example.tourismmdg.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tourismmdg.R
import com.example.tourismmdg.fragments.CommentsAdapter

class DetailPublicationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_publication)

        val commentsRecyclerView: RecyclerView = findViewById(R.id.commentsRecyclerView)
        val layoutManager = LinearLayoutManager(this)
        commentsRecyclerView.layoutManager = layoutManager

        val comments = listOf("Comment 1", "Comment 2", "Comment 3") // Remplacez par vos données de commentaires
        val commentsAdapter = CommentsAdapter(this, comments)
        commentsRecyclerView.adapter = commentsAdapter
    }
}
