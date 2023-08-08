package com.example.tourismmdg.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView
import com.example.tourismmdg.R

class MainActivity : AppCompatActivity() {
    private val splashTime = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Récupère l'ImageView à animer
        val splashLogo = findViewById<ImageView>(R.id.splashLogo)

        // Crée l'animation de rotation
        val rotateAnimation = RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
        rotateAnimation.duration = 500 // Durée de l'animation en millisecondes
        rotateAnimation.repeatCount = 0 // Répète indéfiniment

        // Lance l'animation sur l'ImageView
        splashLogo.startAnimation(rotateAnimation)

        // Décaler le passage à l'écran d'accueil après les 3s
        Handler().postDelayed({
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, splashTime.toLong())
    }
}