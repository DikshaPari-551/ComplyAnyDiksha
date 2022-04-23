package com.example.complyanydiksha.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.complyanydiksha.Model.ModelOverdue
import com.example.complyanydiksha.Model.UpcomingModel
import com.example.complyanydiksha.R
import com.example.complyanydiksha.adapter.OverdueAdapter
import com.example.complyanydiksha.adapter.UpcomingAdapter

class UpcomingActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: UpcomingAdapter
    lateinit var backBtn: TextView

    var array: ArrayList<UpcomingModel> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upcoming)
        recyclerView = findViewById(R.id.recycler_Upcoming)
        backBtn = findViewById(R.id.backBtn)
        backBtn.setOnClickListener {
            finish()
        }

        var data1 = UpcomingModel(
            "IN-WOV28PIW",
            "harry-daily-everyday",
            "Payment",
            "02-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data2 = UpcomingModel(
            "IN-YUFWHNUH",
            "harry-daily-everyday",
            "Payment",
            "03-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data3 = UpcomingModel(
            "IN-HBNLGNTU",
            "harry-daily-everyday",
            "Payment",
            "05-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data4 = UpcomingModel(
            "IN-KR7YZQUA",
            "harry-daily-everyday",
            "Payment",
            "March-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data5 = UpcomingModel(
            "IN-Q409CCIY",
            "harry-daily-everyday",
            "Payment",
            "08-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data6 = UpcomingModel(
            "IN-9C39EPWJ",
            "harry-daily-everyday",
            "Payment",
            "09-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data7 = UpcomingModel(
            "IN-OIICTCGF",
            "upgrade plan2",
            "Meeting",
            "May-2021",
            "2021-05-07T00:00:00.000Z",
            ""
        )
        var data8 = UpcomingModel(
            "IN-GSDN2SYR",
            "harry-monthly",
            "Payment",
            "April-2021",
            "2021-05-07T00:00:00.000Z",
            ""
        )
        var data9 = UpcomingModel(
            "IN-DSRUALAC",
            "upgrade plan",
            "Return",
            "May-2021",
            "2021-05-10T00:00:00.000Z",
            ""
        )
        var data10 = UpcomingModel(
            "IN-CW87YBYO",
            "Timetakend",
            "Meeting",
            "April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data11 = UpcomingModel(
            "IN-VNVJY3Z1",
            "upgrade plan2",
            "Meeting",
            "June-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data12 = UpcomingModel(
            "IN-DFIXP7D",
            "upgrade plan2",
            "Return",
            "Jun-2021",
            "2021-06-10T00:00:00.000Z",
            ""
        )
        var data13 = UpcomingModel(
            "IN-WOV28PIW",
            "harry-daily-everyday",
            "Payment",
            "02-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data14 = UpcomingModel(
            "IN-YUFWHNUH",
            "harry-daily-everyday",
            "Payment",
            "03-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data15 = UpcomingModel(
            "IN-HBNLGNTU",
            "harry-daily-everyday",
            "Payment",
            "05-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data16 = UpcomingModel(
            "IN-KR7YZQUA",
            "harry-daily-everyday",
            "Payment",
            "March-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data17 = UpcomingModel(
            "IN-Q409CCIY",
            "harry-daily-everyday",
            "Payment",
            "08-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data18 = UpcomingModel(
            "IN-9C39EPWJ",
            "harry-daily-everyday",
            "Payment",
            "09-April-2021",
            "2021-04-02T00:00:00.000Z",
            ""
        )
        var data19 = UpcomingModel(
            "IN-OIICTCGF",
            "upgrade plan2",
            "Meeting",
            "May-2021",
            "2021-05-07T00:00:00.000Z",
            ""
        )

        var data20 = UpcomingModel(
            "IN-DSRUALAC",
            "upgrade plan",
            "Return",
            "May-2021",
            "2021-05-10T00:00:00.000Z",
            ""
        )

        array.add(data1)
        array.add(data2)
        array.add(data3)
        array.add(data4)
        array.add(data5)
        array.add(data6)
        array.add(data7)
        array.add(data8)
        array.add(data9)
        array.add(data10)
        array.add(data11)
        array.add(data12)
        array.add(data13)
        array.add(data14)
        array.add(data15)
        array.add(data16)
        array.add(data17)
        array.add(data18)
        array.add(data19)
        array.add(data20)


        // this creates a vertical layout Manager
        recyclerView.layoutManager = LinearLayoutManager(this)
        // This will pass the ArrayList to our Adapter
        adapter = UpcomingAdapter(this,array)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter

    }
    }

private fun <E> ArrayList<E>.add(element: UpcomingModel) {

}
