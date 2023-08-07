package com.example.tourismmdg.fragments

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.tourismmdg.R
import com.example.tourismmdg.activities.DetailPublicationActivity

class CommentsAdapter(private val context: Context, private val comments: List<String>) : RecyclerView.Adapter<CommentsAdapter.CommentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.comment_layout, parent, false)
        return CommentViewHolder(view)
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        val comment = comments[position]
        holder.bind(comment)
    }

    override fun getItemCount(): Int {
        return comments.size
    }

    inner class CommentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val commentTextTextView: TextView = itemView.findViewById(R.id.commentTextTextView)

        fun bind(comment: String) {
            commentTextTextView.text = comment

            itemView.setOnClickListener {
                val commentDetailDialog = CommentDetailDialogFragment.newInstance(comment)
                commentDetailDialog.show((context as AppCompatActivity).supportFragmentManager, "comment_detail_dialog")
            }
        }
    }
}
