package com.example.calisthenicsworkout.models.pushups

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface PushUpDao {

    @Insert
    suspend fun insert(pushUpEntity: PushUpEntity)

    @Update
    suspend fun update(pushUpEntity: PushUpEntity)

    @Query("Select * from `pushUps-table` where id=:id ")
    fun fetchPushUpById(id:Int): Flow<PushUpEntity>

    @Query("Select * from `pushUps-table`")
    fun fetchAllPushUps():Flow<List<PushUpEntity>>

    @Query("UPDATE `pushUps-table` SET progress=:progress WHERE id=:id")
    suspend fun updateProgress(id: Int, progress: Int)

    @Query("UPDATE `pushUps-table` SET levelOneChecked=:levelOneChecked WHERE id=:id")
    suspend fun updateLevelOneChecked(id: Int, levelOneChecked: Boolean)

    @Query("UPDATE `pushUps-table` SET levelTwoChecked=:levelTwoChecked WHERE id=:id")
    suspend fun updateLevelTwoChecked(id: Int, levelTwoChecked: Boolean)

    @Query("UPDATE `pushUps-table` SET levelThreeChecked=:levelThreeChecked WHERE id=:id")
    suspend fun updateLevelThreeChecked(id: Int, levelThreeChecked: Boolean)
}