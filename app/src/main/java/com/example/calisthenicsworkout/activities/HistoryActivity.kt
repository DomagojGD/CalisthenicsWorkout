package com.example.calisthenicsworkout.activities

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.calisthenicsworkout.CalendarAdapter
import com.example.calisthenicsworkout.R
import com.example.calisthenicsworkout.databinding.ActivityHistoryBinding
import com.example.calisthenicsworkout.models.DatabasesApp
import com.example.calisthenicsworkout.models.lastWorkouts.LastWorkoutAdapter
import com.example.calisthenicsworkout.models.lastWorkouts.LastWorkoutEntity
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.format.DateTimeFormatter

private var binding: ActivityHistoryBinding? = null

private var currentDate: LocalDate? = null

class HistoryActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O) // Android version needs to be at least version Android 8
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

        //get current local date
        currentDate = LocalDate.now()

        //set calendar in regards of current date
        setCalendar(currentDate!!)

        //get previous date
        binding!!.btnPreviousMonth.setOnClickListener {
            getPreviousMonth()
        }

        //get next date
        binding!!.btnNextMonth.setOnClickListener {

            getNextMonth()
        }

        setUpRecyclerView()
    }

    @RequiresApi(Build.VERSION_CODES.O) // Android version needs to be at least version Android 8
    // Get month and day of current date so text of tvMonthYear can be set
    private fun getTvMonthYearText(date: LocalDate): String{
        val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("MMMM yyyy")
        return date.format(formatter)
    }

    @RequiresApi(Build.VERSION_CODES.O) // Android version needs to be at least version Android 8
    private fun setCalendar(date: LocalDate){

        val daysOfMonthArray = ArrayList<String>()

        //get length of current month
        val lengthOfMonth = date.lengthOfMonth()

        //get first day of the month
        val firstOfMonth = date.withDayOfMonth(1)

        // get in which day of the week first day of the month is (for example sunday-> value is 7)
        val dayOfWeekOfTheFirstInTheMonth = firstOfMonth.dayOfWeek.value

        /* Set daysOfMonthArray which is going to be used for recyclerView. Calendar grid is 7x6, therefore 1 in 1..42.*/
        for(i in 1..42){

            /* if i is less than day of week of the first in month or is greater than month length plus
            * day of week of the first of the month (for example 31+1 = 32), then empty string will be added to the array.
            * This is because only days of the month will be shown in recyclerView.
            * Else the day will be added to the list.*/
            if(i < dayOfWeekOfTheFirstInTheMonth || i >= lengthOfMonth + dayOfWeekOfTheFirstInTheMonth){
                daysOfMonthArray.add("")
            }
            else{
                daysOfMonthArray.add((i + 1 - dayOfWeekOfTheFirstInTheMonth).toString())
            }
        }

        //set recyclerView adapter and layout manager
        val calendarAdapter = CalendarAdapter(daysOfMonthArray)
        binding!!.rvCalendar.adapter = calendarAdapter
        binding!!.rvCalendar.layoutManager = GridLayoutManager(this, 7)

        //set tvMonthYear text
        binding!!.tvMonthYear.text = getTvMonthYearText(date)
    }

    @RequiresApi(Build.VERSION_CODES.O) // Android version needs to be at least version Android 8
    private fun getPreviousMonth(){
        currentDate = currentDate!!.minusMonths(1)
        setCalendar(currentDate!!)
    }

    @RequiresApi(Build.VERSION_CODES.O) // Android version needs to be at least version Android 8
    private fun getNextMonth(){

        if(currentDate!! < LocalDate.now()) {
            currentDate = currentDate!!.plusMonths(1)
            setCalendar(currentDate!!)
        }
    }

    private fun setUpRecyclerView(){

        val lastWorkoutDao = (application as DatabasesApp).lastWorkoutsDB.lastWorkoutDao()

        lifecycleScope.launch {
            lastWorkoutDao.fetchAllLastWorkouts().collect{
                val lastWorkoutsList = ArrayList<LastWorkoutEntity>()

                if(it.size <= 3){
                    for(i in 0 until it.size){
                        lastWorkoutsList.add(it[i])
                    }
                }else{
                    for(i in 0 until 3){
                        lastWorkoutsList.add(it[i])
                    }
                }

                if(lastWorkoutsList.isNotEmpty()){

                    val adapter = LastWorkoutAdapter(lastWorkoutsList)
                    binding!!.rvLastWorkouts.adapter = adapter
                    binding!!.rvLastWorkouts.layoutManager = LinearLayoutManager(this@HistoryActivity)

                }
            }
        }
    }

    //TODO Dodaj još komentare i da je kalendar zelen ako je workout napravljen

    override fun onDestroy() {
        super.onDestroy()
        binding = null
        currentDate = null
    }
}