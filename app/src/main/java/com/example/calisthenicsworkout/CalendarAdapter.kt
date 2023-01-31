package com.example.calisthenicsworkout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.calisthenicsworkout.databinding.ItemDayInCalendarBinding

class CalendarAdapter(private var daysOfMonth: ArrayList<String>):
    RecyclerView.Adapter<CalendarAdapter.ViewHolder>() {

        inner class ViewHolder(binding: ItemDayInCalendarBinding): RecyclerView.ViewHolder(binding.root){
            val dayInCalendar = binding.tvDayInCalendar
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemDayInCalendarBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.dayInCalendar.text = daysOfMonth[position]

        // if position is empty, set background to be the same as activity background, no circle
        if(daysOfMonth[position] == ""){
            holder.itemView.setBackgroundResource(R.color.dark_mode_gray_background)
        }
    }

    override fun getItemCount(): Int {
        return daysOfMonth.size
    }
}