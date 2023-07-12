package uz.gita.to_do_jamik.presentation.screens.home;

/**
 * Created by Jamik on 7/7/2023 ot 4:34 PM
 */
@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\u001a\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006)"}, d2 = {"Luz/gita/to_do_jamik/presentation/screens/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Luz/gita/to_do_jamik/databinding/FragmentHomeBinding;", "getBinding", "()Luz/gita/to_do_jamik/databinding/FragmentHomeBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "callback", "Landroidx/activity/OnBackPressedCallback;", "count", "", "dialogNotComp", "Luz/gita/to_do_jamik/presentation/dialog/NotCompletedDialog;", "myAdapter", "Luz/gita/to_do_jamik/presentation/adapter/TaskAdapter;", "getMyAdapter", "()Luz/gita/to_do_jamik/presentation/adapter/TaskAdapter;", "myAdapter$delegate", "Lkotlin/Lazy;", "notcompletedeDial", "Landroidx/lifecycle/Observer;", "", "Luz/gita/to_do_jamik/data/model/TaskData;", "progresObserver", "", "tasksObserver", "viewModel", "Luz/gita/to_do_jamik/presentation/screens/home/viewmodel/HomeViewModel;", "getViewModel", "()Luz/gita/to_do_jamik/presentation/screens/home/viewmodel/HomeViewModel;", "viewModel$delegate", "adapListener", "", "btnProvide", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private int count = 0;
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy myAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private uz.gita.to_do_jamik.presentation.dialog.NotCompletedDialog dialogNotComp;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.OnBackPressedCallback callback = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.Observer<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> tasksObserver = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.Observer<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> notcompletedeDial = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.Observer<java.lang.Boolean> progresObserver = null;
    
    public HomeFragment() {
        super();
    }
    
    private final uz.gita.to_do_jamik.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    private final uz.gita.to_do_jamik.presentation.adapter.TaskAdapter getMyAdapter() {
        return null;
    }
    
    private final uz.gita.to_do_jamik.presentation.screens.home.viewmodel.HomeViewModel getViewModel() {
        return null;
    }
    
    private final void adapListener() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void btnProvide() {
    }
}