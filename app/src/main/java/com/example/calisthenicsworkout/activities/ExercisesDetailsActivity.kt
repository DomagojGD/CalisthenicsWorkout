package com.example.calisthenicsworkout.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.calisthenicsworkout.databinding.ActivityExercisesDetailsBinding
import com.example.calisthenicsworkout.models.DatabasesApp
import com.example.calisthenicsworkout.models.bridges.BridgesAdapter
import com.example.calisthenicsworkout.models.bridges.BridgesDao
import com.example.calisthenicsworkout.models.bridges.BridgesEntity
import com.example.calisthenicsworkout.models.bridges.BridgesList
import com.example.calisthenicsworkout.models.legRaises.LegRaisesAdapter
import com.example.calisthenicsworkout.models.legRaises.LegRaisesDao
import com.example.calisthenicsworkout.models.legRaises.LegRaisesEntity
import com.example.calisthenicsworkout.models.legRaises.LegRaisesList
import com.example.calisthenicsworkout.models.pullups.PullUpEntity
import com.example.calisthenicsworkout.models.pullups.PullUpsAdapter
import com.example.calisthenicsworkout.models.pullups.PullUpsDao
import com.example.calisthenicsworkout.models.pullups.PullUpsList
import com.example.calisthenicsworkout.models.pushups.PushUpDao
import com.example.calisthenicsworkout.models.pushups.PushUpEntity
import com.example.calisthenicsworkout.models.pushups.PushUpsAdapter
import com.example.calisthenicsworkout.models.pushups.PushUpsList
import com.example.calisthenicsworkout.models.squats.SquatsAdapter
import com.example.calisthenicsworkout.models.squats.SquatsDao
import com.example.calisthenicsworkout.models.squats.SquatsEntity
import com.example.calisthenicsworkout.models.squats.SquatsList
import kotlinx.coroutines.launch
import java.util.*

class ExercisesDetailsActivity : AppCompatActivity() {

    private var binding: ActivityExercisesDetailsBinding? = null

    private var intentExtra: String? = null

    companion object{
        var EXTRA_PUSH_UPS_DETAILS = "extra_push_ups_details"
        var EXTRA_LEG_RAISES_DETAILS = "extra_leg_raises_details"
        var EXTRA_SQUATS_DETAILS = "extra_squats_details"
        var EXTRA_PULL_UPS_DETAILS = "extra_pull_ups_details"
        var EXTRA_BRIDGES_DETAILS = "extra_bridges_details"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercisesDetailsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        //Get extra exercise details from ExerciseDescriptionActivity to determine which exercise details should be displayed
        if (intent.hasExtra(ExerciseDescriptionActivity.EXTRA_EXERCISE_DETAILS)) {

            intentExtra = intent.getStringExtra(ExerciseDescriptionActivity.EXTRA_EXERCISE_DETAILS)
        }

        setSupportActionBar(binding?.toolbarExerciseDetails)

        //Set toolbar title depending on extra exercise details from ExerciseDescriptionActivity
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

        binding!!.toolbarExerciseDetails.setNavigationOnClickListener {
            onBackPressed()
        }

        val pushUpsDao = (application as DatabasesApp).pushUpsDB.pushUpDao()
        val legRaisesDao = (application as DatabasesApp).legRaisesDB.legRaisesDao()
        val squatsDao = (application as DatabasesApp).squatsDB.squatsDao()
        val pullUpsDao = (application as DatabasesApp).pullUpsDB.pullUpsDao()
        val bridgesDao = (application as DatabasesApp).bridgesDB.bridgesDao()

        //Set up recycler view depending on the extra exercise details from ExerciseDescriptionActivity
        when(intentExtra){
            "push ups" ->{
                lifecycleScope.launch {
                    pushUpsDao.fetchAllPushUps().collect{
                        val pushUpsList = ArrayList(it)

                        setUpPushUpsRecyclerView(pushUpsList)
                    }
                }
            }
            "leg raises" ->{
                lifecycleScope.launch {
                    legRaisesDao.fetchAllLegRaises().collect{
                        val legRaisesList = ArrayList(it)

                        setUpLegRaisesRecyclerView(legRaisesList)
                    }
                }
            }
            "squats" ->{
                lifecycleScope.launch {
                    squatsDao.fetchAllSquats().collect{
                        val squatsList = ArrayList(it)

                        setUpSquatsRecyclerView(squatsList)
                    }
                }
            }
            "pull ups" ->{
                lifecycleScope.launch {
                    pullUpsDao.fetchAllPullUps().collect{
                        val pullUpsList = ArrayList(it)

                        setUpPullUpsRecyclerView(pullUpsList)
                    }
                }
            }
            "bridges" ->{
                lifecycleScope.launch {
                    bridgesDao.fetchAllBridges().collect{
                        val bridgesList = ArrayList(it)

                        setUpBridgesRecyclerView(bridgesList)
                    }
                }
            }
        }
    }

    //Set up push ups details recycler view
    private fun setUpPushUpsRecyclerView(pushUpsList: ArrayList<PushUpEntity>){

        val pushUpsAdapter = PushUpsAdapter(pushUpsList)

        binding!!.rvExerciseDetails.adapter = pushUpsAdapter
        binding!!.rvExerciseDetails.layoutManager = LinearLayoutManager(this)

        /*Set push ups adapter on item click listener and start ExerciseTutorialActivity.
        * Pass push up entity via EXTRA_PUSH_UPS_DETAILS. This way the next activity will be opened for push ups.*/
        pushUpsAdapter.setOnItemClickListener(object : PushUpsAdapter.OnItemClickListener{
            override fun onItemClick(position: Int, model: PushUpEntity) {
                val intent = Intent(this@ExercisesDetailsActivity, ExerciseTutorialActivity::class.java)
                intent.putExtra(EXTRA_PUSH_UPS_DETAILS, model)
                startActivity(intent)
            }
        })
    }

    //Set up leg raises details recycler view
    private fun setUpLegRaisesRecyclerView(legRaisesList: ArrayList<LegRaisesEntity>){

        val legRaisesAdapter = LegRaisesAdapter(legRaisesList)

        binding!!.rvExerciseDetails.adapter = legRaisesAdapter
        binding!!.rvExerciseDetails.layoutManager = LinearLayoutManager(this)

        /*Set leg raises adapter on item click listener and start ExerciseTutorialActivity.
        * Pass leg raises entity via EXTRA_LEG_RAISES_DETAILS. This way the next activity will be opened for leg raises.*/
        legRaisesAdapter.setOnItemClickListener(object : LegRaisesAdapter.OnItemClickListener{
            override fun onItemClick(position: Int, model: LegRaisesEntity) {
                val intent = Intent(this@ExercisesDetailsActivity, ExerciseTutorialActivity::class.java)
                intent.putExtra(EXTRA_LEG_RAISES_DETAILS, model)
                startActivity(intent)
            }
        })
    }

    //Set up squats details recycler view
    private fun setUpSquatsRecyclerView(squatsList: ArrayList<SquatsEntity>){

        val squatsAdapter = SquatsAdapter(squatsList)

        binding!!.rvExerciseDetails.adapter = squatsAdapter
        binding!!.rvExerciseDetails.layoutManager = LinearLayoutManager(this)

        /*Set squats adapter on item click listener and start ExerciseTutorialActivity.
        * Pass squats entity via EXTRA_SQUATS_DETAILS. This way the next activity will be opened for squats.*/
        squatsAdapter.setOnItemClickListener(object : SquatsAdapter.OnItemClickListener{
            override fun onItemClick(position: Int, model: SquatsEntity) {
                val intent = Intent(this@ExercisesDetailsActivity, ExerciseTutorialActivity::class.java)
                intent.putExtra(EXTRA_SQUATS_DETAILS, model)
                startActivity(intent)
            }
        })
    }

    //Set up pull ups details recycler view
    private fun setUpPullUpsRecyclerView(pullUpsList: ArrayList<PullUpEntity>){

        val pullUpsAdapter = PullUpsAdapter(pullUpsList)

        binding!!.rvExerciseDetails.adapter = pullUpsAdapter
        binding!!.rvExerciseDetails.layoutManager = LinearLayoutManager(this)

        /*Set pull ups adapter on item click listener and start ExerciseTutorialActivity.
        * Pass pull ups entity via EXTRA_SQUATS_DETAILS. This way the next activity will be opened for pull ups.*/
        pullUpsAdapter.setOnItemClickListener(object : PullUpsAdapter.OnItemClickListener{
            override fun onItemClick(position: Int, model: PullUpEntity) {
                val intent = Intent(this@ExercisesDetailsActivity, ExerciseTutorialActivity::class.java)
                intent.putExtra(EXTRA_PULL_UPS_DETAILS, model)
                startActivity(intent)
            }
        })
    }

    //Set up bridges details recycler view
    private fun setUpBridgesRecyclerView(bridgesList: ArrayList<BridgesEntity>){

        val bridgesAdapter = BridgesAdapter(bridgesList)

        binding!!.rvExerciseDetails.adapter = bridgesAdapter
        binding!!.rvExerciseDetails.layoutManager = LinearLayoutManager(this)

        /*Set bridges adapter on item click listener and start ExerciseTutorialActivity.
        * Pass bridges entity via EXTRA_SQUATS_DETAILS. This way the next activity will be opened for bridges.*/
        bridgesAdapter.setOnItemClickListener(object : BridgesAdapter.OnItemClickListener{
            override fun onItemClick(position: Int, model: BridgesEntity) {
                val intent = Intent(this@ExercisesDetailsActivity, ExerciseTutorialActivity::class.java)
                intent.putExtra(EXTRA_BRIDGES_DETAILS, model)
                startActivity(intent)
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}