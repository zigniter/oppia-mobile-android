// Generated by Dagger (https://dagger.dev).
package org.digitalcampus.oppia.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import org.digitalcampus.oppia.model.CustomFieldsRepository;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideProfileCustomFieldsListFactory implements Factory<CustomFieldsRepository> {
  private final AppModule module;

  public AppModule_ProvideProfileCustomFieldsListFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public CustomFieldsRepository get() {
    return provideProfileCustomFieldsList(module);
  }

  public static AppModule_ProvideProfileCustomFieldsListFactory create(AppModule module) {
    return new AppModule_ProvideProfileCustomFieldsListFactory(module);
  }

  public static CustomFieldsRepository provideProfileCustomFieldsList(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideProfileCustomFieldsList());
  }
}
