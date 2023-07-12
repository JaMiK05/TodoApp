package uz.gita.to_do_jamik.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.to_do_jamik.data.local.room.dao.TaskDao;
import uz.gita.to_do_jamik.data.local.room.database.TaskDatabase;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DatabaseModule_ProvideTaskDaoFactory implements Factory<TaskDao> {
  private final Provider<TaskDatabase> databseProvider;

  public DatabaseModule_ProvideTaskDaoFactory(Provider<TaskDatabase> databseProvider) {
    this.databseProvider = databseProvider;
  }

  @Override
  public TaskDao get() {
    return provideTaskDao(databseProvider.get());
  }

  public static DatabaseModule_ProvideTaskDaoFactory create(
      Provider<TaskDatabase> databseProvider) {
    return new DatabaseModule_ProvideTaskDaoFactory(databseProvider);
  }

  public static TaskDao provideTaskDao(TaskDatabase databse) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideTaskDao(databse));
  }
}
