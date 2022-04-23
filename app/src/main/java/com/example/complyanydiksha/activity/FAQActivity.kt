package com.example.complyanydiksha.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanydiksha.R

class FAQActivity : AppCompatActivity() {
    lateinit var backHelpFAQ:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faqactivity)
        backHelpFAQ = findViewById(R.id.backHelpFAQ)
        backHelpFAQ.setOnClickListener{
            onBackPressed()
        }
    }
    override fun onBackPressed() {
        finish()
    }

}