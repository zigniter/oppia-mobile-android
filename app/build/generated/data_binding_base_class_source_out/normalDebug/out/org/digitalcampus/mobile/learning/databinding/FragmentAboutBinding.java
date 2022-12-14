// Generated by view binder compiler. Do not edit!
package org.digitalcampus.mobile.learning.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
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

public final class FragmentAboutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView aboutVersionno;

  @NonNull
  public final WebView aboutWebview;

  private FragmentAboutBinding(@NonNull LinearLayout rootView, @NonNull TextView aboutVersionno,
      @NonNull WebView aboutWebview) {
    this.rootView = rootView;
    this.aboutVersionno = aboutVersionno;
    this.aboutWebview = aboutWebview;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.about_versionno;
      TextView aboutVersionno = ViewBindings.findChildViewById(rootView, id);
      if (aboutVersionno == null) {
        break missingId;
      }

      id = R.id.about_webview;
      WebView aboutWebview = ViewBindings.findChildViewById(rootView, id);
      if (aboutWebview == null) {
        break missingId;
      }

      return new FragmentAboutBinding((LinearLayout) rootView, aboutVersionno, aboutWebview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
