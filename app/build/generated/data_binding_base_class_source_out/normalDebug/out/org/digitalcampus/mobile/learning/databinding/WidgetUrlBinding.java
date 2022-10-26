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

public final class WidgetUrlBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout widgetResource;

  @NonNull
  public final TextView widgetUrlDescription;

  @NonNull
  public final WebView widgetUrlWebview;

  private WidgetUrlBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout widgetResource,
      @NonNull TextView widgetUrlDescription, @NonNull WebView widgetUrlWebview) {
    this.rootView = rootView;
    this.widgetResource = widgetResource;
    this.widgetUrlDescription = widgetUrlDescription;
    this.widgetUrlWebview = widgetUrlWebview;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WidgetUrlBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WidgetUrlBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.widget_url, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WidgetUrlBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout widgetResource = (LinearLayout) rootView;

      id = R.id.widget_url_description;
      TextView widgetUrlDescription = ViewBindings.findChildViewById(rootView, id);
      if (widgetUrlDescription == null) {
        break missingId;
      }

      id = R.id.widget_url_webview;
      WebView widgetUrlWebview = ViewBindings.findChildViewById(rootView, id);
      if (widgetUrlWebview == null) {
        break missingId;
      }

      return new WidgetUrlBinding((LinearLayout) rootView, widgetResource, widgetUrlDescription,
          widgetUrlWebview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
