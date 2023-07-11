package uz.gita.to_do_jamik.utils.navigation

import kotlinx.coroutines.flow.MutableSharedFlow
import javax.inject.*

@Singleton
class NavigationDispatcher @Inject constructor() : AppNavigator, NavigationHandler {
    override val navigationBuffer = MutableSharedFlow<NavigationArgs>()

    private suspend fun navigate(args: NavigationArgs) {
        navigationBuffer.emit(args)
    }

    override suspend fun navigateTo(screen: AppScreen) = navigate {
        navigate(screen)
    }

    override suspend fun back() = navigate {
        navigateUp()
    }

}