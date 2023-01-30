package com.example.calisthenicsworkout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calisthenicsworkout.R
import com.example.calisthenicsworkout.databinding.ActivityHistoryBinding

private var binding: ActivityHistoryBinding? = null

class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        //set a toolbar
        setSupportActionBar(binding?.toolbarHistory)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "History"
        }

        binding!!.toolbarHistory.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}