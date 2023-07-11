package uz.gita.to_do_jamik.data.local.room.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import uz.gita.to_do_jamik.data.model.TaskData

/**
 *   Created by Jamik on 7/6/2023 ot 4:58 PM
 **/

@Dao
interface TaskDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTask(task: TaskData) : Long

    @Delete
    fun deleteTask(task: TaskData)

    @Update
    fun updateTask(task: TaskData)

    //  @Query("SELECT * FROM tasks")
    @Query("SELECT * FROM tasks ORDER BY CASE WHEN ic_working = 0 THEN 0 ELSE 1 END, ic_working ASC")
    fun getALLTasks(): Flow<List<TaskData>>

    @Query("SELECT * FROM tasks WHERE ic_working = 1")
    fun getCompletedTasks(): Flow<List<TaskData>>

    @Query("SELECT * FROM tasks WHERE ic_working = 0")
    fun getNotCompletedTasks(): Flow<List<TaskData>>

}