package uz.gita.to_do_jamik.domain.repository;

/**
 * Created by Jamik on 7/6/2023 ot 5:20 PM
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Luz/gita/to_do_jamik/domain/repository/TaskRepository;", "", "deleteTask", "", "task", "Luz/gita/to_do_jamik/data/model/TaskData;", "getAllTasks", "Lkotlinx/coroutines/flow/Flow;", "", "getCompletedTask", "getInCompletedTask", "insertTask", "", "updateTask", "app_debug"})
public abstract interface TaskRepository {
    
    public abstract int insertTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task);
    
    public abstract void deleteTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task);
    
    public abstract void updateTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getAllTasks();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getCompletedTask();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getInCompletedTask();
}