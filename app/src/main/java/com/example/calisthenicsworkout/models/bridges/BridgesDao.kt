package com.example.calisthenicsworkout.models.bridges

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface BridgesDao {

    @Insert
    suspend fun insert(bridgesEntity: BridgesEntity)

    @Update
    suspend fun update(bridgesEntity: BridgesEntity)

    @Query("Select * from `bridges-table` where id=:id ")
    fun fetchBridgeById(id:Int): Flow<BridgesEntity>

    @Query("Select * from `bridges-table`")
    fun fetchAllBridges(): Flow<List<BridgesEntity>>

    @Query("UPDATE `bridges-table` SET progress=:progress WHERE id=:id")
    suspend fun updateProgress(id: Int, progress: Int)

    @Query("UPDATE `bridges-table` SET levelOneChecked=:levelOneChecked WHERE id=:id")
    suspend fun updateLevelOneChecked(id: Int, levelOneChecked: Boolean)

    @Query("UPDATE `bridges-table` SET levelTwoChecked=:levelTwoChecked WHERE id=:id")
    suspend fun updateLevelTwoChecked(id: Int, levelTwoChecked: Boolean)

    @Query("UPDATE `bridges-table` SET levelThreeChecked=:levelThreeChecked WHERE id=:id")
    suspend fun updateLevelThreeChecked(id: Int, levelThreeChecked: Boolean)
}