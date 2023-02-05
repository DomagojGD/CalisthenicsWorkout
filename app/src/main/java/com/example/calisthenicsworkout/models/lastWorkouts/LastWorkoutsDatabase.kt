package com.example.calisthenicsworkout.models.lastWorkouts

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [LastWorkoutEntity::class], version = 1)
abstract class LastWorkoutsDatabase: RoomDatabase() {

    abstract fun lastWorkoutDao(): LastWorkoutDao

    companion object{

        @Volatile
        private var INSTANCE: LastWorkoutsDatabase? = null

        fun getInstance(context: Context): LastWorkoutsDatabase {
            var instance = INSTANCE

            if(instance == null){
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    LastWorkoutsDatabase::class.java,
                    "lastWorkouts_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
            }
            return instance
        }
    }
}