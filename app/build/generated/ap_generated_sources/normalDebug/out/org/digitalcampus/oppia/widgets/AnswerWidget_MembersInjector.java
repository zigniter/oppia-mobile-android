// Generated by Dagger (https://dagger.dev).
package org.digitalcampus.oppia.widgets;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import org.digitalcampus.oppia.model.QuizAttemptRepository;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AnswerWidget_MembersInjector implements MembersInjector<AnswerWidget> {
  private final Provider<QuizAttemptRepository> attemptsRepositoryProvider;

  public AnswerWidget_MembersInjector(Provider<QuizAttemptRepository> attemptsRepositoryProvider) {
    this.attemptsRepositoryProvider = attemptsRepositoryProvider;
  }

  public static MembersInjector<AnswerWidget> create(
      Provider<QuizAttemptRepository> attemptsRepositoryProvider) {
    return new AnswerWidget_MembersInjector(attemptsRepositoryProvider);
  }

  @Override
  public void injectMembers(AnswerWidget instance) {
    injectAttemptsRepository(instance, attemptsRepositoryProvider.get());
  }

  @InjectedFieldSignature("org.digitalcampus.oppia.widgets.AnswerWidget.attemptsRepository")
  public static void injectAttemptsRepository(AnswerWidget instance,
      QuizAttemptRepository attemptsRepository) {
    instance.attemptsRepository = attemptsRepository;
  }
}
