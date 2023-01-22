package com.example.calisthenicsworkout.models.bridges

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [BridgesEntity::class], version = 1)
abstract class BridgesDatabase: RoomDatabase() {

    abstract fun bridgesDao(): BridgesDao

    companion object{

        @Volatile
        private var INSTANCE: BridgesDatabase? = null

        fun getInstance(context: Context): BridgesDatabase {
            var instance = INSTANCE

            if(instance == null){
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    BridgesDatabase::class.java,
                    "bridges_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
            }
            return instance
        }
    }
}