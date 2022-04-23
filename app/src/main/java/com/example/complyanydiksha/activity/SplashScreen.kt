package com.example.complyanydiksha.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.complyanydiksha.MainActivity
import com.example.complyanydiksha.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            val intent= Intent(this, DikshaLoginActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}