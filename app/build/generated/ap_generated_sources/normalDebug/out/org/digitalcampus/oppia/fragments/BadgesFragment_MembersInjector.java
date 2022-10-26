// Generated by Dagger (https://dagger.dev).
package org.digitalcampus.oppia.fragments;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.List;
import javax.inject.Provider;
import org.digitalcampus.oppia.api.ApiEndpoint;
import org.digitalcampus.oppia.model.Badge;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BadgesFragment_MembersInjector implements MembersInjector<BadgesFragment> {
  private final Provider<SharedPreferences> prefsProvider;

  private final Provider<ApiEndpoint> apiEndpointProvider;

  private final Provider<List<Badge>> badgesProvider;

  public BadgesFragment_MembersInjector(Provider<SharedPreferences> prefsProvider,
      Provider<ApiEndpoint> apiEndpointProvider, Provider<List<Badge>> badgesProvider) {
    this.prefsProvider = prefsProvider;
    this.apiEndpointProvider = apiEndpointProvider;
    this.badgesProvider = badgesProvider;
  }

  public static MembersInjector<BadgesFragment> create(Provider<SharedPreferences> prefsProvider,
      Provider<ApiEndpoint> apiEndpointProvider, Provider<List<Badge>> badgesProvider) {
    return new BadgesFragment_MembersInjector(prefsProvider, apiEndpointProvider, badgesProvider);
  }

  @Override
  public void injectMembers(BadgesFragment instance) {
    AppFragment_MembersInjector.injectPrefs(instance, prefsProvider.get());
    injectApiEndpoint(instance, apiEndpointProvider.get());
    injectBadges(instance, badgesProvider.get());
  }

  @InjectedFieldSignature("org.digitalcampus.oppia.fragments.BadgesFragment.apiEndpoint")
  public static void injectApiEndpoint(BadgesFragment instance, ApiEndpoint apiEndpoint) {
    instance.apiEndpoint = apiEndpoint;
  }

  @InjectedFieldSignature("org.digitalcampus.oppia.fragments.BadgesFragment.badges")
  public static void injectBadges(BadgesFragment instance, List<Badge> badges) {
    instance.badges = badges;
  }
}
