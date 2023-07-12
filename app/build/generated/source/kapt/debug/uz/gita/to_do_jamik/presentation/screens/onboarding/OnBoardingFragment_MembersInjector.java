package uz.gita.to_do_jamik.presentation.screens.onboarding;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import uz.gita.to_do_jamik.utils.navigation.AppNavigator;

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
public final class OnBoardingFragment_MembersInjector implements MembersInjector<OnBoardingFragment> {
  private final Provider<AppNavigator> navigatorProvider;

  private final Provider<SharedPreferences> sharedProvider;

  public OnBoardingFragment_MembersInjector(Provider<AppNavigator> navigatorProvider,
      Provider<SharedPreferences> sharedProvider) {
    this.navigatorProvider = navigatorProvider;
    this.sharedProvider = sharedProvider;
  }

  public static MembersInjector<OnBoardingFragment> create(Provider<AppNavigator> navigatorProvider,
      Provider<SharedPreferences> sharedProvider) {
    return new OnBoardingFragment_MembersInjector(navigatorProvider, sharedProvider);
  }

  @Override
  public void injectMembers(OnBoardingFragment instance) {
    injectNavigator(instance, navigatorProvider.get());
    injectShared(instance, sharedProvider.get());
  }

  @InjectedFieldSignature("uz.gita.to_do_jamik.presentation.screens.onboarding.OnBoardingFragment.navigator")
  public static void injectNavigator(OnBoardingFragment instance, AppNavigator navigator) {
    instance.navigator = navigator;
  }

  @InjectedFieldSignature("uz.gita.to_do_jamik.presentation.screens.onboarding.OnBoardingFragment.shared")
  public static void injectShared(OnBoardingFragment instance, SharedPreferences shared) {
    instance.shared = shared;
  }
}
