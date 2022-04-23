package com.example.complyanydiksha.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanydiksha.R

class TodayActivity : AppCompatActivity() {
    lateinit var backBtn:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_today)
        backBtn=findViewById(R.id.backBtn)
        backBtn.setOnClickListener {
            finish()
        }
    }
}