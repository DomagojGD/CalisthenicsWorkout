package com.example.calisthenicsworkout.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.method.LinkMovementMethod
import android.view.animation.AnimationUtils
import androidx.lifecycle.lifecycleScope
import com.example.calisthenicsworkout.R
import com.example.calisthenicsworkout.databinding.ActivityMainBinding
import com.example.calisthenicsworkout.models.DatabasesApp
import com.example.calisthenicsworkout.models.bridges.BridgesDao
import com.example.calisthenicsworkout.models.bridges.BridgesEntity
import com.example.calisthenicsworkout.models.bridges.BridgesList
import com.example.calisthenicsworkout.models.legRaises.LegRaisesDao
import com.example.calisthenicsworkout.models.legRaises.LegRaisesEntity
import com.example.calisthenicsworkout.models.legRaises.LegRaisesList
import com.example.calisthenicsworkout.models.pullups.PullUpEntity
import com.example.calisthenicsworkout.models.pullups.PullUpsDao
import com.example.calisthenicsworkout.models.pullups.PullUpsList
import com.example.calisthenicsworkout.models.pushups.PushUpDao
import com.example.calisthenicsworkout.models.pushups.PushUpEntity
import com.example.calisthenicsworkout.models.pushups.PushUpsList
import com.example.calisthenicsworkout.models.squats.SquatsDao
import com.example.calisthenicsworkout.models.squats.SquatsEntity
import com.example.calisthenicsworkout.models.squats.SquatsList
import kotlinx.coroutines.launch
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    private var preDeterminedPushUpsList = PushUpsList.setPushUpsList()
    private var preDeterminedLegRaisesList = LegRaisesList.setLegRaisesList()
    private var preDeterminedSquatsList = SquatsList.setSquatsList()
    private var preDeterminedPullUpsList = PullUpsList.setPullUpsList()
    private var preDeterminedBridgesList = BridgesList.setBridgesList()

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        //Link to hybrid calisthenics web page
        binding!!.tvHyperlink.movementMethod = LinkMovementMethod.getInstance()

        val pushUpsDao = (application as DatabasesApp).pushUpsDB.pushUpDao()
        val legRaisesDao = (application as DatabasesApp).legRaisesDB.legRaisesDao()
        val squatsDao = (application as DatabasesApp).squatsDB.squatsDao()
        val pullUpsDao = (application as DatabasesApp).pullUpsDB.pullUpsDao()
        val bridgesDao = (application as DatabasesApp).bridgesDB.bridgesDao()

        //If push ups room database is empty, insert push ups in database
        lifecycleScope.launch {
            pushUpsDao.fetchAllPushUps().collect{
                val pushUpsList = ArrayList(it)

                if(pushUpsList.isEmpty()){
                    insertPushUpsIntoDatabase(pushUpsDao)
                }
            }
        }

        //If leg raises room database is empty, insert leg raises in database
        lifecycleScope.launch {
            legRaisesDao.fetchAllLegRaises().collect{
                val legRaisesList = ArrayList(it)

                if(legRaisesList.isEmpty()){
                    insertLegRaisesIntoDatabase(legRaisesDao)
                }
            }
        }

        //If squats room database is empty, insert squats in database
        lifecycleScope.launch {
            squatsDao.fetchAllSquats().collect{
                val squatsList = ArrayList(it)

                if(squatsList.isEmpty()){
                    insertSquatsIntoDatabase(squatsDao)
                }
            }
        }

        //If pull ups room database is empty, insert pull ups in database
        lifecycleScope.launch {
            pullUpsDao.fetchAllPullUps().collect{
                val pullUpsList = ArrayList(it)

                if(pullUpsList.isEmpty()){
                    insertPullUpsIntoDatabase(pullUpsDao)
                }
            }
        }

        //If bridges room database is empty, insert bridges in database
        lifecycleScope.launch {
            bridgesDao.fetchAllBridges().collect{
                val bridgesList = ArrayList(it)

                if(bridgesList.isEmpty()){
                    insertBridgesIntoDatabase(bridgesDao)
                }
            }
        }

        //set animations for buttons when they are clicked and open next activity
        val btnShineAnimation = AnimationUtils.loadAnimation(applicationContext,
            R.anim.btn_shine_anim)

        btnShineAnimation.duration = 500

        binding!!.flExercises.setOnClickListener {

            binding!!.shineExercises.startAnimation(btnShineAnimation)

            Handler().postDelayed({
                val intent = Intent(this, ExercisesActivity::class.java)
                startActivity(intent)
            },500)

        }

        binding!!.flWorkouts.setOnClickListener {

            binding!!.shineWorkouts.startAnimation(btnShineAnimation)

            Handler().postDelayed({
                val intent = Intent(this, WorkoutsActivity::class.java)
                startActivity(intent)
            },500)
        }
    }

    //This method is going to insert push ups form PushUpsList object into PushUps room database
    private fun insertPushUpsIntoDatabase(pushUpDao: PushUpDao){

        for(i in preDeterminedPushUpsList){

            lifecycleScope.launch {
                pushUpDao.insert(
                    PushUpEntity(id = i.id,
                    name = i.name,
                    levelOne = i.levelOne, levelTwo = i.levelTwo, levelThree = i.levelThree,
                    levelOneChecked = i.levelOneChecked,
                    levelTwoChecked = i.levelTwoChecked,
                    levelThreeChecked = i.levelThreeChecked, levelText = i.levelsText, formCues = i.formCues,
                    tutorialText = i.tutorialText, tutorialVideo = i.tutorialVideo, progress = i.progress)
                )
            }
        }
    }

    //This method is going to insert leg raises form LegRaises object into LegRaises room database
    private fun insertLegRaisesIntoDatabase(legRaisesDao: LegRaisesDao){

        for(i in preDeterminedLegRaisesList){

            lifecycleScope.launch {
                legRaisesDao.insert(
                    LegRaisesEntity(id = i.id,
                        name = i.name,
                        levelOne = i.levelOne, levelTwo = i.levelTwo, levelThree = i.levelThree,
                        levelOneChecked = i.levelOneChecked,
                        levelTwoChecked = i.levelTwoChecked,
                        levelThreeChecked = i.levelThreeChecked, levelText = i.levelsText, formCues = i.formCues,
                        tutorialText = i.tutorialText, tutorialVideo = i.tutorialVideo, progress = i.progress)
                )
            }
        }
    }

    //This method is going to insert squats form SquatsList object into Squats room database
    private fun insertSquatsIntoDatabase(squatsDao: SquatsDao){

        for(i in preDeterminedSquatsList){

            lifecycleScope.launch {
                squatsDao.insert(
                    SquatsEntity(id = i.id,
                        name = i.name,
                        levelOne = i.levelOne, levelTwo = i.levelTwo, levelThree = i.levelThree,
                        levelOneChecked = i.levelOneChecked,
                        levelTwoChecked = i.levelTwoChecked,
                        levelThreeChecked = i.levelThreeChecked, levelText = i.levelsText, formCues = i.formCues,
                        tutorialText = i.tutorialText, tutorialVideo = i.tutorialVideo, progress = i.progress)
                )
            }
        }
    }

    //This method is going to insert pull ups form PullUpsList object into PullUps room database
    private fun insertPullUpsIntoDatabase(pullUpsDao: PullUpsDao){

        for(i in preDeterminedPullUpsList){

            lifecycleScope.launch {
                pullUpsDao.insert(
                    PullUpEntity(id = i.id,
                        name = i.name,
                        levelOne = i.levelOne, levelTwo = i.levelTwo, levelThree = i.levelThree,
                        levelOneChecked = i.levelOneChecked,
                        levelTwoChecked = i.levelTwoChecked,
                        levelThreeChecked = i.levelThreeChecked, levelText = i.levelsText, formCues = i.formCues,
                        tutorialText = i.tutorialText, tutorialVideo = i.tutorialVideo, progress = i.progress)
                )
            }
        }
    }

    //This method is going to insert bridges form BridgesList object into Bridges room database
    private fun insertBridgesIntoDatabase(bridgesDao: BridgesDao){

        for(i in preDeterminedBridgesList){

            lifecycleScope.launch {
                bridgesDao.insert(
                    BridgesEntity(id = i.id,
                        name = i.name,
                        levelOne = i.levelOne, levelTwo = i.levelTwo, levelThree = i.levelThree,
                        levelOneChecked = i.levelOneChecked,
                        levelTwoChecked = i.levelTwoChecked,
                        levelThreeChecked = i.levelThreeChecked, levelText = i.levelsText, formCues = i.formCues,
                        tutorialText = i.tutorialText, tutorialVideo = i.tutorialVideo, progress = i.progress)
                )
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}