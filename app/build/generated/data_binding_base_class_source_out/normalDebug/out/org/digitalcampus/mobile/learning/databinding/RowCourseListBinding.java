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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.digitalcampus.mobile.learning.R;
import org.digitalcampus.oppia.utils.course_status.CourseStatusBadgeView;

public final class RowCourseListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CircularProgressBar circularProgressBar;

  @NonNull
  public final TextView courseDescription;

  @NonNull
  public final ImageView courseImage;

  @NonNull
  public final LinearLayout courseRow;

  @NonNull
  public final TextView courseTitle;

  @NonNull
  public final AppCompatImageView imgSyncStatus;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-sw600dp/</li>
   * </ul>
   */
  @Nullable
  public final LinearLayout llCardLayoutPhone;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-sw600dp/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final LinearLayout llCardLayoutTablet;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-sw600dp/</li>
   * </ul>
   */
  @Nullable
  public final CourseStatusBadgeView viewCourseStatus;

  private RowCourseListBinding(@NonNull LinearLayout rootView,
      @NonNull CircularProgressBar circularProgressBar, @NonNull TextView courseDescription,
      @NonNull ImageView courseImage, @NonNull LinearLayout courseRow,
      @NonNull TextView courseTitle, @NonNull AppCompatImageView imgSyncStatus,
      @Nullable LinearLayout llCardLayoutPhone, @Nullable LinearLayout llCardLayoutTablet,
      @Nullable CourseStatusBadgeView viewCourseStatus) {
    this.rootView = rootView;
    this.circularProgressBar = circularProgressBar;
    this.courseDescription = courseDescription;
    this.courseImage = courseImage;
    this.courseRow = courseRow;
    this.courseTitle = courseTitle;
    this.imgSyncStatus = imgSyncStatus;
    this.llCardLayoutPhone = llCardLayoutPhone;
    this.llCardLayoutTablet = llCardLayoutTablet;
    this.viewCourseStatus = viewCourseStatus;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowCourseListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowCourseListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_course_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowCourseListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.circularProgressBar;
      CircularProgressBar circularProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (circularProgressBar == null) {
        break missingId;
      }

      id = R.id.course_description;
      TextView courseDescription = ViewBindings.findChildViewById(rootView, id);
      if (courseDescription == null) {
        break missingId;
      }

      id = R.id.course_image;
      ImageView courseImage = ViewBindings.findChildViewById(rootView, id);
      if (courseImage == null) {
        break missingId;
      }

      LinearLayout courseRow = (LinearLayout) rootView;

      id = R.id.course_title;
      TextView courseTitle = ViewBindings.findChildViewById(rootView, id);
      if (courseTitle == null) {
        break missingId;
      }

      id = R.id.img_sync_status;
      AppCompatImageView imgSyncStatus = ViewBindings.findChildViewById(rootView, id);
      if (imgSyncStatus == null) {
        break missingId;
      }

      id = R.id.ll_card_layout_phone;
      LinearLayout llCardLayoutPhone = ViewBindings.findChildViewById(rootView, id);

      id = R.id.ll_card_layout_tablet;
      LinearLayout llCardLayoutTablet = ViewBindings.findChildViewById(rootView, id);

      id = R.id.view_course_status;
      CourseStatusBadgeView viewCourseStatus = ViewBindings.findChildViewById(rootView, id);

      return new RowCourseListBinding((LinearLayout) rootView, circularProgressBar,
          courseDescription, courseImage, courseRow, courseTitle, imgSyncStatus, llCardLayoutPhone,
          llCardLayoutTablet, viewCourseStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
