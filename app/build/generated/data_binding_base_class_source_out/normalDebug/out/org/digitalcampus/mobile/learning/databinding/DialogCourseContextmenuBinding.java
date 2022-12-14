// Generated by view binder compiler. Do not edit!
package org.digitalcampus.mobile.learning.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.digitalcampus.mobile.learning.R;

public final class DialogCourseContextmenuBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout courseContextDelete;

  @NonNull
  public final LinearLayout courseContextReset;

  @NonNull
  public final LinearLayout courseContextUpdateActivity;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  private DialogCourseContextmenuBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout courseContextDelete, @NonNull LinearLayout courseContextReset,
      @NonNull LinearLayout courseContextUpdateActivity, @NonNull ImageView imageView,
      @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView2,
      @NonNull TextView textView3, @NonNull TextView textView4) {
    this.rootView = rootView;
    this.courseContextDelete = courseContextDelete;
    this.courseContextReset = courseContextReset;
    this.courseContextUpdateActivity = courseContextUpdateActivity;
    this.imageView = imageView;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogCourseContextmenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogCourseContextmenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_course_contextmenu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogCourseContextmenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.course_context_delete;
      LinearLayout courseContextDelete = ViewBindings.findChildViewById(rootView, id);
      if (courseContextDelete == null) {
        break missingId;
      }

      id = R.id.course_context_reset;
      LinearLayout courseContextReset = ViewBindings.findChildViewById(rootView, id);
      if (courseContextReset == null) {
        break missingId;
      }

      id = R.id.course_context_update_activity;
      LinearLayout courseContextUpdateActivity = ViewBindings.findChildViewById(rootView, id);
      if (courseContextUpdateActivity == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new DialogCourseContextmenuBinding((LinearLayout) rootView, courseContextDelete,
          courseContextReset, courseContextUpdateActivity, imageView, imageView2, imageView3,
          textView2, textView3, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
