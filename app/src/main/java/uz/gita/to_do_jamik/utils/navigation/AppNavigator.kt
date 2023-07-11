package uz.gita.to_do_jamik.utils.navigation

import androidx.navigation.NavDirections

typealias AppScreen = NavDirections

interface AppNavigator {

    suspend fun navigateTo(screen: AppScreen)
    suspend fun back()

}