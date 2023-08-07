package com.example.tourismmdg.fragments

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class CommentDetailDialogFragment : DialogFragment() {

    companion object {
        private const val ARG_COMMENT = "arg_comment"

        fun newInstance(comment: String): CommentDetailDialogFragment {
            val args = Bundle()
            args.putString(ARG_COMMENT, comment)

            val fragment = CommentDetailDialogFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val comment = arguments?.getString(ARG_COMMENT) ?: ""

        return AlertDialog.Builder(requireContext())
            .setTitle("Comment Detail")
            .setMessage(comment)
            .setPositiveButton("OK") { _, _ -> dismiss() }
            .create()
    }
}
