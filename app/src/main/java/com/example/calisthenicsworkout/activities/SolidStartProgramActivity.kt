package com.example.calisthenicsworkout.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calisthenicsworkout.R
import com.example.calisthenicsworkout.databinding.ActivitySolidStartProgramBinding

class SolidStartProgramActivity : AppCompatActivity() {

    private var binding: ActivitySolidStartProgramBinding? = null

    companion object{
        var EXTRA_TRAINING_DETAILS = "extra_training_details"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySolidStartProgramBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        //Set toolbar with title and back button
        setSupportActionBar(binding!!.toolbarSolidStartProgram)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "Solid Start Program"
        }

        binding!!.toolbarSolidStartProgram.setNavigationOnClickListener {
            onBackPressed()
        }

        //Start WorkoutTrainingActivity for day one
        binding!!.llDayOne.setOnClickListener {

            val intent = Intent(this, WorkoutTrainingActivity::class.java)
            intent.putExtra(EXTRA_TRAINING_DETAILS, "day one")
            startActivity(intent)
        }

        //Start WorkoutTrainingActivity for day two
        binding!!.llDayTwo.setOnClickListener {

            val intent = Intent(this, WorkoutTrainingActivity::class.java)
            intent.putExtra(EXTRA_TRAINING_DETAILS, "day two")
            startActivity(intent)
        }

        //Start WorkoutTrainingActivity for day three
        binding!!.llDayThree.setOnClickListener {

            val intent = Intent(this, WorkoutTrainingActivity::class.java)
            intent.putExtra(EXTRA_TRAINING_DETAILS, "day three")
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}