// Generated by view binder compiler. Do not edit!
package org.digitalcampus.mobile.learning.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.digitalcampus.mobile.learning.R;

public final class ViewQuizInfoBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView courseCard;

  @NonNull
  public final ImageView imageView16;

  @NonNull
  public final TextView infoNumAttempts;

  @NonNull
  public final TextView infoNumQuestions;

  @NonNull
  public final TextView infoThreshold;

  @NonNull
  public final TextView quizzesTitle;

  @NonNull
  public final Button takeQuizBtn;

  @NonNull
  public final ProgressBar thresholdBar;

  private ViewQuizInfoBinding(@NonNull LinearLayout rootView, @NonNull CardView courseCard,
      @NonNull ImageView imageView16, @NonNull TextView infoNumAttempts,
      @NonNull TextView infoNumQuestions, @NonNull TextView infoThreshold,
      @NonNull TextView quizzesTitle, @NonNull Button takeQuizBtn,
      @NonNull ProgressBar thresholdBar) {
    this.rootView = rootView;
    this.courseCard = courseCard;
    this.imageView16 = imageView16;
    this.infoNumAttempts = infoNumAttempts;
    this.infoNumQuestions = infoNumQuestions;
    this.infoThreshold = infoThreshold;
    this.quizzesTitle = quizzesTitle;
    this.takeQuizBtn = takeQuizBtn;
    this.thresholdBar = thresholdBar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewQuizInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewQuizInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_quiz_info, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewQuizInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.course_card;
      CardView courseCard = ViewBindings.findChildViewById(rootView, id);
      if (courseCard == null) {
        break missingId;
      }

      id = R.id.imageView16;
      ImageView imageView16 = ViewBindings.findChildViewById(rootView, id);
      if (imageView16 == null) {
        break missingId;
      }

      id = R.id.info_num_attempts;
      TextView infoNumAttempts = ViewBindings.findChildViewById(rootView, id);
      if (infoNumAttempts == null) {
        break missingId;
      }

      id = R.id.info_num_questions;
      TextView infoNumQuestions = ViewBindings.findChildViewById(rootView, id);
      if (infoNumQuestions == null) {
        break missingId;
      }

      id = R.id.info_threshold;
      TextView infoThreshold = ViewBindings.findChildViewById(rootView, id);
      if (infoThreshold == null) {
        break missingId;
      }

      id = R.id.quizzes_title;
      TextView quizzesTitle = ViewBindings.findChildViewById(rootView, id);
      if (quizzesTitle == null) {
        break missingId;
      }

      id = R.id.take_quiz_btn;
      Button takeQuizBtn = ViewBindings.findChildViewById(rootView, id);
      if (takeQuizBtn == null) {
        break missingId;
      }

      id = R.id.threshold_bar;
      ProgressBar thresholdBar = ViewBindings.findChildViewById(rootView, id);
      if (thresholdBar == null) {
        break missingId;
      }

      return new ViewQuizInfoBinding((LinearLayout) rootView, courseCard, imageView16,
          infoNumAttempts, infoNumQuestions, infoThreshold, quizzesTitle, takeQuizBtn,
          thresholdBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
