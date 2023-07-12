package uz.gita.to_do_jamik.di;

import android.content.Context;
import androidx.work.WorkManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class WorkManagerInitializer_CreateFactory implements Factory<WorkManager> {
  private final Provider<Context> contextProvider;

  public WorkManagerInitializer_CreateFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public WorkManager get() {
    return proxyCreate(contextProvider.get());
  }

  public static WorkManagerInitializer_CreateFactory create(Provider<Context> contextProvider) {
    return new WorkManagerInitializer_CreateFactory(contextProvider);
  }

  public static WorkManager proxyCreate(Context context) {
    return Preconditions.checkNotNullFromProvides(WorkManagerInitializer.INSTANCE.create(context));
  }
}
