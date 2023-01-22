package com.example.calisthenicsworkout.models.squats

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface SquatsDao {

    @Insert
    suspend fun insert(squatsEntity: SquatsEntity)

    @Update
    suspend fun update(squatsEntity: SquatsEntity)

    @Query("Select * from `squats-table` where id=:id ")
    fun fetchSquatById(id:Int): Flow<SquatsEntity>

    @Query("Select * from `squats-table`")
    fun fetchAllSquats(): Flow<List<SquatsEntity>>

    @Query("UPDATE `squats-table` SET progress=:progress WHERE id=:id")
    suspend fun updateProgress(id: Int, progress: Int)

    @Query("UPDATE `squats-table` SET levelOneChecked=:levelOneChecked WHERE id=:id")
    suspend fun updateLevelOneChecked(id: Int, levelOneChecked: Boolean)

    @Query("UPDATE `squats-table` SET levelTwoChecked=:levelTwoChecked WHERE id=:id")
    suspend fun updateLevelTwoChecked(id: Int, levelTwoChecked: Boolean)

    @Query("UPDATE `squats-table` SET levelThreeChecked=:levelThreeChecked WHERE id=:id")
    suspend fun updateLevelThreeChecked(id: Int, levelThreeChecked: Boolean)
}