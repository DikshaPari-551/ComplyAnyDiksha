package com.example.complyanydiksha.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanydiksha.R

class TermsOfUseActivity : AppCompatActivity() {
    lateinit var backTermsAndConditions:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_of_use)
        backTermsAndConditions=findViewById(R.id.backTermsAndConditions)
        backTermsAndConditions.setOnClickListener {
            finish()
        }
    }
}