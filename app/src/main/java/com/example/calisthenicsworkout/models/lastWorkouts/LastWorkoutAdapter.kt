package com.example.calisthenicsworkout.models.lastWorkouts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.calisthenicsworkout.databinding.ItemLastWorkoutBinding

class LastWorkoutAdapter(private val lastWorkoutsList: ArrayList<LastWorkoutEntity>):
    RecyclerView.Adapter<LastWorkoutAdapter.ViewHolder>() {

        inner class ViewHolder(binding: ItemLastWorkoutBinding): RecyclerView.ViewHolder(binding.root){

            val workoutName = binding.tvWorkoutName
            val workoutDate = binding.tvWorkoutDate
            val workoutDuration = binding.tvWorkoutDuration
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemLastWorkoutBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.workoutName.text = lastWorkoutsList[position].name
        holder.workoutDate.text = lastWorkoutsList[position].date
        holder.workoutDuration.text = lastWorkoutsList[position].repsListOne[0]
    }

    override fun getItemCount(): Int {
        return lastWorkoutsList.size
    }
}