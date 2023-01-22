package com.example.calisthenicsworkout.models.bridges

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.calisthenicsworkout.databinding.ItemExerciseBinding
import java.util.ArrayList

class BridgesAdapter(private val bridges: ArrayList<BridgesEntity>):
    RecyclerView.Adapter<BridgesAdapter.ViewHolder>() {

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

        holder.tvExerciseNumber.text = "#${bridges[position].id}"
        holder.tvExerciseName.text = bridges[position].name
        holder.pbExerciseProgress.progress = bridges[position].progress
        holder.tvExerciseProgress.text = bridges[position].progress.toString() + "%"

        holder.itemView.setOnClickListener {
            if(mListener != null){
                mListener!!.onItemClick(position, bridges[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return bridges.size
    }

    interface OnItemClickListener{
        fun onItemClick(position: Int, model: BridgesEntity)
    }

    private var mListener: OnItemClickListener? = null

    fun setOnItemClickListener(clickListener: OnItemClickListener){
        mListener = clickListener
    }
}