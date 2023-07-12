package uz.gita.to_do_jamik.presentation.screens.splash;

/**
 * Created by Jamik on 7/7/2023 ot 2:11 PM
 */
@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\""}, d2 = {"Luz/gita/to_do_jamik/presentation/screens/splash/AppSplashFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Luz/gita/to_do_jamik/databinding/FragmentSplashBinding;", "getBinding", "()Luz/gita/to_do_jamik/databinding/FragmentSplashBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "navigator", "Luz/gita/to_do_jamik/utils/navigation/AppNavigator;", "getNavigator", "()Luz/gita/to_do_jamik/utils/navigation/AppNavigator;", "setNavigator", "(Luz/gita/to_do_jamik/utils/navigation/AppNavigator;)V", "observer", "Landroidx/lifecycle/Observer;", "", "shared", "Landroid/content/SharedPreferences;", "getShared", "()Landroid/content/SharedPreferences;", "setShared", "(Landroid/content/SharedPreferences;)V", "viewModel", "Luz/gita/to_do_jamik/presentation/screens/splash/viewmodel/SplashViewModel;", "getViewModel", "()Luz/gita/to_do_jamik/presentation/screens/splash/viewmodel/SplashViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class AppSplashFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject
    public uz.gita.to_do_jamik.utils.navigation.AppNavigator navigator;
    @javax.inject.Inject
    public android.content.SharedPreferences shared;
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.Observer<java.lang.Boolean> observer = null;
    
    public AppSplashFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.to_do_jamik.utils.navigation.AppNavigator getNavigator() {
        return null;
    }
    
    public final void setNavigator(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.utils.navigation.AppNavigator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getShared() {
        return null;
    }
    
    public final void setShared(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences p0) {
    }
    
    private final uz.gita.to_do_jamik.databinding.FragmentSplashBinding getBinding() {
        return null;
    }
    
    private final uz.gita.to_do_jamik.presentation.screens.splash.viewmodel.SplashViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}