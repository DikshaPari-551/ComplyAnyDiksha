package com.example.complyanydiksha.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.complyanydiksha.R

class ProfileActivity : AppCompatActivity() {
    lateinit var etFirstName:EditText
    lateinit var tvFirstName:TextView

    lateinit var btnUpdate: Button
    lateinit var backBtn:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

         etFirstName=findViewById(R.id.etFirstName)
         tvFirstName=findViewById(R.id.tvFirstName)
         btnUpdate=findViewById(R.id.btnUpate)
         btnUpdate.setOnClickListener {
            tvFirstName.text = ""
             val etFirstName=etFirstName.text.toString()
             if(etFirstName.isEmpty()){
                 tvFirstName.setText("*Please enter first name")
             }

/*
            val etCompanyId = binding.etCompanyId.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()
            binding.tvCompanyId.text=""
            binding.tvEmail.text=""
            binding.tvCompanyId.text=""
            binding.tvEmail.text=""*/
            //    firstName=etFirstName.text.toString()

/*
            if(etFirstName.isEmpty()){
                tvFirstName.setText("*Please enter companyId")
            }*/
            /*else if (etCompanyId.length < 4) {
                binding.tvCompanyId.setText("*CompanyId contain atleast 4 character")
            }

            else if (email.isEmpty()) {
                binding.tvEmail.setText("*Please enter email address")
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.tvEmail.setText("*Please enter valid email address")
            }
            else {
                binding.btnLogin.visibility = View.VISIBLE
                binding.etPass.visibility = View.VISIBLE
                binding.btnContinue.visibility = View.GONE
            }
        }
*/

            /*  backBtn=findViewById(R.id.toolbarBackIcon)
        backBtn.setOnClickListener {
            finish()
        }*/}
        }
}