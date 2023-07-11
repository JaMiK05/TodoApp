package uz.gita.to_do_jamik.di

import android.content.Context
import androidx.room.Room
import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import uz.gita.to_do_jamik.data.local.room.dao.TaskDao
import uz.gita.to_do_jamik.data.local.room.database.TaskDatabase
import javax.inject.Singleton

/**
 *   Created by Jamik on 7/6/2023 ot 5:14 PM
 **/
@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @[Provides Singleton]
    fun providesTaskDatabase(@ApplicationContext context: Context): TaskDatabase =
        Room.databaseBuilder(context = context, klass = TaskDatabase::class.java, "TaskDatabase")
            .allowMainThreadQueries()
            .build()

    @[Provides Singleton]
    fun provideTaskDao(databse: TaskDatabase): TaskDao = databse.getDao()
}