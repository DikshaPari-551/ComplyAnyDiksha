package com.example.complyanydiksha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.complyanydiksha.activity.ChatActivity
import com.example.complyanydiksha.activity.EmailActivity

class ContactUsActivity : AppCompatActivity() {
    lateinit var ChatContact:TextView
    lateinit var EmailContact:TextView
    lateinit var backHelpContact:TextView
    lateinit var BookameetingContact:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)

        EmailContact=findViewById(R.id.EmailContact)
        EmailContact.setOnClickListener {
            val intent=Intent(this,EmailActivity::class.java)
            startActivity(intent)
        }
        ChatContact=findViewById(R.id.ChatContact)
        ChatContact.setOnClickListener {
            val intent=Intent(this,ChatActivity::class.java)
            startActivity(intent)
        }
        backHelpContact = findViewById(R.id.backHelpContact)
        backHelpContact.setOnClickListener{
            onBackPressed()
        }

    BookameetingContact = findViewById(R.id.BookameetingContact)
        BookameetingContact.setOnClickListener{
        onBackPressed()
    }
}

    override fun onBackPressed() {
        finish()
    }

}