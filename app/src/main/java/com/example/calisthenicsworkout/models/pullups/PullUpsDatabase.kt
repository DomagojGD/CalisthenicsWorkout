package com.example.calisthenicsworkout.models.pullups

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [PullUpEntity::class], version = 1)
abstract class PullUpsDatabase: RoomDatabase() {

    abstract fun pullUpsDao(): PullUpsDao

    companion object{

        @Volatile
        private var INSTANCE: PullUpsDatabase? = null

        fun getInstance(context: Context): PullUpsDatabase {
            var instance = INSTANCE

            if(instance == null){
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    PullUpsDatabase::class.java,
                    "pullUps_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
            }
            return instance
        }
    }
}