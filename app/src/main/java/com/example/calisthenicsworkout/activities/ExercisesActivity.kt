package com.example.calisthenicsworkout.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityOptionsCompat
import com.example.calisthenicsworkout.databinding.ActivityExercisesBinding

class ExercisesActivity : AppCompatActivity() {

    private var binding: ActivityExercisesBinding? = null

    companion object{
        var EXTRA_EXERCISE_DETAILS = "extra_exercise_details"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercisesBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        //set a toolbar
        setSupportActionBar(binding?.toolbarExercises)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "Exercises"
        } 

        binding!!.toolbarExercises.setNavigationOnClickListener {
            onBackPressed()
        }

        //start ExerciseDescriptionActivity for push ups with image translation animation
        binding!!.llPushUps.setOnClickListener {

            val intent = Intent(this, ExerciseDescriptionActivity::class.java)
            intent.putExtra(EXTRA_EXERCISE_DETAILS, "push ups")

            val ivPushUps = binding!!.ivPushUps

            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                val options: ActivityOptionsCompat =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                        this@ExercisesActivity, ivPushUps,
                        "transition_between_activities"
                    )

                startActivity(intent, options.toBundle())
            }else{
                startActivity(intent)
            }
        }

        //start ExerciseDescriptionActivity for leg raises with image translation animation
        binding!!.llLegRaises.setOnClickListener {

            val intent = Intent(this, ExerciseDescriptionActivity::class.java)
            intent.putExtra(EXTRA_EXERCISE_DETAILS, "leg raises")

            val ivLegRaises = binding!!.ivLegRaises

            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                val options: ActivityOptionsCompat =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                        this@ExercisesActivity, ivLegRaises,
                        "transition_between_activities"
                    )

                startActivity(intent, options.toBundle())
            }else{
                startActivity(intent)
            }
        }

        //start ExerciseDescriptionActivity for squats with image translation animation
        binding!!.llSquats.setOnClickListener {

            val intent = Intent(this, ExerciseDescriptionActivity::class.java)
            intent.putExtra(EXTRA_EXERCISE_DETAILS, "squats")

            val ivSquats = binding!!.ivSquats

            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                val options: ActivityOptionsCompat =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                        this@ExercisesActivity, ivSquats,
                        "transition_between_activities"
                    )

                startActivity(intent, options.toBundle())
            }else{
                startActivity(intent)
            }
        }

        //start ExerciseDescriptionActivity for pull ups with image translation animation
        binding!!.llPullUps.setOnClickListener {

            val intent = Intent(this, ExerciseDescriptionActivity::class.java)
            intent.putExtra(EXTRA_EXERCISE_DETAILS, "pull ups")

            val ivPullUps = binding!!.ivPullUps

            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                val options: ActivityOptionsCompat =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                        this@ExercisesActivity, ivPullUps,
                        "transition_between_activities"
                    )

                startActivity(intent, options.toBundle())
            }else{
                startActivity(intent)
            }
        }

        //start ExerciseDescriptionActivity for bridges with image translation animation
        binding!!.llBridges.setOnClickListener {

            val intent = Intent(this, ExerciseDescriptionActivity::class.java)
            intent.putExtra(EXTRA_EXERCISE_DETAILS, "bridges")

            val ivBridges = binding!!.ivBridges

            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                val options: ActivityOptionsCompat =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                        this@ExercisesActivity, ivBridges,
                        "transition_between_activities"
                    )

                startActivity(intent, options.toBundle())
            }else{
                startActivity(intent)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    override fun onBackPressed() {
        finish()
    }
}