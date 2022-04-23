package com.example.complyanydiksha.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanydiksha.R

class RegisterEmailNotificationActivity : AppCompatActivity() {
    lateinit var backButton:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_email_notification)
        backButton=findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }
    }
}