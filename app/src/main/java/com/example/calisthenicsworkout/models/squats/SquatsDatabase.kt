package com.example.calisthenicsworkout.models.squats

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [SquatsEntity::class], version = 1)
abstract class SquatsDatabase: RoomDatabase() {

    abstract fun squatsDao(): SquatsDao

    companion object{

        @Volatile
        private var INSTANCE: SquatsDatabase? = null

        fun getInstance(context: Context): SquatsDatabase {
            var instance = INSTANCE

            if(instance == null){
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    SquatsDatabase::class.java,
                    "squats_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
            }
            return instance
        }
    }
}