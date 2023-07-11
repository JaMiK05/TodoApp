package uz.gita.to_do_jamik.di

import android.content.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 *   Created by Jamik on 7/9/2023 ot 10:06 PM
 **/

@Module
@InstallIn(SingletonComponent::class)
object SharedPref {

    @Provides
    @Singleton
    fun bindSharedPreference(@ApplicationContext context: Context): SharedPreferences =
        context.getSharedPreferences("myShared", Context.MODE_PRIVATE)

}