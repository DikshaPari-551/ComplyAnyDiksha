package com.example.complyanydiksha.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.complyanydiksha.R
import com.example.complyanydiksha.databinding.ActivityForgetPasswordBinding

class ForgetPasswordActivity : AppCompatActivity() {
    lateinit var etCustomerCode:EditText
    lateinit var etEmail:EditText
    lateinit var tvCustomerCode:TextView
    lateinit var tvEmail:TextView
    lateinit var btnSubmitted:Button
    lateinit var toolbarBackIcon:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)


        toolbarBackIcon=findViewById(R.id.toolbarBackIcon)
        toolbarBackIcon.setOnClickListener {
            val intent=Intent(this,DikshaLoginActivity::class.java)
            startActivity(intent)
        }

        etCustomerCode=findViewById(R.id.etCustomerCode)
        etEmail=findViewById(R.id.etEmail)
        tvCustomerCode=findViewById(R.id.tvCustomerCode)
        tvEmail=findViewById(R.id.tvEmail)
        btnSubmitted=findViewById(R.id.btnSubmitted)
        btnSubmitted.setOnClickListener{
            tvCustomerCode.text=""
            tvEmail.text=""




            val etCustomerCode = etCustomerCode.text.toString()
            val email=etEmail.text.toString()
            if(etCustomerCode.isEmpty()){
                tvCustomerCode.setText("*Please enter customer code")
            }
           /* else if (etCustomerCode.length < 2) {
                tvCustomerCode.setText("*CompanyId contain atleast 8 character")
            }*/

            else if (email.isEmpty()) {
                tvEmail.setText("*Please enter email address")
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                tvEmail.setText("*Please enter valid email address")
            }
            else{
                Toast.makeText(this, "Submit", Toast.LENGTH_SHORT).show()
            }
        }

    }


}