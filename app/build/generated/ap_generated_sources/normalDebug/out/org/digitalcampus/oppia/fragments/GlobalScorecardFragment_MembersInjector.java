// Generated by Dagger (https://dagger.dev).
package org.digitalcampus.oppia.fragments;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import org.digitalcampus.oppia.api.ApiEndpoint;
import org.digitalcampus.oppia.model.CoursesRepository;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GlobalScorecardFragment_MembersInjector implements MembersInjector<GlobalScorecardFragment> {
  private final Provider<SharedPreferences> prefsProvider;

  private final Provider<CoursesRepository> coursesRepositoryProvider;

  private final Provider<ApiEndpoint> apiEndpointProvider;

  public GlobalScorecardFragment_MembersInjector(Provider<SharedPreferences> prefsProvider,
      Provider<CoursesRepository> coursesRepositoryProvider,
      Provider<ApiEndpoint> apiEndpointProvider) {
    this.prefsProvider = prefsProvider;
    this.coursesRepositoryProvider = coursesRepositoryProvider;
    this.apiEndpointProvider = apiEndpointProvider;
  }

  public static MembersInjector<GlobalScorecardFragment> create(
      Provider<SharedPreferences> prefsProvider,
      Provider<CoursesRepository> coursesRepositoryProvider,
      Provider<ApiEndpoint> apiEndpointProvider) {
    return new GlobalScorecardFragment_MembersInjector(prefsProvider, coursesRepositoryProvider, apiEndpointProvider);
  }

  @Override
  public void injectMembers(GlobalScorecardFragment instance) {
    AppFragment_MembersInjector.injectPrefs(instance, prefsProvider.get());
    injectCoursesRepository(instance, coursesRepositoryProvider.get());
    injectApiEndpoint(instance, apiEndpointProvider.get());
  }

  @InjectedFieldSignature("org.digitalcampus.oppia.fragments.GlobalScorecardFragment.coursesRepository")
  public static void injectCoursesRepository(GlobalScorecardFragment instance,
      CoursesRepository coursesRepository) {
    instance.coursesRepository = coursesRepository;
  }

  @InjectedFieldSignature("org.digitalcampus.oppia.fragments.GlobalScorecardFragment.apiEndpoint")
  public static void injectApiEndpoint(GlobalScorecardFragment instance, ApiEndpoint apiEndpoint) {
    instance.apiEndpoint = apiEndpoint;
  }
}
