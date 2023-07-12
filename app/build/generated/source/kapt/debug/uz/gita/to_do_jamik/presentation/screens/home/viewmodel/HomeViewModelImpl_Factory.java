package uz.gita.to_do_jamik.presentation.screens.home.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.to_do_jamik.domain.repository.TaskRepository;
import uz.gita.to_do_jamik.utils.navigation.AppNavigator;

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
public final class HomeViewModelImpl_Factory implements Factory<HomeViewModelImpl> {
  private final Provider<TaskRepository> repositoryProvider;

  private final Provider<AppNavigator> navigatorProvider;

  public HomeViewModelImpl_Factory(Provider<TaskRepository> repositoryProvider,
      Provider<AppNavigator> navigatorProvider) {
    this.repositoryProvider = repositoryProvider;
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public HomeViewModelImpl get() {
    return newInstance(repositoryProvider.get(), navigatorProvider.get());
  }

  public static HomeViewModelImpl_Factory create(Provider<TaskRepository> repositoryProvider,
      Provider<AppNavigator> navigatorProvider) {
    return new HomeViewModelImpl_Factory(repositoryProvider, navigatorProvider);
  }

  public static HomeViewModelImpl newInstance(TaskRepository repository, AppNavigator navigator) {
    return new HomeViewModelImpl(repository, navigator);
  }
}
