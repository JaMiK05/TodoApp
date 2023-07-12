package uz.gita.to_do_jamik.data.local.room.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.UUIDUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.flow.Flow;
import uz.gita.to_do_jamik.data.model.TaskData;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TaskData> __insertionAdapterOfTaskData;

  private final EntityDeletionOrUpdateAdapter<TaskData> __deletionAdapterOfTaskData;

  private final EntityDeletionOrUpdateAdapter<TaskData> __updateAdapterOfTaskData;

  public TaskDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTaskData = new EntityInsertionAdapter<TaskData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `tasks` (`id`,`title`,`description`,`date`,`time`,`ic_working`,`uuid`,`icFinish`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskData value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        if (value.getTime() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTime());
        }
        stmt.bindLong(6, value.isWorking());
        if (value.getUuid() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindBlob(7, UUIDUtil.convertUUIDToByte(value.getUuid()));
        }
        stmt.bindLong(8, value.getIcFinish());
      }
    };
    this.__deletionAdapterOfTaskData = new EntityDeletionOrUpdateAdapter<TaskData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `tasks` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskData value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfTaskData = new EntityDeletionOrUpdateAdapter<TaskData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `tasks` SET `id` = ?,`title` = ?,`description` = ?,`date` = ?,`time` = ?,`ic_working` = ?,`uuid` = ?,`icFinish` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskData value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        if (value.getTime() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTime());
        }
        stmt.bindLong(6, value.isWorking());
        if (value.getUuid() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindBlob(7, UUIDUtil.convertUUIDToByte(value.getUuid()));
        }
        stmt.bindLong(8, value.getIcFinish());
        stmt.bindLong(9, value.getId());
      }
    };
  }

  @Override
  public long insertTask(final TaskData task) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfTaskData.insertAndReturnId(task);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteTask(final TaskData task) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTaskData.handle(task);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateTask(final TaskData task) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTaskData.handle(task);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<TaskData>> getALLTasks() {
    final String _sql = "SELECT * FROM tasks ORDER BY CASE WHEN ic_working = 0 THEN 0 ELSE 1 END, ic_working ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tasks"}, new Callable<List<TaskData>>() {
      @Override
      public List<TaskData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsWorking = CursorUtil.getColumnIndexOrThrow(_cursor, "ic_working");
          final int _cursorIndexOfUuid = CursorUtil.getColumnIndexOrThrow(_cursor, "uuid");
          final int _cursorIndexOfIcFinish = CursorUtil.getColumnIndexOrThrow(_cursor, "icFinish");
          final List<TaskData> _result = new ArrayList<TaskData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TaskData _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpTime;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmpTime = null;
            } else {
              _tmpTime = _cursor.getString(_cursorIndexOfTime);
            }
            final int _tmpIsWorking;
            _tmpIsWorking = _cursor.getInt(_cursorIndexOfIsWorking);
            final UUID _tmpUuid;
            if (_cursor.isNull(_cursorIndexOfUuid)) {
              _tmpUuid = null;
            } else {
              _tmpUuid = UUIDUtil.convertByteToUUID(_cursor.getBlob(_cursorIndexOfUuid));
            }
            final int _tmpIcFinish;
            _tmpIcFinish = _cursor.getInt(_cursorIndexOfIcFinish);
            _item = new TaskData(_tmpId,_tmpTitle,_tmpDescription,_tmpDate,_tmpTime,_tmpIsWorking,_tmpUuid,_tmpIcFinish);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TaskData>> getCompletedTasks() {
    final String _sql = "SELECT * FROM tasks WHERE ic_working = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tasks"}, new Callable<List<TaskData>>() {
      @Override
      public List<TaskData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsWorking = CursorUtil.getColumnIndexOrThrow(_cursor, "ic_working");
          final int _cursorIndexOfUuid = CursorUtil.getColumnIndexOrThrow(_cursor, "uuid");
          final int _cursorIndexOfIcFinish = CursorUtil.getColumnIndexOrThrow(_cursor, "icFinish");
          final List<TaskData> _result = new ArrayList<TaskData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TaskData _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpTime;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmpTime = null;
            } else {
              _tmpTime = _cursor.getString(_cursorIndexOfTime);
            }
            final int _tmpIsWorking;
            _tmpIsWorking = _cursor.getInt(_cursorIndexOfIsWorking);
            final UUID _tmpUuid;
            if (_cursor.isNull(_cursorIndexOfUuid)) {
              _tmpUuid = null;
            } else {
              _tmpUuid = UUIDUtil.convertByteToUUID(_cursor.getBlob(_cursorIndexOfUuid));
            }
            final int _tmpIcFinish;
            _tmpIcFinish = _cursor.getInt(_cursorIndexOfIcFinish);
            _item = new TaskData(_tmpId,_tmpTitle,_tmpDescription,_tmpDate,_tmpTime,_tmpIsWorking,_tmpUuid,_tmpIcFinish);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TaskData>> getNotCompletedTasks() {
    final String _sql = "SELECT * FROM tasks WHERE ic_working = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tasks"}, new Callable<List<TaskData>>() {
      @Override
      public List<TaskData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsWorking = CursorUtil.getColumnIndexOrThrow(_cursor, "ic_working");
          final int _cursorIndexOfUuid = CursorUtil.getColumnIndexOrThrow(_cursor, "uuid");
          final int _cursorIndexOfIcFinish = CursorUtil.getColumnIndexOrThrow(_cursor, "icFinish");
          final List<TaskData> _result = new ArrayList<TaskData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TaskData _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpTime;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmpTime = null;
            } else {
              _tmpTime = _cursor.getString(_cursorIndexOfTime);
            }
            final int _tmpIsWorking;
            _tmpIsWorking = _cursor.getInt(_cursorIndexOfIsWorking);
            final UUID _tmpUuid;
            if (_cursor.isNull(_cursorIndexOfUuid)) {
              _tmpUuid = null;
            } else {
              _tmpUuid = UUIDUtil.convertByteToUUID(_cursor.getBlob(_cursorIndexOfUuid));
            }
            final int _tmpIcFinish;
            _tmpIcFinish = _cursor.getInt(_cursorIndexOfIcFinish);
            _item = new TaskData(_tmpId,_tmpTitle,_tmpDescription,_tmpDate,_tmpTime,_tmpIsWorking,_tmpUuid,_tmpIcFinish);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
