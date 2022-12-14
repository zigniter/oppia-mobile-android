// Generated by Dagger (https://dagger.dev).
package org.digitalcampus.oppia.fragments;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppFragment_MembersInjector implements MembersInjector<AppFragment> {
  private final Provider<SharedPreferences> prefsProvider;

  public AppFragment_MembersInjector(Provider<SharedPreferences> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<AppFragment> create(Provider<SharedPreferences> prefsProvider) {
    return new AppFragment_MembersInjector(prefsProvider);
  }

  @Override
  public void injectMembers(AppFragment instance) {
    injectPrefs(instance, prefsProvider.get());
  }

  @InjectedFieldSignature("org.digitalcampus.oppia.fragments.AppFragment.prefs")
  public static void injectPrefs(AppFragment instance, SharedPreferences prefs) {
    instance.prefs = prefs;
  }
}
