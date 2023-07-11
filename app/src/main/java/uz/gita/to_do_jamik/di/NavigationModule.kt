package uz.gita.to_do_jamik.di

import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.to_do_jamik.utils.navigation.*
import javax.inject.Singleton

/**
 *   Created by Jamik on 7/7/2023 ot 6:38 PM
 **/
@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {

    @Binds
    @Singleton
    fun bindNavigator(impl: NavigationDispatcher): AppNavigator


    @Binds
    @Singleton
    fun bindHandler(impl: NavigationDispatcher): NavigationHandler

}