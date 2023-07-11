package uz.gita.to_do_jamik.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.to_do_jamik.domain.repository.*
import javax.inject.Singleton

/**
 *   Created by Jamik on 7/6/2023 ot 7:07 PM
 **/

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @Singleton
    fun bindTaskRepository(impl: TaskRepositoryImpl): TaskRepository

}