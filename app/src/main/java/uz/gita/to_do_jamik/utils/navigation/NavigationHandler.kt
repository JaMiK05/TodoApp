package uz.gita.to_do_jamik.utils.navigation

import androidx.navigation.NavController
import kotlinx.coroutines.flow.Flow

typealias  NavigationArgs = NavController.() -> Unit

interface NavigationHandler {
    val navigationBuffer: Flow<NavigationArgs>
}