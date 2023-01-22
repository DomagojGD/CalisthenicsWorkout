package com.example.calisthenicsworkout.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.example.calisthenicsworkout.R
import com.example.calisthenicsworkout.databinding.ActivityExerciseDescriptionBinding

class ExerciseDescriptionActivity : AppCompatActivity() {

    private var binding: ActivityExerciseDescriptionBinding? = null

    private var intentExtra: String? = null

    companion object{

        var EXTRA_EXERCISE_DETAILS = "extra_exercise_details"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseDescriptionBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarExerciseDescription)

        //Get extra exercise details from ExercisesActivity to determine which exercise description should be displayed
        if (intent.hasExtra(ExercisesActivity.EXTRA_EXERCISE_DETAILS)) {

            intentExtra = intent.getStringExtra(ExercisesActivity.EXTRA_EXERCISE_DETAILS)
        }

        //Set toolbar title depending on extra exercise details from ExerciseActivity
        if (supportActionBar != null) {

            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            if (intentExtra != null) {

                when (intentExtra) {
                    "push ups" -> supportActionBar?.title = "Push ups"
                    "leg raises" -> supportActionBar?.title = "Leg raises"
                    "squats" -> supportActionBar?.title = "Squats"
                    "pull ups" -> supportActionBar?.title = "Pull ups"
                    "bridges" -> supportActionBar?.title = "Bridges"
                }
            }
        }

        //Set ExerciseDescriptionActivity depending on extra exercise details from ExerciseActivity
        if (intentExtra != null) {
            when (intentExtra) {
                "push ups" -> {
                    binding!!.ivExercise.setImageResource(R.drawable.ic_push_ups)
                    binding!!.tvExerciseTitle.text = "PUSH UPS"
                    binding!!.tvExerciseDescription.text =
                        "Perhaps the most famous calisthenics exercise, " +
                                "this exercise has become a staple in almost every physical discipline. " +
                                "It wonderfully targets our pectorals, triceps, and shoulders, but engages almost every muscle in our body. " +
                                "Harness this fundamental movement!"
                }
                "leg raises" -> {
                    binding!!.ivExercise.setImageResource(R.drawable.ic_leg_raises)
                    binding!!.tvExerciseTitle.text = "LEG RAISES"
                    binding!!.tvExerciseDescription.text =
                        "Progressive leg raises may be some of the best dynamic core exercises in the world. " +
                                "Not only do these strengthen your abdomen, but they build powerful, mobile hip flexors as well. " +
                                "While leg raises are not as well-known as their sister—the situp—they are simpler to progress and build greater strength."
                }
                "squats" -> {
                    binding!!.ivExercise.setImageResource(R.drawable.ic_squats)
                    binding!!.tvExerciseTitle.text = "SQUATS"
                    binding!!.tvExerciseDescription.text =
                        "If there was ever a mantra all fitness enthusiasts could agree on, “don’t skip leg day” would surely be one of the top contenders. " +
                                "Our lower body is the seat of our power, strength, and athleticism. We must train it! " +
                                "Progressive squats work our entire lower body—targeting the quads, hamstrings, glutes, and calves!"
                }
                "pull ups" -> {
                    binding!!.ivExercise.setImageResource(R.drawable.ic_pull_ups)
                    binding!!.tvExerciseTitle.text = "PULL UPS"
                    binding!!.tvExerciseDescription.text =
                        "Pulling and climbing are some of the most fundamental human movements. " +
                                "Our ability to pull ourselves up has been optimized over millennia of human existence. " +
                                "Pull up variations give us a great opportunity to harness this power! These train your biceps, shoulders, and lats."
                }
                "bridges" -> {
                    binding!!.ivExercise.setImageResource(R.drawable.ic_bridges)
                    binding!!.tvExerciseTitle.text = "BRIDGES"
                    binding!!.tvExerciseDescription.text =
                        "Sometimes called the back bend or wheel pose, " +
                                "this exotic-looking exercise is often overlooked for flashier exercises. " +
                                "However, it’d be difficult to find a better exercise to train spinal mobility and reverse the effects of sitting. " +
                                "This incredible exercise strengthens our entire posterior chain and protects"
                }
            }

            binding!!.toolbarExerciseDescription.setNavigationOnClickListener {
                finishAfterTransition()
            }
        }

        //Start ExercisesDetailsActivity with extra exercise details to know which details should be displayed
        binding!!.flSeeDetails.setOnClickListener {

                val intent = Intent(this, ExercisesDetailsActivity::class.java)

                when (intentExtra) {
                    "push ups" -> {
                        intent.putExtra(EXTRA_EXERCISE_DETAILS, "push ups")
                    }
                    "leg raises" -> {
                        intent.putExtra(EXTRA_EXERCISE_DETAILS, "leg raises")
                    }
                    "squats" -> {
                        intent.putExtra(EXTRA_EXERCISE_DETAILS, "squats")
                    }
                    "pull ups" -> {
                        intent.putExtra(EXTRA_EXERCISE_DETAILS, "pull ups")
                    }
                    "bridges" -> {
                        intent.putExtra(EXTRA_EXERCISE_DETAILS, "bridges")
                    }
                }

                startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}