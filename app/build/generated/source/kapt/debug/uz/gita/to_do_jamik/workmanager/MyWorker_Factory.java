package uz.gita.to_do_jamik.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.to_do_jamik.data.local.room.dao.TaskDao;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyWorker_Factory {
  private final Provider<TaskDao> daoProvider;

  public MyWorker_Factory(Provider<TaskDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  public MyWorker get(Context context, WorkerParameters workerParameters) {
    return newInstance(context, workerParameters, daoProvider.get());
  }

  public static MyWorker_Factory create(Provider<TaskDao> daoProvider) {
    return new MyWorker_Factory(daoProvider);
  }

  public static MyWorker newInstance(Context context, WorkerParameters workerParameters,
      TaskDao dao) {
    return new MyWorker(context, workerParameters, dao);
  }
}
