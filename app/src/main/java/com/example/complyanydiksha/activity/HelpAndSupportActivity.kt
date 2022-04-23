package com.example.complyanydiksha.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanydiksha.ContactUsActivity
import com.example.complyanydiksha.R

class HelpAndSupportActivity : AppCompatActivity() {
    lateinit var document: TextView
    lateinit var Faq: TextView
    lateinit var demo : TextView
    lateinit var contactus : TextView
    lateinit var backHelpAndSupport : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help_and_support)
        document = findViewById(R.id.document)
        Faq = findViewById(R.id.Faq)
        demo = findViewById(R.id.demo)
        contactus = findViewById(R.id.contactus)
        backHelpAndSupport = findViewById(R.id.backHelpAndSupport)


        document.setOnClickListener {
            Intent(this, DocumentActivity::class.java).also {
                startActivity(it)
            }
        }

        Faq.setOnClickListener {
            Intent(this, FAQActivity::class.java).also {
                startActivity(it)
            }
        }

        demo.setOnClickListener {
            Intent(this, DemoActivity::class.java).also {
                startActivity(it)
            }
        }

        contactus.setOnClickListener {
            Intent(this, ContactUsActivity::class.java).also {
                startActivity(it)
            }
        }


        backHelpAndSupport.setOnClickListener {
            onBackPressed()
        }


    }

override fun onBackPressed() {
    finish()
}

}