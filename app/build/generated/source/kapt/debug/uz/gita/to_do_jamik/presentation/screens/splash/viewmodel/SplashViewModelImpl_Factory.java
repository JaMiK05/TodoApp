package uz.gita.to_do_jamik.presentation.screens.splash.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class SplashViewModelImpl_Factory implements Factory<SplashViewModelImpl> {
  @Override
  public SplashViewModelImpl get() {
    return newInstance();
  }

  public static SplashViewModelImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SplashViewModelImpl newInstance() {
    return new SplashViewModelImpl();
  }

  private static final class InstanceHolder {
    private static final SplashViewModelImpl_Factory INSTANCE = new SplashViewModelImpl_Factory();
  }
}
