package uz.gita.to_do_jamik.di;

/**
 * Created by Jamik on 7/7/2023 ot 6:38 PM
 */
@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\b"}, d2 = {"Luz/gita/to_do_jamik/di/NavigationModule;", "", "bindHandler", "Luz/gita/to_do_jamik/utils/navigation/NavigationHandler;", "impl", "Luz/gita/to_do_jamik/utils/navigation/NavigationDispatcher;", "bindNavigator", "Luz/gita/to_do_jamik/utils/navigation/AppNavigator;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface NavigationModule {
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.to_do_jamik.utils.navigation.AppNavigator bindNavigator(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.utils.navigation.NavigationDispatcher impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.to_do_jamik.utils.navigation.NavigationHandler bindHandler(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.utils.navigation.NavigationDispatcher impl);
}