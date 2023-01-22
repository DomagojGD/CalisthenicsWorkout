package com.example.calisthenicsworkout.models.pullups

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface PullUpsDao {

    @Insert
    suspend fun insert(pullUpEntity: PullUpEntity)

    @Update
    suspend fun update(pullUpEntity: PullUpEntity)

    @Query("Select * from `pullUps-table` where id=:id ")
    fun fetchPullUpById(id:Int): Flow<PullUpEntity>

    @Query("Select * from `pullUps-table`")
    fun fetchAllPullUps(): Flow<List<PullUpEntity>>

    @Query("UPDATE `pullUps-table` SET progress=:progress WHERE id=:id")
    suspend fun updateProgress(id: Int, progress: Int)

    @Query("UPDATE `pullUps-table` SET levelOneChecked=:levelOneChecked WHERE id=:id")
    suspend fun updateLevelOneChecked(id: Int, levelOneChecked: Boolean)

    @Query("UPDATE `pullUps-table` SET levelTwoChecked=:levelTwoChecked WHERE id=:id")
    suspend fun updateLevelTwoChecked(id: Int, levelTwoChecked: Boolean)

    @Query("UPDATE `pullUps-table` SET levelThreeChecked=:levelThreeChecked WHERE id=:id")
    suspend fun updateLevelThreeChecked(id: Int, levelThreeChecked: Boolean)
}