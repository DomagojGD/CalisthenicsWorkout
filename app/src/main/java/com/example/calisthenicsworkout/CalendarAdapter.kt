package com.example.calisthenicsworkout

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.calisthenicsworkout.databinding.ItemDayInCalendarBinding
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList

class CalendarAdapter(private var daysOfMonth: ArrayList<String>, private var monthYearText: String,
                      private var lastWorkoutsDatesList: ArrayList<String>):
    RecyclerView.Adapter<CalendarAdapter.ViewHolder>() {

        inner class ViewHolder(binding: ItemDayInCalendarBinding): RecyclerView.ViewHolder(binding.root){
            val dayInCalendar = binding.tvDayInCalendar
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemDayInCalendarBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    @RequiresApi(Build.VERSION_CODES.O) // Android version needs to be at least version Android 8
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.dayInCalendar.text = daysOfMonth[position]

        val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

        for(i in lastWorkoutsDatesList){

            val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("MMMM yyyy")
            //Get index of the first '/'
            val indexOfFirstSlash = i.indexOfFirst { it == '/' }
            //Get index of the second '/'
            val indexOfSecondSlash = i.indexOfLast { it == '/' }
            //Get day value of the date
            val day = i.substring(0, indexOfFirstSlash).toInt()
            //Get month value of the date
            val month = i.substring(indexOfFirstSlash+1, indexOfSecondSlash).toInt()
            //Get year value of the date
            val year = i.substring(indexOfSecondSlash+1, i.length).toInt()

            //Get date value of the date in the list (i)
            val date = LocalDate.of(year, month, day)

            //Format the date to get month and year
            val formattedDate = date.format(formatter)

            //Change day in calendar background to green if conditions are met
            if(formattedDate == monthYearText && day.toString() == holder.dayInCalendar.text){
                holder.itemView.setBackgroundResource(R.drawable.day_in_calendar_circular_green_background)
            }
        }

        // if position is empty, set background to be the same as activity background, no circle
        if(daysOfMonth[position] == ""){
            holder.itemView.setBackgroundResource(R.color.dark_mode_gray_background)
        }
    }

    override fun getItemCount(): Int {
        return daysOfMonth.size
    }
}