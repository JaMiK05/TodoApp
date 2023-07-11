package uz.gita.to_do_jamik.data.local.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.gita.to_do_jamik.data.local.room.dao.TaskDao
import uz.gita.to_do_jamik.data.model.TaskData

/**
 *   Created by Jamik on 7/6/2023 ot 5:11 PM
 **/
@Database(entities = [TaskData::class], version = 1, exportSchema = false, autoMigrations = [])
abstract class TaskDatabase : RoomDatabase() {
    abstract fun getDao(): TaskDao
}