package uz.gita.to_do_jamik.presentation.screens.addtask.viewmodel;

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
public final class AddTaskViewModelImpl_Factory implements Factory<AddTaskViewModelImpl> {
  private final Provider<TaskRepository> repositoryProvider;

  private final Provider<AppNavigator> navigatorProvider;

  public AddTaskViewModelImpl_Factory(Provider<TaskRepository> repositoryProvider,
      Provider<AppNavigator> navigatorProvider) {
    this.repositoryProvider = repositoryProvider;
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public AddTaskViewModelImpl get() {
    return newInstance(repositoryProvider.get(), navigatorProvider.get());
  }

  public static AddTaskViewModelImpl_Factory create(Provider<TaskRepository> repositoryProvider,
      Provider<AppNavigator> navigatorProvider) {
    return new AddTaskViewModelImpl_Factory(repositoryProvider, navigatorProvider);
  }

  public static AddTaskViewModelImpl newInstance(TaskRepository repository,
      AppNavigator navigator) {
    return new AddTaskViewModelImpl(repository, navigator);
  }
}
