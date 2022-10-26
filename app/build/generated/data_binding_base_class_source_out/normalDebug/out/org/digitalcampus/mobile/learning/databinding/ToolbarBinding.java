// Generated by view binder compiler. Do not edit!
package org.digitalcampus.mobile.learning.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import org.digitalcampus.mobile.learning.R;

public final class ToolbarBinding implements ViewBinding {
  @NonNull
  private final Toolbar rootView;

  private ToolbarBinding(@NonNull Toolbar rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public Toolbar getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new ToolbarBinding((Toolbar) rootView);
  }
}
