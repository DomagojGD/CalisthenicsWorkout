package com.example.calisthenicsworkout.models.pullups

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.calisthenicsworkout.databinding.ItemExerciseBinding
import java.util.ArrayList

class PullUpsAdapter(private val pullUps: ArrayList<PullUpEntity>):
    RecyclerView.Adapter<PullUpsAdapter.ViewHolder>() {

    inner class ViewHolder(binding: ItemExerciseBinding): RecyclerView.ViewHolder(binding.root){

        val tvExerciseNumber = binding.tvExerciseNumber
        val tvExerciseName = binding.tvExerciseName
        val pbExerciseProgress = binding.pbExerciseProgress
        val tvExerciseProgress = binding.tvExerciseProgress
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        val binding = ItemExerciseBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tvExerciseNumber.text = "#${pullUps[position].id}"
        holder.tvExerciseName.text = pullUps[position].name
        holder.pbExerciseProgress.progress = pullUps[position].progress
        holder.tvExerciseProgress.text = pullUps[position].progress.toString() + "%"

        holder.itemView.setOnClickListener {
            if(mListener != null){
                mListener!!.onItemClick(position, pullUps[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return pullUps.size
    }

    interface OnItemClickListener{
        fun onItemClick(position: Int, model: PullUpEntity)
    }

    private var mListener: OnItemClickListener? = null

    fun setOnItemClickListener(clickListener: OnItemClickListener){
        mListener = clickListener
    }
}