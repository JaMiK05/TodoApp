package uz.gita.to_do_jamik.presentation.screens.home.viewmodel;

/**
 * Created by Jamik on 7/7/2023 ot 6:17 PM
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u000eH&J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Luz/gita/to_do_jamik/presentation/screens/home/viewmodel/HomeViewModel;", "", "getNotCompList", "Landroidx/lifecycle/LiveData;", "", "Luz/gita/to_do_jamik/data/model/TaskData;", "getGetNotCompList", "()Landroidx/lifecycle/LiveData;", "progres", "", "getProgres", "tasks", "getTasks", "deleteTask", "", "task", "pos", "", "openAddTask", "openUpdateTask", "updateTask", "app_debug"})
public abstract interface HomeViewModel {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getTasks();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getGetNotCompList();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> getProgres();
    
    public abstract void openUpdateTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task);
    
    public abstract void openAddTask();
    
    public abstract void getTasks(int pos);
    
    public abstract void updateTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task);
    
    public abstract void deleteTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task);
}