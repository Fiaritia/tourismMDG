package com.example.tourismmdg.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tourismmdg.R
import com.example.tourismmdg.databinding.ActivityHomeBinding
import com.example.tourismmdg.fragments.HeaderFragment
import com.example.tourismmdg.fragments.NavbarFragment

class CardDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_detail)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.headerFragment, HeaderFragment())
                .replace(R.id.footerFragment, NavbarFragment())
                .replace(R.id.footerFragment, NavbarFragment())
                .commit()
        }
    }
}