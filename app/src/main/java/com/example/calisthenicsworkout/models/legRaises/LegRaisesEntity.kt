package com.example.calisthenicsworkout.models.legRaises

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "legRaises-table")
data class LegRaisesEntity(
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
