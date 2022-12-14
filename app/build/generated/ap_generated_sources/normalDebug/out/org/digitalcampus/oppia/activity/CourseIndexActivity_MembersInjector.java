// Generated by Dagger (https://dagger.dev).
package org.digitalcampus.oppia.activity;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import org.digitalcampus.oppia.model.CompleteCourseProvider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CourseIndexActivity_MembersInjector implements MembersInjector<CourseIndexActivity> {
  private final Provider<SharedPreferences> prefsProvider;

  private final Provider<SharedPreferences> prefsProvider2;

  private final Provider<CompleteCourseProvider> completeCourseProvider;

  public CourseIndexActivity_MembersInjector(Provider<SharedPreferences> prefsProvider,
      Provider<SharedPreferences> prefsProvider2,
      Provider<CompleteCourseProvider> completeCourseProvider) {
    this.prefsProvider = prefsProvider;
    this.prefsProvider2 = prefsProvider2;
    this.completeCourseProvider = completeCourseProvider;
  }

  public static MembersInjector<CourseIndexActivity> create(
      Provider<SharedPreferences> prefsProvider, Provider<SharedPreferences> prefsProvider2,
      Provider<CompleteCourseProvider> completeCourseProvider) {
    return new CourseIndexActivity_MembersInjector(prefsProvider, prefsProvider2, completeCourseProvider);
  }

  @Override
  public void injectMembers(CourseIndexActivity instance) {
    AppActivity_MembersInjector.injectPrefs(instance, prefsProvider.get());
    injectPrefs(instance, prefsProvider2.get());
    injectCompleteCourseProvider(instance, completeCourseProvider.get());
  }

  @InjectedFieldSignature("org.digitalcampus.oppia.activity.CourseIndexActivity.prefs")
  public static void injectPrefs(CourseIndexActivity instance, SharedPreferences prefs) {
    instance.prefs = prefs;
  }

  @InjectedFieldSignature("org.digitalcampus.oppia.activity.CourseIndexActivity.completeCourseProvider")
  public static void injectCompleteCourseProvider(CourseIndexActivity instance,
      CompleteCourseProvider completeCourseProvider) {
    instance.completeCourseProvider = completeCourseProvider;
  }
}
