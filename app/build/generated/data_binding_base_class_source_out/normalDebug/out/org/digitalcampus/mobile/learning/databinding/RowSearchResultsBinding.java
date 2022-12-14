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

public final class RowSearchResultsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView activityIcon;

  @NonNull
  public final TextView activityTitle;

  @NonNull
  public final TextView courseTitle;

  @NonNull
  public final LinearLayout searchResultsRow;

  @NonNull
  public final TextView sectionTitle;

  private RowSearchResultsBinding(@NonNull LinearLayout rootView, @NonNull ImageView activityIcon,
      @NonNull TextView activityTitle, @NonNull TextView courseTitle,
      @NonNull LinearLayout searchResultsRow, @NonNull TextView sectionTitle) {
    this.rootView = rootView;
    this.activityIcon = activityIcon;
    this.activityTitle = activityTitle;
    this.courseTitle = courseTitle;
    this.searchResultsRow = searchResultsRow;
    this.sectionTitle = sectionTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowSearchResultsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowSearchResultsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_search_results, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowSearchResultsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.activity_icon;
      ImageView activityIcon = ViewBindings.findChildViewById(rootView, id);
      if (activityIcon == null) {
        break missingId;
      }

      id = R.id.activity_title;
      TextView activityTitle = ViewBindings.findChildViewById(rootView, id);
      if (activityTitle == null) {
        break missingId;
      }

      id = R.id.course_title;
      TextView courseTitle = ViewBindings.findChildViewById(rootView, id);
      if (courseTitle == null) {
        break missingId;
      }

      LinearLayout searchResultsRow = (LinearLayout) rootView;

      id = R.id.section_title;
      TextView sectionTitle = ViewBindings.findChildViewById(rootView, id);
      if (sectionTitle == null) {
        break missingId;
      }

      return new RowSearchResultsBinding((LinearLayout) rootView, activityIcon, activityTitle,
          courseTitle, searchResultsRow, sectionTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
