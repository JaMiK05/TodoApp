package uz.gita.to_do_jamik.data.local.room.dao;

/**
 * Created by Jamik on 7/6/2023 ot 4:58 PM
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Luz/gita/to_do_jamik/data/local/room/dao/TaskDao;", "", "deleteTask", "", "task", "Luz/gita/to_do_jamik/data/model/TaskData;", "getALLTasks", "Lkotlinx/coroutines/flow/Flow;", "", "getCompletedTasks", "getNotCompletedTasks", "insertTask", "", "updateTask", "app_debug"})
@androidx.room.Dao
public abstract interface TaskDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract long insertTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task);
    
    @androidx.room.Delete
    public abstract void deleteTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task);
    
    @androidx.room.Update
    public abstract void updateTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task);
    
    @androidx.room.Query(value = "SELECT * FROM tasks ORDER BY CASE WHEN ic_working = 0 THEN 0 ELSE 1 END, ic_working ASC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getALLTasks();
    
    @androidx.room.Query(value = "SELECT * FROM tasks WHERE ic_working = 1")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getCompletedTasks();
    
    @androidx.room.Query(value = "SELECT * FROM tasks WHERE ic_working = 0")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getNotCompletedTasks();
}