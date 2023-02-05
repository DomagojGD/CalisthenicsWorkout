package com.example.calisthenicsworkout.models.lastWorkouts

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.Serializable
import java.util.ArrayList

@Entity(tableName = "lastWorkouts-table")
data class LastWorkoutEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String = "",
    val date: String = "",
    val duration: String = ""
): Serializable