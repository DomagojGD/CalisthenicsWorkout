package com.example.calisthenicsworkout.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calisthenicsworkout.R
import com.example.calisthenicsworkout.databinding.ActivityWorkoutsBinding

class WorkoutsActivity : AppCompatActivity() {

    private var binding: ActivityWorkoutsBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWorkoutsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        //Set toolbar with title and back button
        setSupportActionBar(binding!!.toolbarWorkouts)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "Workouts"
        }

        binding!!.toolbarWorkouts.setNavigationOnClickListener {
            onBackPressed()
        }

        //Start SolidStartProgramActivity
        binding!!.llSolidStartProgram.setOnClickListener {

            val intent = Intent(this, SolidStartProgramActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}