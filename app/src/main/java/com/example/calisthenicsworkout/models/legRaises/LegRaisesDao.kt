package com.example.calisthenicsworkout.models.legRaises

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.calisthenicsworkout.models.pushups.PushUpEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LegRaisesDao {

    @Insert
    suspend fun insert(legRaisesEntity: LegRaisesEntity)

    @Update
    suspend fun update(legRaisesEntity: LegRaisesEntity)

    @Query("Select * from `legRaises-table` where id=:id ")
    fun fetchLegRaiseById(id:Int): Flow<LegRaisesEntity>

    @Query("Select * from `legRaises-table`")
    fun fetchAllLegRaises(): Flow<List<LegRaisesEntity>>

    @Query("UPDATE `legRaises-table` SET progress=:progress WHERE id=:id")
    suspend fun updateProgress(id: Int, progress: Int)

    @Query("UPDATE `legRaises-table` SET levelOneChecked=:levelOneChecked WHERE id=:id")
    suspend fun updateLevelOneChecked(id: Int, levelOneChecked: Boolean)

    @Query("UPDATE `legRaises-table` SET levelTwoChecked=:levelTwoChecked WHERE id=:id")
    suspend fun updateLevelTwoChecked(id: Int, levelTwoChecked: Boolean)

    @Query("UPDATE `legRaises-table` SET levelThreeChecked=:levelThreeChecked WHERE id=:id")
    suspend fun updateLevelThreeChecked(id: Int, levelThreeChecked: Boolean)
}