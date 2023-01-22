package com.example.calisthenicsworkout.models.pushups

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [PushUpEntity::class], version = 1)
abstract class PushUpsDatabase: RoomDatabase() {

    abstract fun pushUpDao(): PushUpDao

    companion object{

        @Volatile
        private var INSTANCE: PushUpsDatabase? = null

        fun getInstance(context: Context): PushUpsDatabase{
            var instance = INSTANCE

            if(instance == null){
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    PushUpsDatabase::class.java,
                    "pushUps_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
            }
            return instance
        }
    }
}