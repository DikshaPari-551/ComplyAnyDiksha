package com.example.complyanydiksha.Fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.complyanydiksha.R
import com.example.complyanydiksha.activity.ProfileActivity
import com.example.complyanydiksha.activity.ProfileManagementActivity
import com.example.complyanydiksha.activity.SupportActivity
import de.hdodenhof.circleimageview.CircleImageView


class DashboardFragment : Fragment() {
    lateinit var toolbarProfileIcon: CircleImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
        toolbarProfileIcon = view.findViewById(R.id.toolbarProfileIcon)
        toolbarProfileIcon.setOnClickListener {
            Intent(activity as Context, ProfileManagementActivity::class.java).also {
                startActivity(it)

            }
        }
        return view
    }

}
