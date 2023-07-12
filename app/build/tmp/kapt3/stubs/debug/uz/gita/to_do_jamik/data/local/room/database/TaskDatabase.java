package uz.gita.to_do_jamik.data.local.room.database;

/**
 * Created by Jamik on 7/6/2023 ot 5:11 PM
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Luz/gita/to_do_jamik/data/local/room/database/TaskDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getDao", "Luz/gita/to_do_jamik/data/local/room/dao/TaskDao;", "app_debug"})
@androidx.room.Database(entities = {uz.gita.to_do_jamik.data.model.TaskData.class}, version = 1, exportSchema = false, autoMigrations = {})
public abstract class TaskDatabase extends androidx.room.RoomDatabase {
    
    public TaskDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.to_do_jamik.data.local.room.dao.TaskDao getDao();
}