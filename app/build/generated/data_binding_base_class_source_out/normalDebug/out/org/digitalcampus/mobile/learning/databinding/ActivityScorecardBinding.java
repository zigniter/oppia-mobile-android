// Generated by view binder compiler. Do not edit!
package org.digitalcampus.mobile.learning.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.digitalcampus.mobile.learning.R;

public final class ActivityScorecardBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ViewPager activityScorecardPager;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final CoordinatorLayout coordinator;

  @NonNull
  public final TabLayout tabsToolbar;

  @NonNull
  public final ToolbarBinding toolbar;

  private ActivityScorecardBinding(@NonNull CoordinatorLayout rootView,
      @NonNull ViewPager activityScorecardPager, @NonNull AppBarLayout appbar,
      @NonNull CoordinatorLayout coordinator, @NonNull TabLayout tabsToolbar,
      @NonNull ToolbarBinding toolbar) {
    this.rootView = rootView;
    this.activityScorecardPager = activityScorecardPager;
    this.appbar = appbar;
    this.coordinator = coordinator;
    this.tabsToolbar = tabsToolbar;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityScorecardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityScorecardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_scorecard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityScorecardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.activity_scorecard_pager;
      ViewPager activityScorecardPager = ViewBindings.findChildViewById(rootView, id);
      if (activityScorecardPager == null) {
        break missingId;
      }

      id = R.id.appbar;
      AppBarLayout appbar = ViewBindings.findChildViewById(rootView, id);
      if (appbar == null) {
        break missingId;
      }

      CoordinatorLayout coordinator = (CoordinatorLayout) rootView;

      id = R.id.tabs_toolbar;
      TabLayout tabsToolbar = ViewBindings.findChildViewById(rootView, id);
      if (tabsToolbar == null) {
        break missingId;
      }

      id = R.id.toolbar;
      View toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }
      ToolbarBinding binding_toolbar = ToolbarBinding.bind(toolbar);

      return new ActivityScorecardBinding((CoordinatorLayout) rootView, activityScorecardPager,
          appbar, coordinator, tabsToolbar, binding_toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
