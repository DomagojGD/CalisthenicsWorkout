package com.example.calisthenicsworkout.models.lastWorkouts

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface LastWorkoutDao {

    @Insert
    suspend fun insert(lastWorkoutEntity: LastWorkoutEntity)

    @Query("Select * from `lastworkouts-table` where id=:id ")
    fun fetchLastWorkoutById(id:Int): Flow<LastWorkoutEntity>

    @Query("Select * from `lastworkouts-table`")
    fun fetchAllLastWorkouts(): Flow<List<LastWorkoutEntity>>
}