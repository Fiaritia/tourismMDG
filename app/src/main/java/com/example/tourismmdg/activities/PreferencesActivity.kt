package com.example.tourismmdg.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatDelegate
import com.example.tourismmdg.R

class PreferencesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)
    }

    private lateinit var modeToggleImageView: ImageView
    private var isNightMode = false

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item, container, false)

        modeToggleImageView = view.findViewById(R.id.modeToggleImageView)
        modeToggleImageView.setOnClickListener {
            toggleDayNightMode()
        }

        return view
    }

    private fun toggleDayNightMode() {
        // Toggle the night mode flag
        isNightMode = !isNightMode

        // Set the appropriate icon based on the mode
        if (isNightMode) {
            modeToggleImageView.setImageResource(R.drawable.ic_dark_mode)
            // Set your night mode theme here
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            modeToggleImageView.setImageResource(R.drawable.ic_day_mode)
            // Set your day mode theme here
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }

}