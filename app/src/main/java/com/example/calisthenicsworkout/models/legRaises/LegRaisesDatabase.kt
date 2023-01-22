package com.example.calisthenicsworkout.models.legRaises

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [LegRaisesEntity::class], version = 1)
abstract class LegRaisesDatabase: RoomDatabase() {

    abstract fun legRaisesDao(): LegRaisesDao

    companion object{

        @Volatile
        private var INSTANCE: LegRaisesDatabase? = null

        fun getInstance(context: Context): LegRaisesDatabase {
            var instance = INSTANCE

            if(instance == null){
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    LegRaisesDatabase::class.java,
                    "legRaises_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
            }
            return instance
        }
    }
}