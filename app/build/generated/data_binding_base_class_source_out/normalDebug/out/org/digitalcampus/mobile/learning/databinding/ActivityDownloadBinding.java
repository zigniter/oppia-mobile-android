// Generated by view binder compiler. Do not edit!
package org.digitalcampus.mobile.learning.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.digitalcampus.mobile.learning.R;

public final class ActivityDownloadBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout actionBarSubtitle;

  @NonNull
  public final Button btnDownloadCourses;

  @NonNull
  public final TextView categoryTitle;

  @NonNull
  public final TextView emptyState;

  @NonNull
  public final RecyclerView recyclerTags;

  @NonNull
  public final ToolbarBinding toolbar;

  private ActivityDownloadBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout actionBarSubtitle, @NonNull Button btnDownloadCourses,
      @NonNull TextView categoryTitle, @NonNull TextView emptyState,
      @NonNull RecyclerView recyclerTags, @NonNull ToolbarBinding toolbar) {
    this.rootView = rootView;
    this.actionBarSubtitle = actionBarSubtitle;
    this.btnDownloadCourses = btnDownloadCourses;
    this.categoryTitle = categoryTitle;
    this.emptyState = emptyState;
    this.recyclerTags = recyclerTags;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDownloadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDownloadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_download, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDownloadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.action_bar_subtitle;
      RelativeLayout actionBarSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (actionBarSubtitle == null) {
        break missingId;
      }

      id = R.id.btn_download_courses;
      Button btnDownloadCourses = ViewBindings.findChildViewById(rootView, id);
      if (btnDownloadCourses == null) {
        break missingId;
      }

      id = R.id.category_title;
      TextView categoryTitle = ViewBindings.findChildViewById(rootView, id);
      if (categoryTitle == null) {
        break missingId;
      }

      id = R.id.empty_state;
      TextView emptyState = ViewBindings.findChildViewById(rootView, id);
      if (emptyState == null) {
        break missingId;
      }

      id = R.id.recycler_tags;
      RecyclerView recyclerTags = ViewBindings.findChildViewById(rootView, id);
      if (recyclerTags == null) {
        break missingId;
      }

      id = R.id.toolbar;
      View toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }
      ToolbarBinding binding_toolbar = ToolbarBinding.bind(toolbar);

      return new ActivityDownloadBinding((RelativeLayout) rootView, actionBarSubtitle,
          btnDownloadCourses, categoryTitle, emptyState, recyclerTags, binding_toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
