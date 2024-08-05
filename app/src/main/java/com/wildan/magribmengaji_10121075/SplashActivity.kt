package com.wildan.magribmengaji_10121075

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Jeda Splash Screem 3 detik
        Handler(Looper.getMainLooper()).postDelayed({
            goToMainActivity()
        }, 3000L)
    }
    // Fungsi SplashScreen ke MainActivity
    private fun goToMainActivity(){
        Intent(this, MainActivity::class.java).also{
            startActivity(it)
            finish()
        }
    }
}