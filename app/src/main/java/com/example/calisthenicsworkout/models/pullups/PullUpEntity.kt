package com.example.calisthenicsworkout.models.pullups

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "pullUps-table")
data class PullUpEntity(
    @PrimaryKey
    val id: Int = 0,
    val name: String = "",
    val levelOne: String = "",
    val levelTwo: String = "",
    val levelThree: String = "",
    val levelOneChecked: Boolean = false,
    val levelTwoChecked: Boolean = false,
    val levelThreeChecked: Boolean = false,
    val levelText: String = "",
    val formCues: String = "",
    val tutorialText: String = "",
    val tutorialVideo: Int = 0,
    val progress: Int = 0
): Serializable
