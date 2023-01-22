package com.example.calisthenicsworkout.models.bridges

data class BridgesModel(
    val id: Int,
    val name: String,
    val levelOne: String,
    val levelTwo: String,
    val levelThree: String,
    val levelOneChecked: Boolean,
    val levelTwoChecked: Boolean,
    val levelThreeChecked: Boolean,
    val levelsText: String,
    val formCues: String,
    val tutorialText: String,
    val tutorialVideo: Int,
    val progress: Int,
)
