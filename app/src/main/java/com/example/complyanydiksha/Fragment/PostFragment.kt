package com.example.complyanydiksha.Fragment

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.complyanydiksha.R
import com.example.complyanydiksha.activity.OverdueActivity
import com.example.complyanydiksha.activity.ThisMonthAcctivity
import com.example.complyanydiksha.activity.TodayActivity
import com.example.complyanydiksha.activity.UpcomingActivity
import java.util.*


class PostFragment : Fragment() {

    lateinit var FromdateTextView: TextView
    lateinit var TodateTextView: TextView

    lateinit var FromdateImageView: ImageView
    lateinit var TodateImageView: ImageView
    lateinit var overDue: TextView
    lateinit var today: TextView
    lateinit var thisMonth: TextView
    lateinit var upcoming: TextView
    lateinit var completed: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_post, container, false)
        overDue = view.findViewById(R.id.overDue)
        overDue.setOnClickListener {
            var intent = Intent(context, OverdueActivity::class.java)
            startActivity(intent)
        }


        today = view.findViewById(R.id.today)
        today.setOnClickListener {
            var intent = Intent(context, TodayActivity::class.java)
            startActivity(intent)
        }
            thisMonth = view.findViewById(R.id.this_month)
            thisMonth.setOnClickListener {
                var intent = Intent(context, ThisMonthAcctivity::class.java)
                startActivity(intent)
            }

            upcoming = view.findViewById(R.id.upcoming)
            upcoming.setOnClickListener {
                var intent = Intent(context, UpcomingActivity::class.java)
                startActivity(intent)
            }

        completed = view.findViewById(R.id.completed)
        completed.setOnClickListener {
            var intent = Intent(context, OverdueActivity::class.java)
            startActivity(intent)
        }


            FromdateTextView = view.findViewById(R.id.from_date_Text)
            TodateTextView = view.findViewById(R.id.to_date_Text)

            FromdateImageView = view.findViewById(R.id.from_date_ImageView)
            TodateImageView = view.findViewById(R.id.to_date_ImageView)


            val calendar: Calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val date = calendar.get(Calendar.DAY_OF_MONTH)

            FromdateTextView.text = "$date-${month + 1}-$year"

            TodateTextView.text = "$date-${month + 1}-$year"

            FromdateImageView.setOnClickListener {

                val datePickerDialog = activity?.let { it1 ->
                    DatePickerDialog(
                        it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                        { view, year, monthOfYear, dayOfMonth ->
                            FromdateTextView.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                        }, year, month, date
                    )
                }

                datePickerDialog?.show()
            }

            TodateImageView.setOnClickListener {

                val datePickerDialog = activity?.let { it1 ->
                    DatePickerDialog(
                        it1, R.style.DatePickerTheme, DatePickerDialog.OnDateSetListener
                        { view, year, monthOfYear, dayOfMonth ->
                            TodateTextView.text = "$dayOfMonth-${monthOfYear + 1}-$year"

                        }, year, month, date
                    )
                }

                datePickerDialog?.show()
            }



            return view
        }

    }
