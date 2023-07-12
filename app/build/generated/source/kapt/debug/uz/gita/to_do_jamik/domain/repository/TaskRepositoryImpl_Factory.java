package uz.gita.to_do_jamik.domain.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class TaskRepositoryImpl_Factory implements Factory<TaskRepositoryImpl> {
  private final Provider<TaskDao> daoProvider;

  public TaskRepositoryImpl_Factory(Provider<TaskDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public TaskRepositoryImpl get() {
    return newInstance(daoProvider.get());
  }

  public static TaskRepositoryImpl_Factory create(Provider<TaskDao> daoProvider) {
    return new TaskRepositoryImpl_Factory(daoProvider);
  }

  public static TaskRepositoryImpl newInstance(TaskDao dao) {
    return new TaskRepositoryImpl(dao);
  }
}
