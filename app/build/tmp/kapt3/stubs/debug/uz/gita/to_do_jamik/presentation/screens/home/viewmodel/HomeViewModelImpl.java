package uz.gita.to_do_jamik.presentation.screens.home.viewmodel;

/**
 * Created by Jamik on 7/7/2023 ot 6:17 PM
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0016R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006\u001c"}, d2 = {"Luz/gita/to_do_jamik/presentation/screens/home/viewmodel/HomeViewModelImpl;", "Luz/gita/to_do_jamik/presentation/screens/home/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Luz/gita/to_do_jamik/domain/repository/TaskRepository;", "navigator", "Luz/gita/to_do_jamik/utils/navigation/AppNavigator;", "(Luz/gita/to_do_jamik/domain/repository/TaskRepository;Luz/gita/to_do_jamik/utils/navigation/AppNavigator;)V", "getNotCompList", "Landroidx/lifecycle/MutableLiveData;", "", "Luz/gita/to_do_jamik/data/model/TaskData;", "getGetNotCompList", "()Landroidx/lifecycle/MutableLiveData;", "progres", "", "kotlin.jvm.PlatformType", "getProgres", "tasks", "getTasks", "deleteTask", "", "task", "pos", "", "openAddTask", "openUpdateTask", "updateTask", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.to_do_jamik.presentation.screens.home.viewmodel.HomeViewModel {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.to_do_jamik.domain.repository.TaskRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final uz.gita.to_do_jamik.utils.navigation.AppNavigator navigator = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> tasks = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getNotCompList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> progres = null;
    
    @javax.inject.Inject
    public HomeViewModelImpl(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.domain.repository.TaskRepository repository, @org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.utils.navigation.AppNavigator navigator) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getTasks() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getGetNotCompList() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProgres() {
        return null;
    }
    
    @java.lang.Override
    public void openUpdateTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task) {
    }
    
    @java.lang.Override
    public void openAddTask() {
    }
    
    @java.lang.Override
    public void getTasks(int pos) {
    }
    
    @java.lang.Override
    public void updateTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task) {
    }
    
    @java.lang.Override
    public void deleteTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task) {
    }
}