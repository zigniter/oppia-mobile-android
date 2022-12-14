// Generated by view binder compiler. Do not edit!
package org.digitalcampus.mobile.learning.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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

public final class FragmentLeaderboardBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageView15;

  @NonNull
  public final RecyclerView listLeaderboard;

  @NonNull
  public final ProgressBar loadingSpinner;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView tvRanking;

  @NonNull
  public final TextView tvTotalPoints;

  private FragmentLeaderboardBinding(@NonNull LinearLayout rootView, @NonNull ImageView imageView15,
      @NonNull RecyclerView listLeaderboard, @NonNull ProgressBar loadingSpinner,
      @NonNull TextView textView5, @NonNull TextView tvRanking, @NonNull TextView tvTotalPoints) {
    this.rootView = rootView;
    this.imageView15 = imageView15;
    this.listLeaderboard = listLeaderboard;
    this.loadingSpinner = loadingSpinner;
    this.textView5 = textView5;
    this.tvRanking = tvRanking;
    this.tvTotalPoints = tvTotalPoints;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLeaderboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLeaderboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_leaderboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLeaderboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView15;
      ImageView imageView15 = ViewBindings.findChildViewById(rootView, id);
      if (imageView15 == null) {
        break missingId;
      }

      id = R.id.list_leaderboard;
      RecyclerView listLeaderboard = ViewBindings.findChildViewById(rootView, id);
      if (listLeaderboard == null) {
        break missingId;
      }

      id = R.id.loading_spinner;
      ProgressBar loadingSpinner = ViewBindings.findChildViewById(rootView, id);
      if (loadingSpinner == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.tv_ranking;
      TextView tvRanking = ViewBindings.findChildViewById(rootView, id);
      if (tvRanking == null) {
        break missingId;
      }

      id = R.id.tv_total_points;
      TextView tvTotalPoints = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalPoints == null) {
        break missingId;
      }

      return new FragmentLeaderboardBinding((LinearLayout) rootView, imageView15, listLeaderboard,
          loadingSpinner, textView5, tvRanking, tvTotalPoints);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
