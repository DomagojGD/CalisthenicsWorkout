package com.example.calisthenicsworkout.models.pushups

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.example.calisthenicsworkout.databinding.ItemExerciseBinding
import java.util.*

class PushUpsAdapter(private val pushUps: ArrayList<PushUpEntity>):
    RecyclerView.Adapter<PushUpsAdapter.ViewHolder>() {

        inner class ViewHolder(binding: ItemExerciseBinding):RecyclerView.ViewHolder(binding.root){

            val tvExerciseNumber = binding.tvExerciseNumber
            val tvExerciseName = binding.tvExerciseName
            val pbExerciseProgress = binding.pbExerciseProgress
            val tvExerciseProgress = binding.tvExerciseProgress
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        val binding =ItemExerciseBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tvExerciseNumber.text = "#${pushUps[position].id}"
        holder.tvExerciseName.text = pushUps[position].name
        holder.pbExerciseProgress.progress = pushUps[position].progress
        holder.tvExerciseProgress.text = pushUps[position].progress.toString() + "%"

        holder.itemView.setOnClickListener {
            if(mListener != null){
                mListener!!.onItemClick(position, pushUps[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return pushUps.size
    }

    interface OnItemClickListener{
        fun onItemClick(position: Int, model: PushUpEntity)
    }

    private var mListener: OnItemClickListener? = null

    fun setOnItemClickListener(clickListener: OnItemClickListener){
        mListener = clickListener
    }
}