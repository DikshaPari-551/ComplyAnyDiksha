package com.example.complyanydiksha.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanydiksha.R

class DocumentActivity : AppCompatActivity() {
    lateinit var backHelpDocument: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_document)
        backHelpDocument = findViewById(R.id.backHelpDocument)
        backHelpDocument.setOnClickListener{
            onBackPressed()
        }
    }
    override fun onBackPressed() {
        finish()
    }
}