package uz.gita.to_do_jamik.workmanager;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.processing.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(SingletonComponent.class)
@OriginatingElement(
    topLevelClass = MyWorker.class
)
public interface MyWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("uz.gita.to_do_jamik.workmanager.MyWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(MyWorker_AssistedFactory factory);
}
