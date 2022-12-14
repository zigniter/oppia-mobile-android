// Generated by view binder compiler. Do not edit!
package org.digitalcampus.mobile.learning.databinding;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
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

public final class ActivityVideoPlayerBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageButton continueButton;

  @NonNull
  public final LinearLayout endContainer;

  @NonNull
  public final ImageButton replayButton;

  @NonNull
  public final TextView textView23;

  @NonNull
  public final TextView textView25;

  @NonNull
  public final FrameLayout videoContainer;

  @NonNull
  public final SurfaceView videoSurface;

  @NonNull
  public final FrameLayout videoSurfaceContainer;

  private ActivityVideoPlayerBinding(@NonNull FrameLayout rootView,
      @NonNull ImageButton continueButton, @NonNull LinearLayout endContainer,
      @NonNull ImageButton replayButton, @NonNull TextView textView23, @NonNull TextView textView25,
      @NonNull FrameLayout videoContainer, @NonNull SurfaceView videoSurface,
      @NonNull FrameLayout videoSurfaceContainer) {
    this.rootView = rootView;
    this.continueButton = continueButton;
    this.endContainer = endContainer;
    this.replayButton = replayButton;
    this.textView23 = textView23;
    this.textView25 = textView25;
    this.videoContainer = videoContainer;
    this.videoSurface = videoSurface;
    this.videoSurfaceContainer = videoSurfaceContainer;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVideoPlayerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVideoPlayerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_video_player, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVideoPlayerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.continue_button;
      ImageButton continueButton = ViewBindings.findChildViewById(rootView, id);
      if (continueButton == null) {
        break missingId;
      }

      id = R.id.end_container;
      LinearLayout endContainer = ViewBindings.findChildViewById(rootView, id);
      if (endContainer == null) {
        break missingId;
      }

      id = R.id.replay_button;
      ImageButton replayButton = ViewBindings.findChildViewById(rootView, id);
      if (replayButton == null) {
        break missingId;
      }

      id = R.id.textView23;
      TextView textView23 = ViewBindings.findChildViewById(rootView, id);
      if (textView23 == null) {
        break missingId;
      }

      id = R.id.textView25;
      TextView textView25 = ViewBindings.findChildViewById(rootView, id);
      if (textView25 == null) {
        break missingId;
      }

      FrameLayout videoContainer = (FrameLayout) rootView;

      id = R.id.videoSurface;
      SurfaceView videoSurface = ViewBindings.findChildViewById(rootView, id);
      if (videoSurface == null) {
        break missingId;
      }

      id = R.id.videoSurfaceContainer;
      FrameLayout videoSurfaceContainer = ViewBindings.findChildViewById(rootView, id);
      if (videoSurfaceContainer == null) {
        break missingId;
      }

      return new ActivityVideoPlayerBinding((FrameLayout) rootView, continueButton, endContainer,
          replayButton, textView23, textView25, videoContainer, videoSurface,
          videoSurfaceContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
