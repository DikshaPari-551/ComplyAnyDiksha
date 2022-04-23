package com.example.complyanydiksha.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.complyanydiksha.R
import com.example.complyanydiksha.activity.fragment


class GlobalCompanyFragment : Fragment() {
    lateinit var backGlobalCompany:TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_global_company, container, false)
      backGlobalCompany=view.findViewById(R.id.backGlobalCompany)

     backGlobalCompany.setOnClickListener {

//         fragmentManager?.beginTransaction()?.replace(
//             R.id.frame,
//             MenuFragment(), null
//         )?.addToBackStack(null)?.commit
         this.activity?.onBackPressed()

     }
        return view
    }

}