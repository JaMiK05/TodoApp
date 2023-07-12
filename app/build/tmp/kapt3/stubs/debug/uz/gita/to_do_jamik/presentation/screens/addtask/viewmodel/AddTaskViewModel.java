package uz.gita.to_do_jamik.presentation.screens.addtask.viewmodel;

/**
 * Created by Jamik on 7/8/2023 ot 8:46 AM
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Luz/gita/to_do_jamik/presentation/screens/addtask/viewmodel/AddTaskViewModel;", "", "dateLiveData", "Landroidx/lifecycle/LiveData;", "", "getDateLiveData", "()Landroidx/lifecycle/LiveData;", "timeLiveData", "getTimeLiveData", "backToScreen", "", "deleteTask", "task", "Luz/gita/to_do_jamik/data/model/TaskData;", "saveWork", "", "setDate", "date", "settime", "time", "app_debug"})
public abstract interface AddTaskViewModel {
    
    public abstract void backToScreen();
    
    public abstract void setDate(@org.jetbrains.annotations.NotNull
    java.lang.String date);
    
    public abstract void settime(@org.jetbrains.annotations.NotNull
    java.lang.String time);
    
    public abstract int saveWork(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task);
    
    public abstract void deleteTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task);
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.String> getDateLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.String> getTimeLiveData();
}