package com.example.tourismmdg.activities

import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.tourismmdg.R
import com.example.tourismmdg.databinding.ActivityHomeBinding
import com.example.tourismmdg.fragments.HeaderFragment
import com.example.tourismmdg.fragments.NavbarFragment

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        val webview = findViewById<WebView>(R.id.webview)
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://www.youtube.com/watch?v=KnCFzro1jU8")
        webview.settings.javaScriptEnabled = true
        webview.settings.setSupportZoom(true)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.headerFragment, HeaderFragment())
                .replace(R.id.footerFragment, NavbarFragment())
                .commit()
        }
    }
}