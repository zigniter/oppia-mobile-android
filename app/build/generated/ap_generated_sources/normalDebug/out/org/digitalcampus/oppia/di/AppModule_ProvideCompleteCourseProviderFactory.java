// Generated by Dagger (https://dagger.dev).
package org.digitalcampus.oppia.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import org.digitalcampus.oppia.model.CompleteCourseProvider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideCompleteCourseProviderFactory implements Factory<CompleteCourseProvider> {
  private final AppModule module;

  public AppModule_ProvideCompleteCourseProviderFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public CompleteCourseProvider get() {
    return provideCompleteCourseProvider(module);
  }

  public static AppModule_ProvideCompleteCourseProviderFactory create(AppModule module) {
    return new AppModule_ProvideCompleteCourseProviderFactory(module);
  }

  public static CompleteCourseProvider provideCompleteCourseProvider(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCompleteCourseProvider());
  }
}
