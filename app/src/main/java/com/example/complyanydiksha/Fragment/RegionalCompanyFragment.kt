package com.example.complyanydiksha.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.complyanydiksha.R

class RegionalCompanyFragment : Fragment() {
    lateinit var backRegionalCompany:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_regional_company, container, false)
        backRegionalCompany=view.findViewById(R.id.backRegionalCompany)
        backRegionalCompany.setOnClickListener {
            this.activity?.onBackPressed()
        }
        return view
    }
}