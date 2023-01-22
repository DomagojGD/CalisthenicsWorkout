package com.example.calisthenicsworkout.activities

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.example.calisthenicsworkout.R
import com.example.calisthenicsworkout.databinding.ActivityExerciseTutorialBinding
import com.example.calisthenicsworkout.databinding.DialogTutorialAndFormCuesTextBinding
import com.example.calisthenicsworkout.models.DatabasesApp
import com.example.calisthenicsworkout.models.bridges.BridgesEntity
import com.example.calisthenicsworkout.models.legRaises.LegRaisesEntity
import com.example.calisthenicsworkout.models.pullups.PullUpEntity
import com.example.calisthenicsworkout.models.pushups.PushUpEntity
import com.example.calisthenicsworkout.models.squats.SquatsEntity
import kotlinx.coroutines.launch

class ExerciseTutorialActivity : AppCompatActivity() {

    private var binding: ActivityExerciseTutorialBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseTutorialBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        when {
            intent.hasExtra(ExercisesDetailsActivity.EXTRA_PUSH_UPS_DETAILS) -> {
                setPushUpsTutorial()
            }
            intent.hasExtra(ExercisesDetailsActivity.EXTRA_LEG_RAISES_DETAILS) -> {
                setUpLegRaisesTutorial()
            }
            intent.hasExtra(ExercisesDetailsActivity.EXTRA_SQUATS_DETAILS) -> {
                setUpSquatsTutorial()
            }
            intent.hasExtra(ExercisesDetailsActivity.EXTRA_PULL_UPS_DETAILS) -> {
                setPullUpsTutorial()
            }
            intent.hasExtra(ExercisesDetailsActivity.EXTRA_BRIDGES_DETAILS) -> {
                setBridgesTutorial()
            }
        }
    }

    //Set ExerciseTutorialActivity for push ups
    private fun setPushUpsTutorial(){

        /* setTutorial methods are practically the same.
        * The only difference is which entity is being passed from ExtraDetailsActivity*/

        var pushUpEntity: PushUpEntity? = null

        val pushUpDao = (application as DatabasesApp).pushUpsDB.pushUpDao()

        //Get PushUpEntity from ExercisesDetailsActivity.EXTRA_PUSH_UPS_DETAILS
        if(intent.hasExtra(ExercisesDetailsActivity.EXTRA_PUSH_UPS_DETAILS)){
            pushUpEntity = intent.getSerializableExtra(ExercisesDetailsActivity.EXTRA_PUSH_UPS_DETAILS) as PushUpEntity
        }

        //Set toolbar with push ups title
        setSupportActionBar(binding?.toolbarExerciseTutorial)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            if(pushUpEntity != null){

                supportActionBar?.title = pushUpEntity.name
            }
        }

        binding!!.toolbarExerciseTutorial.setNavigationOnClickListener {
            onBackPressed()
        }

        //Set ExerciseTutorialActivity items
        if(pushUpEntity != null){

            binding!!.tvLevelOne.text = pushUpEntity.levelOne
            binding!!.tvLevelTwo.text = pushUpEntity.levelTwo
            binding!!.tvLevelThree.text = pushUpEntity.levelThree

            binding!!.cbLevelOne.isChecked = pushUpEntity.levelOneChecked
            binding!!.cbLevelTwo.isChecked = pushUpEntity.levelTwoChecked
            binding!!.cbLevelThree.isChecked = pushUpEntity.levelThreeChecked

            binding!!.tvLevelsText.text = pushUpEntity.levelText

            //Set tutorial gif
            Glide.with(this).load(pushUpEntity.tutorialVideo).into(binding!!.ivExerciseGIF)

            //Open tutorial dialog
            binding!!.flTutorial.setOnClickListener {

                val tutorialDialog = Dialog(this, R.style.Theme_Dialog)
                tutorialDialog.setCancelable(true)

                val binding = DialogTutorialAndFormCuesTextBinding.inflate(layoutInflater)
                tutorialDialog.setContentView(binding.root)

                binding.tvDialogTitle.text = "TUTORIAL"
                binding.tvDialogText.text = pushUpEntity.tutorialText

                tutorialDialog.show()
            }

            //Open form cues dialog
            binding!!.flFormCues.setOnClickListener {

                val formCuesDialog = Dialog(this, R.style.Theme_Dialog)
                formCuesDialog.setCancelable(true)

                val binding = DialogTutorialAndFormCuesTextBinding.inflate(layoutInflater)
                formCuesDialog.setContentView(binding.root)

                binding.tvDialogTitle.text = "FORM CUES"
                binding.tvDialogText.text = pushUpEntity.formCues

                formCuesDialog.show()
            }

            var pushUpProgress = pushUpEntity.progress

            //Set exercise progress when clicking on check boxex
            binding!!.cbLevelOne.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        pushUpProgress += 33

                        lifecycleScope.launch {
                            pushUpDao.updateProgress(pushUpEntity.id, pushUpProgress)
                            pushUpDao.updateLevelOneChecked(pushUpEntity.id, true)
                        }
                    }
                    false -> {

                        pushUpProgress -= 33

                        lifecycleScope.launch {
                            pushUpDao.updateProgress(pushUpEntity.id, pushUpProgress)
                            pushUpDao.updateLevelOneChecked(pushUpEntity.id, false)
                        }
                    }
                }
            }

            binding!!.cbLevelTwo.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        pushUpProgress += 34

                        lifecycleScope.launch {
                            pushUpDao.updateProgress(pushUpEntity.id, pushUpProgress)
                            pushUpDao.updateLevelTwoChecked(pushUpEntity.id, true)
                        }
                    }
                    false -> {

                        pushUpProgress -= 34

                        lifecycleScope.launch {
                            pushUpDao.updateProgress(pushUpEntity.id, pushUpProgress)
                            pushUpDao.updateLevelTwoChecked(pushUpEntity.id, false)
                        }
                    }
                }
            }

            binding!!.cbLevelThree.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        pushUpProgress += 33

                        lifecycleScope.launch {
                            pushUpDao.updateProgress(pushUpEntity.id, pushUpProgress)
                            pushUpDao.updateLevelThreeChecked(pushUpEntity.id, true)
                        }
                    }
                    false -> {

                        pushUpProgress -= 33

                        lifecycleScope.launch {
                            pushUpDao.updateProgress(pushUpEntity.id, pushUpProgress)
                            pushUpDao.updateLevelThreeChecked(pushUpEntity.id, false)
                        }
                    }
                }
            }
        }
    }

    //Set ExerciseTutorialActivity for leg raises
    private fun setUpLegRaisesTutorial(){

        var legRaisesEntity: LegRaisesEntity? = null

        val legRaisesDao = (application as DatabasesApp).legRaisesDB.legRaisesDao()

        if(intent.hasExtra(ExercisesDetailsActivity.EXTRA_LEG_RAISES_DETAILS)){
            legRaisesEntity = intent.getSerializableExtra(ExercisesDetailsActivity.EXTRA_LEG_RAISES_DETAILS) as LegRaisesEntity
        }

        setSupportActionBar(binding?.toolbarExerciseTutorial)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            if(legRaisesEntity != null){

                supportActionBar?.title = legRaisesEntity.name
            }
        }

        binding!!.toolbarExerciseTutorial.setNavigationOnClickListener {
            onBackPressed()
        }

        if(legRaisesEntity != null){

            binding!!.tvLevelOne.text = legRaisesEntity.levelOne
            binding!!.tvLevelTwo.text = legRaisesEntity.levelTwo
            binding!!.tvLevelThree.text = legRaisesEntity.levelThree

            binding!!.cbLevelOne.isChecked = legRaisesEntity.levelOneChecked
            binding!!.cbLevelTwo.isChecked = legRaisesEntity.levelTwoChecked
            binding!!.cbLevelThree.isChecked = legRaisesEntity.levelThreeChecked

            binding!!.tvLevelsText.text = legRaisesEntity.levelText

            Glide.with(this).load(legRaisesEntity.tutorialVideo).into(binding!!.ivExerciseGIF)

            binding!!.flTutorial.setOnClickListener {

                val tutorialDialog = Dialog(this, R.style.Theme_Dialog)
                tutorialDialog.setCancelable(true)

                val binding = DialogTutorialAndFormCuesTextBinding.inflate(layoutInflater)
                tutorialDialog.setContentView(binding.root)

                binding.tvDialogTitle.text = "TUTORIAL"
                binding.tvDialogText.text = legRaisesEntity.tutorialText

                tutorialDialog.show()
            }

            binding!!.flFormCues.setOnClickListener {

                val tutorialDialog = Dialog(this, R.style.Theme_Dialog)
                tutorialDialog.setCancelable(true)

                val binding = DialogTutorialAndFormCuesTextBinding.inflate(layoutInflater)
                tutorialDialog.setContentView(binding.root)

                binding.tvDialogTitle.text = "FORM CUES"
                binding.tvDialogText.text = legRaisesEntity.formCues

                tutorialDialog.show()
            }

            var legRaisesProgress = legRaisesEntity.progress

            binding!!.cbLevelOne.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        legRaisesProgress += 33

                        lifecycleScope.launch {
                            legRaisesDao.updateProgress(legRaisesEntity.id, legRaisesProgress)
                            legRaisesDao.updateLevelOneChecked(legRaisesEntity.id, true)
                        }
                    }
                    false -> {

                        legRaisesProgress -= 33

                        lifecycleScope.launch {
                            legRaisesDao.updateProgress(legRaisesEntity.id, legRaisesProgress)
                            legRaisesDao.updateLevelOneChecked(legRaisesEntity.id, false)
                        }
                    }
                }
            }

            binding!!.cbLevelTwo.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        legRaisesProgress += 34

                        lifecycleScope.launch {
                            legRaisesDao.updateProgress(legRaisesEntity.id, legRaisesProgress)
                            legRaisesDao.updateLevelTwoChecked(legRaisesEntity.id, true)
                        }
                    }
                    false -> {

                        legRaisesProgress -= 34

                        lifecycleScope.launch {
                            legRaisesDao.updateProgress(legRaisesEntity.id, legRaisesProgress)
                            legRaisesDao.updateLevelTwoChecked(legRaisesEntity.id, false)
                        }
                    }
                }
            }

            binding!!.cbLevelThree.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        legRaisesProgress += 33

                        lifecycleScope.launch {
                            legRaisesDao.updateProgress(legRaisesEntity.id, legRaisesProgress)
                            legRaisesDao.updateLevelThreeChecked(legRaisesEntity.id, true)
                        }
                    }
                    false -> {

                        legRaisesProgress -= 33

                        lifecycleScope.launch {
                            legRaisesDao.updateProgress(legRaisesEntity.id, legRaisesProgress)
                            legRaisesDao.updateLevelThreeChecked(legRaisesEntity.id, false)
                        }
                    }
                }
            }
        }
    }

    //Set ExerciseTutorialActivity for squats
    private fun setUpSquatsTutorial(){

        var squatsEntity: SquatsEntity? = null

        val squatsDao = (application as DatabasesApp).squatsDB.squatsDao()

        if(intent.hasExtra(ExercisesDetailsActivity.EXTRA_SQUATS_DETAILS)){
            squatsEntity = intent.getSerializableExtra(ExercisesDetailsActivity.EXTRA_SQUATS_DETAILS) as SquatsEntity
        }

        setSupportActionBar(binding?.toolbarExerciseTutorial)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            if(squatsEntity != null){

                supportActionBar?.title = squatsEntity.name
            }
        }

        binding!!.toolbarExerciseTutorial.setNavigationOnClickListener {
            onBackPressed()
        }

        if(squatsEntity != null){

            binding!!.tvLevelOne.text = squatsEntity.levelOne
            binding!!.tvLevelTwo.text = squatsEntity.levelTwo
            binding!!.tvLevelThree.text = squatsEntity.levelThree

            binding!!.cbLevelOne.isChecked = squatsEntity.levelOneChecked
            binding!!.cbLevelTwo.isChecked = squatsEntity.levelTwoChecked
            binding!!.cbLevelThree.isChecked = squatsEntity.levelThreeChecked

            binding!!.tvLevelsText.text = squatsEntity.levelText

            Glide.with(this).load(squatsEntity.tutorialVideo).into(binding!!.ivExerciseGIF)

            binding!!.flTutorial.setOnClickListener {

                val tutorialDialog = Dialog(this, R.style.Theme_Dialog)
                tutorialDialog.setCancelable(true)

                val binding = DialogTutorialAndFormCuesTextBinding.inflate(layoutInflater)
                tutorialDialog.setContentView(binding.root)

                binding.tvDialogTitle.text = "TUTORIAL"
                binding.tvDialogText.text = squatsEntity.tutorialText

                tutorialDialog.show()
            }

            binding!!.flFormCues.setOnClickListener {

                val tutorialDialog = Dialog(this, R.style.Theme_Dialog)
                tutorialDialog.setCancelable(true)

                val binding = DialogTutorialAndFormCuesTextBinding.inflate(layoutInflater)
                tutorialDialog.setContentView(binding.root)

                binding.tvDialogTitle.text = "FORM CUES"
                binding.tvDialogText.text = squatsEntity.formCues

                tutorialDialog.show()
            }

            var squatsProgress = squatsEntity.progress

            binding!!.cbLevelOne.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        squatsProgress += 33

                        lifecycleScope.launch {
                            squatsDao.updateProgress(squatsEntity.id, squatsProgress)
                            squatsDao.updateLevelOneChecked(squatsEntity.id, true)
                        }
                    }
                    false -> {

                        squatsProgress -= 33

                        lifecycleScope.launch {
                            squatsDao.updateProgress(squatsEntity.id, squatsProgress)
                            squatsDao.updateLevelOneChecked(squatsEntity.id, false)
                        }
                    }
                }
            }

            binding!!.cbLevelTwo.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        squatsProgress += 34

                        lifecycleScope.launch {
                            squatsDao.updateProgress(squatsEntity.id, squatsProgress)
                            squatsDao.updateLevelTwoChecked(squatsEntity.id, true)
                        }
                    }
                    false -> {

                        squatsProgress -= 34

                        lifecycleScope.launch {
                            squatsDao.updateProgress(squatsEntity.id, squatsProgress)
                            squatsDao.updateLevelTwoChecked(squatsEntity.id, false)
                        }
                    }
                }
            }

            binding!!.cbLevelThree.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        squatsProgress += 33

                        lifecycleScope.launch {
                            squatsDao.updateProgress(squatsEntity.id, squatsProgress)
                            squatsDao.updateLevelThreeChecked(squatsEntity.id, true)
                        }
                    }
                    false -> {

                        squatsProgress -= 33

                        lifecycleScope.launch {
                            squatsDao.updateProgress(squatsEntity.id, squatsProgress)
                            squatsDao.updateLevelThreeChecked(squatsEntity.id, false)
                        }
                    }
                }
            }
        }
    }

    //Set ExerciseTutorialActivity for pull ups
    private fun setPullUpsTutorial(){

        var pullUpEntity: PullUpEntity? = null

        val pullUpDao = (application as DatabasesApp).pullUpsDB.pullUpsDao()

        if(intent.hasExtra(ExercisesDetailsActivity.EXTRA_PULL_UPS_DETAILS)){
            pullUpEntity = intent.getSerializableExtra(ExercisesDetailsActivity.EXTRA_PULL_UPS_DETAILS) as PullUpEntity
        }

        setSupportActionBar(binding?.toolbarExerciseTutorial)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            if(pullUpEntity != null){

                supportActionBar?.title = pullUpEntity.name
            }
        }

        binding!!.toolbarExerciseTutorial.setNavigationOnClickListener {
            onBackPressed()
        }

        if(pullUpEntity != null){

            binding!!.tvLevelOne.text = pullUpEntity.levelOne
            binding!!.tvLevelTwo.text = pullUpEntity.levelTwo
            binding!!.tvLevelThree.text = pullUpEntity.levelThree

            binding!!.cbLevelOne.isChecked = pullUpEntity.levelOneChecked
            binding!!.cbLevelTwo.isChecked = pullUpEntity.levelTwoChecked
            binding!!.cbLevelThree.isChecked = pullUpEntity.levelThreeChecked

            binding!!.tvLevelsText.text = pullUpEntity.levelText

            Glide.with(this).load(pullUpEntity.tutorialVideo).into(binding!!.ivExerciseGIF)

            binding!!.flTutorial.setOnClickListener {

                val tutorialDialog = Dialog(this, R.style.Theme_Dialog)
                tutorialDialog.setCancelable(true)

                val binding = DialogTutorialAndFormCuesTextBinding.inflate(layoutInflater)
                tutorialDialog.setContentView(binding.root)

                binding.tvDialogTitle.text = "TUTORIAL"
                binding.tvDialogText.text = pullUpEntity.tutorialText

                tutorialDialog.show()
            }

            binding!!.flFormCues.setOnClickListener {

                val tutorialDialog = Dialog(this, R.style.Theme_Dialog)
                tutorialDialog.setCancelable(true)

                val binding = DialogTutorialAndFormCuesTextBinding.inflate(layoutInflater)
                tutorialDialog.setContentView(binding.root)

                binding.tvDialogTitle.text = "FORM CUES"
                binding.tvDialogText.text = pullUpEntity.formCues

                tutorialDialog.show()
            }

            var pullUpProgress = pullUpEntity.progress

            binding!!.cbLevelOne.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        pullUpProgress += 33

                        lifecycleScope.launch {
                            pullUpDao.updateProgress(pullUpEntity.id, pullUpProgress)
                            pullUpDao.updateLevelOneChecked(pullUpEntity.id, true)
                        }
                    }
                    false -> {

                        pullUpProgress -= 33

                        lifecycleScope.launch {
                            pullUpDao.updateProgress(pullUpEntity.id, pullUpProgress)
                            pullUpDao.updateLevelOneChecked(pullUpEntity.id, false)
                        }
                    }
                }
            }

            binding!!.cbLevelTwo.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        pullUpProgress += 34

                        lifecycleScope.launch {
                            pullUpDao.updateProgress(pullUpEntity.id, pullUpProgress)
                            pullUpDao.updateLevelTwoChecked(pullUpEntity.id, true)
                        }
                    }
                    false -> {

                        pullUpProgress -= 34

                        lifecycleScope.launch {
                            pullUpDao.updateProgress(pullUpEntity.id, pullUpProgress)
                            pullUpDao.updateLevelTwoChecked(pullUpEntity.id, false)
                        }
                    }
                }
            }

            binding!!.cbLevelThree.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        pullUpProgress += 33

                        lifecycleScope.launch {
                            pullUpDao.updateProgress(pullUpEntity.id, pullUpProgress)
                            pullUpDao.updateLevelThreeChecked(pullUpEntity.id, true)
                        }
                    }
                    false -> {

                        pullUpProgress -= 33

                        lifecycleScope.launch {
                            pullUpDao.updateProgress(pullUpEntity.id, pullUpProgress)
                            pullUpDao.updateLevelThreeChecked(pullUpEntity.id, false)
                        }
                    }
                }
            }
        }
    }

    //Set ExerciseTutorialActivity for bridges
    private fun setBridgesTutorial(){

        var bridgesEntity: BridgesEntity? = null

        val bridgesDao = (application as DatabasesApp).bridgesDB.bridgesDao()

        if(intent.hasExtra(ExercisesDetailsActivity.EXTRA_BRIDGES_DETAILS)){
            bridgesEntity = intent.getSerializableExtra(ExercisesDetailsActivity.EXTRA_BRIDGES_DETAILS) as BridgesEntity
        }

        setSupportActionBar(binding?.toolbarExerciseTutorial)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            if(bridgesEntity != null){

                supportActionBar?.title = bridgesEntity.name
            }
        }

        binding!!.toolbarExerciseTutorial.setNavigationOnClickListener {
            onBackPressed()
        }

        if(bridgesEntity != null){

            binding!!.tvLevelOne.text = bridgesEntity.levelOne
            binding!!.tvLevelTwo.text = bridgesEntity.levelTwo
            binding!!.tvLevelThree.text = bridgesEntity.levelThree

            binding!!.cbLevelOne.isChecked = bridgesEntity.levelOneChecked
            binding!!.cbLevelTwo.isChecked = bridgesEntity.levelTwoChecked
            binding!!.cbLevelThree.isChecked = bridgesEntity.levelThreeChecked

            binding!!.tvLevelsText.text = bridgesEntity.levelText

            Glide.with(this).load(bridgesEntity.tutorialVideo).into(binding!!.ivExerciseGIF)

            binding!!.flTutorial.setOnClickListener {

                val tutorialDialog = Dialog(this, R.style.Theme_Dialog)
                tutorialDialog.setCancelable(true)

                val binding = DialogTutorialAndFormCuesTextBinding.inflate(layoutInflater)
                tutorialDialog.setContentView(binding.root)

                binding.tvDialogTitle.text = "TUTORIAL"
                binding.tvDialogText.text = bridgesEntity.tutorialText

                tutorialDialog.show()
            }

            binding!!.flFormCues.setOnClickListener {

                val tutorialDialog = Dialog(this, R.style.Theme_Dialog)
                tutorialDialog.setCancelable(true)

                val binding = DialogTutorialAndFormCuesTextBinding.inflate(layoutInflater)
                tutorialDialog.setContentView(binding.root)

                binding.tvDialogTitle.text = "FORM CUES"
                binding.tvDialogText.text = bridgesEntity.formCues

                tutorialDialog.show()
            }

            var bridgesProgress = bridgesEntity.progress

            binding!!.cbLevelOne.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        bridgesProgress += 33

                        lifecycleScope.launch {
                            bridgesDao.updateProgress(bridgesEntity.id, bridgesProgress)
                            bridgesDao.updateLevelOneChecked(bridgesEntity.id, true)
                        }
                    }
                    false -> {

                        bridgesProgress -= 33

                        lifecycleScope.launch {
                            bridgesDao.updateProgress(bridgesEntity.id, bridgesProgress)
                            bridgesDao.updateLevelOneChecked(bridgesEntity.id, false)
                        }
                    }
                }
            }

            binding!!.cbLevelTwo.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        bridgesProgress += 34

                        lifecycleScope.launch {
                            bridgesDao.updateProgress(bridgesEntity.id, bridgesProgress)
                            bridgesDao.updateLevelTwoChecked(bridgesEntity.id, true)
                        }
                    }
                    false -> {

                        bridgesProgress -= 34

                        lifecycleScope.launch {
                            bridgesDao.updateProgress(bridgesEntity.id, bridgesProgress)
                            bridgesDao.updateLevelTwoChecked(bridgesEntity.id, false)
                        }
                    }
                }
            }

            binding!!.cbLevelThree.setOnCheckedChangeListener { _, isChecked ->

                when(isChecked){
                    true -> {

                        bridgesProgress += 33

                        lifecycleScope.launch {
                            bridgesDao.updateProgress(bridgesEntity.id, bridgesProgress)
                            bridgesDao.updateLevelThreeChecked(bridgesEntity.id, true)
                        }
                    }
                    false -> {

                        bridgesProgress -= 33

                        lifecycleScope.launch {
                            bridgesDao.updateProgress(bridgesEntity.id, bridgesProgress)
                            bridgesDao.updateLevelThreeChecked(bridgesEntity.id, false)
                        }
                    }
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}