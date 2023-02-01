package com.example.calisthenicsworkout.models.lastWorkouts

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface LastWorkoutDao {

    @Insert
    suspend fun insert(lastWorkoutEntity: LastWorkoutEntity)

    @Query("Select * from `lastWorkouts-table`")
    suspend fun fetchAllLastWorkouts(): Flow<List<LastWorkoutEntity>>

    @Query("Select * from `lastWorkouts-table` where id=:id")
    suspend fun fetchLastWorkoutById(id: Int): Flow<LastWorkoutEntity>
}