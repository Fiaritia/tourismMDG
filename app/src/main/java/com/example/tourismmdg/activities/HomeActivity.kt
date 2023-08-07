package com.example.tourismmdg.activities

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.ListFragment
import com.example.tourismmdg.R
import com.example.tourismmdg.databinding.ActivityHomeBinding
import com.example.tourismmdg.fragments.HeaderFragment
import com.example.tourismmdg.fragments.NavbarFragment
import com.example.tourismmdg.fragments.PublicationFragment


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.headerFragment, HeaderFragment())
                .replace(R.id.list, PublicationFragment())
                .replace(R.id.footerFragment, NavbarFragment())
                .commit()
        }
    }
}