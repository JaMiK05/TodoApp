package uz.gita.to_do_jamik.presentation.screens.addtask;

/**
 * Created by Jamik on 7/8/2023 ot 12:51 AM
 */
@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\'H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00110\u00110\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00190\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006("}, d2 = {"Luz/gita/to_do_jamik/presentation/screens/addtask/AddTaskFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Luz/gita/to_do_jamik/presentation/screens/addtask/AddTaskFragmentArgs;", "getArgs", "()Luz/gita/to_do_jamik/presentation/screens/addtask/AddTaskFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Luz/gita/to_do_jamik/databinding/FragmentAddTaskBinding;", "getBinding", "()Luz/gita/to_do_jamik/databinding/FragmentAddTaskBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "dateObserver", "Landroidx/lifecycle/Observer;", "", "desc", "myPermissionRequest", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "timeObserver", "titl", "uuid", "Ljava/util/UUID;", "viewmodel", "Luz/gita/to_do_jamik/presentation/screens/addtask/viewmodel/AddTaskViewModel;", "getViewmodel", "()Luz/gita/to_do_jamik/presentation/screens/addtask/viewmodel/AddTaskViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "requestPermission", "", "app_debug"})
public final class AddTaskFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewmodel$delegate = null;
    private java.util.UUID uuid;
    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String titl = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String desc = "";
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> myPermissionRequest = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.Observer<java.lang.String> dateObserver = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.Observer<java.lang.String> timeObserver = null;
    
    public AddTaskFragment() {
        super();
    }
    
    private final uz.gita.to_do_jamik.databinding.FragmentAddTaskBinding getBinding() {
        return null;
    }
    
    private final uz.gita.to_do_jamik.presentation.screens.addtask.viewmodel.AddTaskViewModel getViewmodel() {
        return null;
    }
    
    private final uz.gita.to_do_jamik.presentation.screens.addtask.AddTaskFragmentArgs getArgs() {
        return null;
    }
    
    private final boolean requestPermission() {
        return false;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}