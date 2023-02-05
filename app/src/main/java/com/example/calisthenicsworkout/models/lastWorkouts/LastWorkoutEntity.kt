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
    val duration: String = "",
    val numberOfSetsOne: Int = 0,
    val numberOfSetsTwo: Int = 0,
    val repsList: ArrayList<String> = ArrayList()
): Serializable

/*Type converter for repsList to be stored in LastWorkoutsDatabase because Lists can't be stored in room database directly.
* This class needs to be mentioned in LastWorkoutsDatabase class in @TypeConverters.*/
class RepsListTypeConverter{

    @TypeConverter
    fun fromString(value: String): ArrayList<String>{

        val listType = object: TypeToken<ArrayList<String>>(){}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromArrayList(list: ArrayList<String>): String{
        return Gson().toJson(list)
    }
}

/*TODO number of sets će biti val preko kojeg ćeš otvoriti WorkoutTrainingActivity s dovoljnim brojem setova za vježbe.
*  U repsList ćeš u WorkoutTrainingActivity spremiti sve repsove i onda ih dodati u model i recyclerView
*  Napravi bazu podataka i adapter s ovim entityem.
*
* val repsList: ArrayList<Int> = ArrayList()*/