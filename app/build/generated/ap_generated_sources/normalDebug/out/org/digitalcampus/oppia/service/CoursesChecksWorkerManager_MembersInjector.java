// Generated by Dagger (https://dagger.dev).
package org.digitalcampus.oppia.service;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import org.digitalcampus.oppia.model.CoursesRepository;
import org.digitalcampus.oppia.model.User;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoursesChecksWorkerManager_MembersInjector implements MembersInjector<CoursesChecksWorkerManager> {
  private final Provider<CoursesRepository> coursesRepositoryProvider;

  private final Provider<User> userProvider;

  private final Provider<SharedPreferences> prefsProvider;

  public CoursesChecksWorkerManager_MembersInjector(
      Provider<CoursesRepository> coursesRepositoryProvider, Provider<User> userProvider,
      Provider<SharedPreferences> prefsProvider) {
    this.coursesRepositoryProvider = coursesRepositoryProvider;
    this.userProvider = userProvider;
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<CoursesChecksWorkerManager> create(
      Provider<CoursesRepository> coursesRepositoryProvider, Provider<User> userProvider,
      Provider<SharedPreferences> prefsProvider) {
    return new CoursesChecksWorkerManager_MembersInjector(coursesRepositoryProvider, userProvider, prefsProvider);
  }

  @Override
  public void injectMembers(CoursesChecksWorkerManager instance) {
    injectCoursesRepository(instance, coursesRepositoryProvider.get());
    injectUser(instance, userProvider.get());
    injectPrefs(instance, prefsProvider.get());
  }

  @InjectedFieldSignature("org.digitalcampus.oppia.service.CoursesChecksWorkerManager.coursesRepository")
  public static void injectCoursesRepository(CoursesChecksWorkerManager instance,
      CoursesRepository coursesRepository) {
    instance.coursesRepository = coursesRepository;
  }

  @InjectedFieldSignature("org.digitalcampus.oppia.service.CoursesChecksWorkerManager.user")
  public static void injectUser(CoursesChecksWorkerManager instance, User user) {
    instance.user = user;
  }

  @InjectedFieldSignature("org.digitalcampus.oppia.service.CoursesChecksWorkerManager.prefs")
  public static void injectPrefs(CoursesChecksWorkerManager instance, SharedPreferences prefs) {
    instance.prefs = prefs;
  }
}
