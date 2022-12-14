// Generated by view binder compiler. Do not edit!
package org.digitalcampus.mobile.learning.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import org.digitalcampus.mobile.learning.R;

public final class ViewSpinnerDropdownItemBinding implements ViewBinding {
  @NonNull
  private final CheckedTextView rootView;

  @NonNull
  public final CheckedTextView text1;

  private ViewSpinnerDropdownItemBinding(@NonNull CheckedTextView rootView,
      @NonNull CheckedTextView text1) {
    this.rootView = rootView;
    this.text1 = text1;
  }

  @Override
  @NonNull
  public CheckedTextView getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewSpinnerDropdownItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewSpinnerDropdownItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_spinner_dropdown_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewSpinnerDropdownItemBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    CheckedTextView text1 = (CheckedTextView) rootView;

    return new ViewSpinnerDropdownItemBinding((CheckedTextView) rootView, text1);
  }
}
