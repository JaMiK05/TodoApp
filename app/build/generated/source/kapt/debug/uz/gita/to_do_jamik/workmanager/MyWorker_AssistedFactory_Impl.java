package uz.gita.to_do_jamik.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyWorker_AssistedFactory_Impl implements MyWorker_AssistedFactory {
  private final MyWorker_Factory delegateFactory;

  MyWorker_AssistedFactory_Impl(MyWorker_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public MyWorker create(Context context, WorkerParameters parameters) {
    return delegateFactory.get(context, parameters);
  }

  public static Provider<MyWorker_AssistedFactory> create(MyWorker_Factory delegateFactory) {
    return InstanceFactory.create(new MyWorker_AssistedFactory_Impl(delegateFactory));
  }
}
