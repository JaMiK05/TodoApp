package uz.gita.to_do_jamik.di;

import android.content.Context;
import android.content.SharedPreferences;
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
public final class SharedPref_BindSharedPreferenceFactory implements Factory<SharedPreferences> {
  private final Provider<Context> contextProvider;

  public SharedPref_BindSharedPreferenceFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return bindSharedPreference(contextProvider.get());
  }

  public static SharedPref_BindSharedPreferenceFactory create(Provider<Context> contextProvider) {
    return new SharedPref_BindSharedPreferenceFactory(contextProvider);
  }

  public static SharedPreferences bindSharedPreference(Context context) {
    return Preconditions.checkNotNullFromProvides(SharedPref.INSTANCE.bindSharedPreference(context));
  }
}
