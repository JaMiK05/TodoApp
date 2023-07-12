package uz.gita.to_do_jamik.domain.repository;

/**
 * Created by Jamik on 7/6/2023 ot 5:20 PM
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Luz/gita/to_do_jamik/domain/repository/TaskRepositoryImpl;", "Luz/gita/to_do_jamik/domain/repository/TaskRepository;", "dao", "Luz/gita/to_do_jamik/data/local/room/dao/TaskDao;", "(Luz/gita/to_do_jamik/data/local/room/dao/TaskDao;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "deleteTask", "", "task", "Luz/gita/to_do_jamik/data/model/TaskData;", "getAllTasks", "Lkotlinx/coroutines/flow/Flow;", "", "getCompletedTask", "getInCompletedTask", "insertTask", "", "updateTask", "app_debug"})
public final class TaskRepositoryImpl implements uz.gita.to_do_jamik.domain.repository.TaskRepository {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.to_do_jamik.data.local.room.dao.TaskDao dao = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    @javax.inject.Inject
    public TaskRepositoryImpl(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.local.room.dao.TaskDao dao) {
        super();
    }
    
    @java.lang.Override
    public int insertTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task) {
        return 0;
    }
    
    @java.lang.Override
    public void deleteTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task) {
    }
    
    @java.lang.Override
    public void updateTask(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getAllTasks() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getCompletedTask() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.to_do_jamik.data.model.TaskData>> getInCompletedTask() {
        return null;
    }
}