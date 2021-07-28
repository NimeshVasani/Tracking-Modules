package com.example.runningapp.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run:Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("DELETE  FROM RUNNING_TABLE WHERE id=:id")
    fun deleteByUserId(id: Int)

    @Query("SELECT * FROM RUNNING_TABLE ORDER BY timestamp DESC")
    fun getAllRunSortedByDate() : LiveData<List<Run>>

    @Query("SELECT * FROM RUNNING_TABLE ORDER BY avgSpeedInKMH ")
    fun getAllRunSortedByAvgSpeed() : LiveData<List<Run>>

    @Query("SELECT * FROM RUNNING_TABLE ORDER BY timeInMillis ")
    fun getAllRunSortedByTimeInMillis() : LiveData<List<Run>>

    @Query("SELECT * FROM RUNNING_TABLE ORDER BY  caloriesBurned")
    fun getAllRunSortedByCaloriesBurned() : LiveData<List<Run>>

    @Query("SELECT * FROM RUNNING_TABLE ORDER BY distanceInMeter")
    fun getAllRunSortedByDistance() : LiveData<List<Run>>

    @Query("SELECT SUM(timeInMillis) FROM RUNNING_TABLE O")
    fun getTotalTimesInMillis() : LiveData<Long>

    @Query("SELECT SUM(caloriesBurned) FROM RUNNING_TABLE O")
    fun getTotalCaloriesBurned() : LiveData<Int>

    @Query("SELECT SUM(distanceInMeter) FROM RUNNING_TABLE O")
    fun getTotalDistance() : LiveData<Int>

    @Query("SELECT AVG(avgSpeedInKMH) FROM RUNNING_TABLE O")
    fun getTotalAvgSpeed() : LiveData<Float>

    @Query("SELECT id FROM RUNNING_TABLE ORDER BY id DESC LIMIT 1")
    fun getTotalId():LiveData<Int>
}