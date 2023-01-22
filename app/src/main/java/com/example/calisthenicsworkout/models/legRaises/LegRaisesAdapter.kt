package com.example.calisthenicsworkout.models.legRaises

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.calisthenicsworkout.databinding.ItemExerciseBinding
import java.util.ArrayList

class LegRaisesAdapter(private val legRaises: ArrayList<LegRaisesEntity>):
    RecyclerView.Adapter<LegRaisesAdapter.ViewHolder>() {

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

        holder.tvExerciseNumber.text = "#${legRaises[position].id}"
        holder.tvExerciseName.text = legRaises[position].name
        holder.pbExerciseProgress.progress = legRaises[position].progress
        holder.tvExerciseProgress.text = legRaises[position].progress.toString() + "%"

        holder.itemView.setOnClickListener {
            if(mListener != null){
                mListener!!.onItemClick(position, legRaises[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return legRaises.size
    }

    interface OnItemClickListener{
        fun onItemClick(position: Int, model: LegRaisesEntity)
    }

    private var mListener: OnItemClickListener? = null

    fun setOnItemClickListener(clickListener: OnItemClickListener){
        mListener = clickListener
    }
}