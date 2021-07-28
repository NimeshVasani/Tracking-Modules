package com.example.runningapp.repositories

import com.example.runningapp.db.Run
import com.example.runningapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDAO: RunDAO
) {
    suspend fun insertRun(run: Run)=runDAO.insertRun(run)

    suspend fun deleteRun(run: Run)=runDAO.deleteRun(run)

    fun getAllRunSortedByDate()=runDAO.getAllRunSortedByDate()

    fun getAllRunSortedByDistance()=runDAO.getAllRunSortedByDistance()

    fun getAllRunSortedByyTimeInMillis()=runDAO.getAllRunSortedByTimeInMillis()

    fun getAllRunSortedByAvgSpeed()=runDAO.getAllRunSortedByAvgSpeed()

    fun getAllRunSortedByCaloriesBurned()=runDAO.getAllRunSortedByCaloriesBurned()

    fun getTotalAvgSpeed()=runDAO.getTotalAvgSpeed()

    fun getTotalCaloriesBurned()=runDAO.getTotalCaloriesBurned()

    fun getTotalDistance()=runDAO.getTotalDistance()

    fun getTotalTimesInMillis()=runDAO.getTotalTimesInMillis()

    fun getTotalId()=runDAO.getTotalId()

}