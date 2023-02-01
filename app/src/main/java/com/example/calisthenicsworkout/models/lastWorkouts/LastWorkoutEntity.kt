package com.example.calisthenicsworkout.models.lastWorkouts

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "lastWorkouts-table")
data class LastWorkoutEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String = "",
    val date: String = "",
    val duration: String = "",
    val numberOfSetsOne: Int = 0,
    val numberOfSetsTwo: Int = 0,
    val repsList: ArrayList<Int> = ArrayList()
): Serializable

/*TODO number of sets će biti val preko kojeg ćeš otvoriti WorkoutTrainingActivity s dovoljnim brojem setova za vježbe.
*  U repsList ćeš u WorkoutTrainingActivity spremiti sve repsove i onda ih dodati u model i recyclerView
*  Napravi bazu podataka i adapter s ovim entityem.*/