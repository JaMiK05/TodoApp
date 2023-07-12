package uz.gita.to_do_jamik.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.to_do_jamik.data.local.room.database.TaskDatabase;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvidesTaskDatabaseFactory implements Factory<TaskDatabase> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvidesTaskDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public TaskDatabase get() {
    return providesTaskDatabase(contextProvider.get());
  }

  public static DatabaseModule_ProvidesTaskDatabaseFactory create(
      Provider<Context> contextProvider) {
    return new DatabaseModule_ProvidesTaskDatabaseFactory(contextProvider);
  }

  public static TaskDatabase providesTaskDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.providesTaskDatabase(context));
  }
}
