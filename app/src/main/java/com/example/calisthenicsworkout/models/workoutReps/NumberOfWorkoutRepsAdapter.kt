package com.example.calisthenicsworkout.models.workoutReps


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.calisthenicsworkout.R
import com.example.calisthenicsworkout.databinding.ItemWorkoutExerciseBinding

class NumberOfWorkoutRepsAdapter(private var repsItems: ArrayList<RepsModel>):
    RecyclerView.Adapter<NumberOfWorkoutRepsAdapter.ViewHolder>() {

        inner class ViewHolder(binding: ItemWorkoutExerciseBinding): RecyclerView.ViewHolder(binding.root){

            val exerciseId = binding.tvWorkoutExerciseNumber
            val numberOfReps = binding.etNumberOfReps
            val undoneExerciseCircle = binding.ivUncheckedCircle
            val doneExerciseCircle = binding.flExerciseDoneCheck
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        val binding = ItemWorkoutExerciseBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val context: Context = holder.itemView.context

        holder.exerciseId.text = repsItems[position].id.toString()
        holder.numberOfReps.setText(repsItems[position].numberOfReps.toString())

        //Set on click listener when empty circle is pressed. This is supposed to be done when the set is finished.
        holder.undoneExerciseCircle.setOnClickListener {

            holder.undoneExerciseCircle.visibility = View.INVISIBLE
            holder.doneExerciseCircle.visibility = View.VISIBLE
            holder.itemView.setBackgroundResource(R.drawable.item_recycler_view_exercise_done_background)
            holder.numberOfReps.setBackgroundResource(R.drawable.et_number_of_reps_exercise_done_background)

            //Set on click listener to open a rest timer dialog
            if(mListener != null){
                mListener!!.onItemClick(repsItems[position])
            }

        }

        holder.doneExerciseCircle.setOnClickListener {

            holder.undoneExerciseCircle.visibility = View.VISIBLE
            holder.doneExerciseCircle.visibility = View.INVISIBLE
            holder.itemView.setBackgroundResource(R.drawable.recycler_view_item_workout_set_background)
            holder.numberOfReps.setBackgroundResource(R.drawable.item_number_of_reps_background)
        }
    }

    override fun getItemCount(): Int {
        return repsItems.size
    }

    interface SetRestTimerClickListener{
        fun onItemClick(model: RepsModel)
    }

    private var mListener: SetRestTimerClickListener? = null

    fun setRestTimerClickListener(clickListener: SetRestTimerClickListener){
        mListener = clickListener
    }
}