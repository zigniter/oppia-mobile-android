// Generated by Dagger (https://dagger.dev).
package org.digitalcampus.oppia.activity;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import org.digitalcampus.oppia.model.CoursesRepository;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PrefsActivity_MembersInjector implements MembersInjector<PrefsActivity> {
  private final Provider<SharedPreferences> prefsProvider;

  private final Provider<CoursesRepository> coursesRepositoryProvider;

  public PrefsActivity_MembersInjector(Provider<SharedPreferences> prefsProvider,
      Provider<CoursesRepository> coursesRepositoryProvider) {
    this.prefsProvider = prefsProvider;
    this.coursesRepositoryProvider = coursesRepositoryProvider;
  }

  public static MembersInjector<PrefsActivity> create(Provider<SharedPreferences> prefsProvider,
      Provider<CoursesRepository> coursesRepositoryProvider) {
    return new PrefsActivity_MembersInjector(prefsProvider, coursesRepositoryProvider);
  }

  @Override
  public void injectMembers(PrefsActivity instance) {
    AppActivity_MembersInjector.injectPrefs(instance, prefsProvider.get());
    injectCoursesRepository(instance, coursesRepositoryProvider.get());
  }

  @InjectedFieldSignature("org.digitalcampus.oppia.activity.PrefsActivity.coursesRepository")
  public static void injectCoursesRepository(PrefsActivity instance,
      CoursesRepository coursesRepository) {
    instance.coursesRepository = coursesRepository;
  }
}
