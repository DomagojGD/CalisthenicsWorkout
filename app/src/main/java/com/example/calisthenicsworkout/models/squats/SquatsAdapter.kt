package com.example.calisthenicsworkout.models.squats

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.calisthenicsworkout.databinding.ItemExerciseBinding
import java.util.ArrayList

class SquatsAdapter(private val squats: ArrayList<SquatsEntity>):
    RecyclerView.Adapter<SquatsAdapter.ViewHolder>() {

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

        holder.tvExerciseNumber.text = "#${squats[position].id}"
        holder.tvExerciseName.text = squats[position].name
        holder.pbExerciseProgress.progress = squats[position].progress
        holder.tvExerciseProgress.text = squats[position].progress.toString() + "%"

        holder.itemView.setOnClickListener {
            if(mListener != null){
                mListener!!.onItemClick(position, squats[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return squats.size
    }

    interface OnItemClickListener{
        fun onItemClick(position: Int, model: SquatsEntity)
    }

    private var mListener: OnItemClickListener? = null

    fun setOnItemClickListener(clickListener: OnItemClickListener){
        mListener = clickListener
    }
}