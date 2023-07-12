package uz.gita.to_do_jamik.presentation.screens.addtask.viewmodel;

/**
 * Created by Jamik on 7/8/2023 ot 8:46 AM
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\nH\u0016R\"\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Luz/gita/to_do_jamik/presentation/screens/addtask/viewmodel/AddTaskViewModelImpl;", "Luz/gita/to_do_jamik/presentation/screens/addtask/viewmodel/AddTaskViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Luz/gita/to_do_jamik/domain/repository/TaskRepository;", "navigator", "Luz/gita/to_do_jamik/utils/navigation/AppNavigator;", "(Luz/gita/to_do_jamik/domain/repository/TaskRepository;Luz/gita/to_do_jamik/utils/navigation/AppNavigator;)V", "dateLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getDateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "timeLiveData", "getTimeLiveData", "backToScreen", "", "deleteTask", "task", "Luz/gita/to_do_jamik/data/model/TaskData;", "saveWork", "", "setDate", "date", "settime", "time", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class AddTaskViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.to_do_jamik.presentation.screens.addtask.viewmodel.AddTaskViewModel {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.to_do_jamik.domain.repository.TaskRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final uz.gita.to_do_jamik.utils.navigation.AppNavigator navigator = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> dateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> timeLiveData = null;
    
    @javax.inject.Inject
    public AddTaskViewModelImpl(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.domain.repository.TaskRepository repository, @org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.utils.navigation.AppNavigator navigator) {
        super();
    }
    
    @java.lang.Override
    public void backToScreen() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.lang.String> getDateLiveData() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.lang.String> getTimeLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void setDate(@org.jetbrains.annotations.NotNull
    java.lang.String date) {
    }
    
    @java.lang.Override
    public void settime(@org.jetbrains.annotations.NotNull
    java.lang.String time) {
    }
    
    @java.lang.Override
    public int saveWork(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task) {
        return 0;
    }
    
    @java.lang.Override
    public void deleteTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task) {
    }
}