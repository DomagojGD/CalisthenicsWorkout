package com.example.calisthenicsworkout.activities

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.MenuInflater
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.calisthenicsworkout.R
import com.example.calisthenicsworkout.databinding.ActivityWorkoutTrainingBinding
import com.example.calisthenicsworkout.databinding.DialogOnBackPressedWorkoutBinding
import com.example.calisthenicsworkout.databinding.DialogRestTimerBinding
import com.example.calisthenicsworkout.databinding.SetTimerDialogBinding
import com.example.calisthenicsworkout.models.workoutReps.NumberOfWorkoutRepsAdapter
import com.example.calisthenicsworkout.models.workoutReps.RepsModel
import java.math.RoundingMode

class WorkoutTrainingActivity : AppCompatActivity() {

    private var binding: ActivityWorkoutTrainingBinding? = null

    private var intentExtraTrainingDetails: String? = null

    private var exerciseName: String? = null

    private var restCountDownTimer: CountDownTimer? = null
    private var restTimerDuration: Long = 120_000

    private var restTimerFinishedPlayer: MediaPlayer? = null

    private var workoutTimeStart: Long? = null
    private var workoutTimeFinish: Long? = null

    companion object{
        var EXTRA_WORKOUT_DURATION_DETAILS = "extra_workout_duration_details"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWorkoutTrainingBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        workoutTimeStart = System.currentTimeMillis()

        if(intent.hasExtra(SolidStartProgramActivity.EXTRA_TRAINING_DETAILS)){

            intentExtraTrainingDetails = intent.getStringExtra(SolidStartProgramActivity.EXTRA_TRAINING_DETAILS)
        }

        setSupportActionBar(binding!!.toolbarTraining)

        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "Training"
        }

        binding!!.toolbarTraining.setNavigationOnClickListener {
            onBackPressed()
        }

        binding!!.flWorkoutExerciseMenuOne.setOnClickListener {

            when(intentExtraTrainingDetails){
                "day one" -> exerciseName = "push ups"
                "day two" -> exerciseName = "pull ups"
                "day three" -> exerciseName = "bridges"
            }

            showPopUpOptionsMenu(binding!!.ivWorkoutExerciseMenuOne)
        }

        if(intentExtraTrainingDetails != "day three"){

            when(intentExtraTrainingDetails){
                "day one" -> {
                    binding!!.tvWorkoutExerciseNameOne.text = "PUSH UPS"
                    binding!!.tvWorkoutExerciseNameTwo.text = "LEG RAISES"
                }
                "day two" -> {
                    binding!!.tvWorkoutExerciseNameOne.text = "PULL UPS"
                    binding!!.tvWorkoutExerciseNameTwo.text = "SQUATS"
                }
            }

            binding!!.flWorkoutExerciseMenuTwo.setOnClickListener {

                when(intentExtraTrainingDetails){
                    "day one" -> exerciseName = "leg raises"
                    "day two" -> exerciseName = "squats"
                }

                showPopUpOptionsMenu(binding!!.ivWorkoutExerciseMenuTwo)
            }
            setRecyclerViewTwo()
        }else{
            binding!!.tvWorkoutExerciseNameOne.text = "BRIDGES"
            binding!!.tvWorkoutExerciseNameTwo.visibility = View.GONE
            binding!!.flWorkoutExerciseMenuTwo.visibility = View.GONE
            binding!!.rvExercisesTwo.visibility = View.GONE
            binding!!.btnAddSetTwo.visibility = View.GONE
        }

        setRecyclerViewOne()

        binding!!.btnWorkoutFinish.setOnClickListener {

            workoutTimeFinish = System.currentTimeMillis()

            val workoutDurationInMillis = workoutTimeFinish!! - workoutTimeStart!!

            val intent = Intent(this, FinishedWorkoutActivity::class.java)
            intent.putExtra(EXTRA_WORKOUT_DURATION_DETAILS, workoutDurationInMillis.toString())

            startActivity(intent)

            finish()
        }
    }

    //Set pop up option menu for exercise details and to set rest timer duration
    private fun showPopUpOptionsMenu(view: View) {

        val customContext: Context = ContextThemeWrapper(this, R.style.PopupMenu)

        val popUpMenu = PopupMenu(
            customContext,
            view,
            Gravity.END
        )

        val inflater: MenuInflater = popUpMenu.menuInflater

        inflater.inflate(R.menu.exercise_options_menu, popUpMenu.menu)

        popUpMenu.show()

        popUpMenu.setOnMenuItemClickListener { menuItem ->

            /*When clicked on "Details", open ExercisesDetailsActivity
            with passed ExerciseDescriptionActivity.EXTRA_EXERCISE_DETAILS*/
            if(menuItem.title.toString() == "Details"){

                val intent = Intent(this, ExercisesDetailsActivity::class.java)

                when(exerciseName){
                    "push ups" ->{
                        intent.putExtra(ExerciseDescriptionActivity.EXTRA_EXERCISE_DETAILS, "push ups")
                    }
                    "leg raises" ->{
                        intent.putExtra(ExerciseDescriptionActivity.EXTRA_EXERCISE_DETAILS, "leg raises")
                    }
                    "pull ups" ->{
                        intent.putExtra(ExerciseDescriptionActivity.EXTRA_EXERCISE_DETAILS, "pull ups")
                    }
                    "squats" ->{
                        intent.putExtra(ExerciseDescriptionActivity.EXTRA_EXERCISE_DETAILS, "squats")
                    }
                    "bridges" ->{
                        intent.putExtra(ExerciseDescriptionActivity.EXTRA_EXERCISE_DETAILS, "bridges")
                    }
                }

                startActivity(intent)

                /*Open a dialog to set rest timer duration value*/
            }else if(menuItem.title.toString() == "Set Rest Timer"){

                val setTimerDialog = Dialog(this, R.style.Theme_Dialog)
                setTimerDialog.setCancelable(false)

                val binding = SetTimerDialogBinding.inflate(layoutInflater)

                setTimerDialog.setContentView(binding.root)

                setTimerDialog.show()

                binding.btnCancelSetTimerDialog.setOnClickListener {
                    setTimerDialog.dismiss()
                }

                //Submit new rest timer duration value
                binding.btnSubmitSetTimerDialog.setOnClickListener {

                    //Edit Texts can't be empty!
                    if(binding.etTimerMinutes.text.toString().isNotEmpty() &&
                        binding.etTimerSeconds.text.toString().isNotEmpty()){

                        var minutesValue = binding.etTimerMinutes.text.toString()
                        var secondsValue = binding.etTimerSeconds.text.toString()

                        //Minutes value can be between 0 and 20 minutes
                        if(minutesValue.toLong() > 20){
                            minutesValue = "20"
                        }else if(minutesValue.toLong() < 0){
                            minutesValue = "0"
                        }

                        //Seconds value can be between 0 and 60 seconds
                        if(secondsValue.toLong() > 60){
                            secondsValue = "60"
                        }else if(secondsValue.toLong() < 0){
                            secondsValue = "0"
                        }

                        //Set new rest timer duration value
                        restTimerDuration = (minutesValue.toLong() * 60 + secondsValue.toLong())*1000

                        setTimerDialog.dismiss()
                    }else{
                        Toast.makeText(this, "Minutes and seconds values can't be empty!", Toast.LENGTH_LONG).show()
                    }
                }
            }
            false
        }
    }

    //Set recycler view for exercise number one
    private fun setRecyclerViewOne(){

        val workoutRepsList = ArrayList<RepsModel>()

        //Set 3 sets with 10 reps by default
        for(i in 1..3){
            workoutRepsList.add(RepsModel(i,10))
        }

        val adapter = NumberOfWorkoutRepsAdapter(workoutRepsList)

        binding!!.rvExercisesOne.adapter = adapter
        binding!!.rvExercisesOne.layoutManager = LinearLayoutManager(this)

        //Add new set for exercise number one
        binding!!.btnAddSetOne.setOnClickListener {
            val lastRepsModelId = workoutRepsList[workoutRepsList.size-1].id
            workoutRepsList.add(RepsModel(lastRepsModelId+1,10))
            adapter.notifyItemInserted(workoutRepsList.size-1)
        }

        //Set on click listener to open a rest timer dialog
        adapter.setRestTimerClickListener(object : NumberOfWorkoutRepsAdapter.SetRestTimerClickListener{
            override fun onItemClick(model: RepsModel) {
                setRestTimerDialog()
            }
        })
    }

    //Set recycler view for exercise number two
    private fun setRecyclerViewTwo(){

        val workoutRepsList = ArrayList<RepsModel>()

        //Set 3 sets with 10 reps by default
        for(i in 1..3){
            workoutRepsList.add(RepsModel(i,10))
        }

        val adapter = NumberOfWorkoutRepsAdapter(workoutRepsList)

        binding!!.rvExercisesTwo.adapter = adapter
        binding!!.rvExercisesTwo.layoutManager = LinearLayoutManager(this)

        //Add new set for exercise number two
        binding!!.btnAddSetTwo.setOnClickListener {
            val lastRepsModelId = workoutRepsList[workoutRepsList.size-1].id
            workoutRepsList.add(RepsModel(lastRepsModelId+1,10))
            adapter.notifyItemInserted(workoutRepsList.size-1)
        }

        //Set on click listener to open a rest timer dialog
        adapter.setRestTimerClickListener(object : NumberOfWorkoutRepsAdapter.SetRestTimerClickListener{
            override fun onItemClick(model: RepsModel) {
                setRestTimerDialog()
            }
        })
    }

    //Open rest timer dialog
    private fun setRestTimerDialog(){

        val restTimerDialog = Dialog(this, R.style.Theme_Dialog)
        restTimerDialog.setCancelable(false)

        val binding = DialogRestTimerBinding.inflate(layoutInflater)
        restTimerDialog.setContentView(binding.root)

        //Close the dialog and stop sound player when skip button is clicked
        binding.btnSkipTimer.setOnClickListener {
            restTimerDialog.dismiss()
            if(restTimerFinishedPlayer != null){
                restTimerFinishedPlayer!!.stop()
            }
            if(restCountDownTimer != null){
                restCountDownTimer!!.cancel()
            }
        }

        restTimerDialog.show()

        //Set rest timer count down
        restCountDownTimer = object: CountDownTimer(restTimerDuration - 1000, 1000){
            override fun onTick(millisUntilFinished: Long) {

                val millisUntilFinishedToDouble = "${millisUntilFinished}.00".toDouble()
                //Get minutes value
                val minutesValue = (millisUntilFinished/60_000).toBigDecimal().setScale(1, RoundingMode.HALF_UP).toInt()

                //Set difference between minutes and seconds- this is a decimal number of type double
                val secondsDifference = millisUntilFinishedToDouble/60_000.0 - minutesValue.toDouble()

                //Get value of seconds
                val secondsValue = (secondsDifference*60).toBigDecimal().setScale(0, RoundingMode.HALF_UP).toInt()

                //If minutes value is single digit, then add a 0 at the beginning to make it double digit
                if(minutesValue.toString().length == 2){
                    binding.tvTimerMinutes.text = minutesValue.toString()
                }else{
                    binding.tvTimerMinutes.text = "0$minutesValue"
                }

                //If seconds value is single digit, then add a 0 at the beginning to make it double digit
                if(secondsValue.toString().length == 2){
                    binding.tvTimerSeconds.text = (secondsValue).toString()
                }else{
                    binding.tvTimerSeconds.text = "0$secondsValue"
                }

                //If 3 seconds of count down are left, play the "beep" sound for each of last 3 seconds
                if(minutesValue == 0){

                    if(secondsValue == 3 || secondsValue == 2 || secondsValue == 1){

                        try {
                            val soundURI = Uri.parse(
                                "android.resource://com.example.calisthenicsworkout/" + R.raw.three_seconds_sound)
                            restTimerFinishedPlayer = MediaPlayer.create(applicationContext, soundURI)
                            restTimerFinishedPlayer?.isLooping = false
                            restTimerFinishedPlayer?.start()

                        }catch (e: Exception){
                            e.printStackTrace()
                        }
                    }
                }

            }

            //Dismiss the dialog and stop the "beep" sound when count down is finished
            override fun onFinish() {
                restTimerDialog.dismiss()
                restTimerFinishedPlayer?.stop()
            }

        }.start()
    }

    //When back button is clicked, show warning dialog to ask the user if he is sure to cancel the workout
    override fun onBackPressed() {

        val warningDialog = Dialog(this, R.style.Theme_Dialog)
        warningDialog.setCancelable(false)

        val dialogBinding = DialogOnBackPressedWorkoutBinding.inflate(layoutInflater)

        warningDialog.setContentView(dialogBinding.root)

        dialogBinding.tvWarningMessage.text = "Are you sure you want to quit your exercise?"

        dialogBinding.btnYes.setOnClickListener {
            finish()
        }

        dialogBinding.btnNo.setOnClickListener {
            warningDialog.dismiss()
        }

        warningDialog.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null

        if(restCountDownTimer != null){
            restCountDownTimer?.cancel()
        }

        if(restTimerFinishedPlayer != null){
            restTimerFinishedPlayer!!.stop()
        }

        restTimerDuration = 120_000

        workoutTimeStart = null
        workoutTimeFinish = null
    }
}