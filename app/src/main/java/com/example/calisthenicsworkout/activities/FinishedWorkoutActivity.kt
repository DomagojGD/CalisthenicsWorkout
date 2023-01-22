package com.example.calisthenicsworkout.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calisthenicsworkout.databinding.ActivityFinishedWorkoutBinding
import java.math.RoundingMode

class FinishedWorkoutActivity : AppCompatActivity() {

    private var binding: ActivityFinishedWorkoutBinding? = null

    private var workoutDurationIntentExtra: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishedWorkoutBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding!!.tvCongratsText.text = "You just finished your workout! \n" +
                "Go to Exercises and note down your progress!!"

        //Get workout duration details from WorkoutTrainingActivity
        if(intent.hasExtra(WorkoutTrainingActivity.EXTRA_WORKOUT_DURATION_DETAILS)){
            workoutDurationIntentExtra = intent.getStringExtra(WorkoutTrainingActivity.EXTRA_WORKOUT_DURATION_DETAILS)
        }

        //Set workout duration in milliseconds
        val workoutDurationInMillis = workoutDurationIntentExtra?.toLong()
        //Get workout duration minutes value
        val workoutDurationMinutes = (workoutDurationInMillis!!/60_000).toBigDecimal().setScale(
            1, RoundingMode.HALF_UP).toInt()
        //Set difference between minutes and seconds- this is a decimal number of type double
        val secondsDifference = workoutDurationInMillis.toDouble()/60_000 - workoutDurationMinutes.toDouble()
        //Get workout duration seconds value
        val workoutDurationSeconds = (secondsDifference*60).toBigDecimal().setScale(0, RoundingMode.HALF_UP).toInt()

        //Set workout duration text
        binding!!.tvTimeDurationValue.text = "$workoutDurationMinutes min and $workoutDurationSeconds sec"

        //Start ExercisesActivity for user to note the progress
        binding!!.btnGoToExercises.setOnClickListener {
            val intent = Intent(this, ExercisesActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    //Stop back button from working
    override fun onBackPressed() {

    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}