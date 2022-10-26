// Generated by Dagger (https://dagger.dev).
package org.digitalcampus.oppia.fragments;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import org.digitalcampus.oppia.api.ApiEndpoint;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ResetPasswordFragment_MembersInjector implements MembersInjector<ResetPasswordFragment> {
  private final Provider<SharedPreferences> prefsProvider;

  private final Provider<ApiEndpoint> apiEndpointProvider;

  public ResetPasswordFragment_MembersInjector(Provider<SharedPreferences> prefsProvider,
      Provider<ApiEndpoint> apiEndpointProvider) {
    this.prefsProvider = prefsProvider;
    this.apiEndpointProvider = apiEndpointProvider;
  }

  public static MembersInjector<ResetPasswordFragment> create(
      Provider<SharedPreferences> prefsProvider, Provider<ApiEndpoint> apiEndpointProvider) {
    return new ResetPasswordFragment_MembersInjector(prefsProvider, apiEndpointProvider);
  }

  @Override
  public void injectMembers(ResetPasswordFragment instance) {
    AppFragment_MembersInjector.injectPrefs(instance, prefsProvider.get());
    injectApiEndpoint(instance, apiEndpointProvider.get());
  }

  @InjectedFieldSignature("org.digitalcampus.oppia.fragments.ResetPasswordFragment.apiEndpoint")
  public static void injectApiEndpoint(ResetPasswordFragment instance, ApiEndpoint apiEndpoint) {
    instance.apiEndpoint = apiEndpoint;
  }
}
