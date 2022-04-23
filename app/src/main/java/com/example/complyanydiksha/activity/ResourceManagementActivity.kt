package com.example.complyanydiksha.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanydiksha.Model.ResourceModelClass
import com.example.complyanydiksha.R
import com.example.complyanydiksha.adapter.ResourceAdapter

class ResourceManagementActivity : AppCompatActivity() {
 //   lateinit var adapter: ResourceAdapter
  //  lateinit var recyclerView: RecyclerView
    lateinit var toolbarBackIcon: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource_management)

        //  recyclerView = findViewById(R.id.resource_management_recyclerview)
        toolbarBackIcon = findViewById(R.id.toolbarBackIcon)

        toolbarBackIcon.setOnClickListener {
            onBackPressed()
        }

        /*   // handle recyclerView
        val itemList : ArrayList<ResourceModelClass> = ArrayList()

        val data1 = ResourceModelClass("India", "Delhi", "Artical 112", "abc", "law", "123kb","today")
        itemList.add(data1)

        recyclerView.layoutManager = LinearLayoutManager(this )

        adapter = ResourceAdapter(this, itemList)

        recyclerView.adapter = adapter
    }*/
    }

        override fun onBackPressed() {
            finish()
        }
    }

