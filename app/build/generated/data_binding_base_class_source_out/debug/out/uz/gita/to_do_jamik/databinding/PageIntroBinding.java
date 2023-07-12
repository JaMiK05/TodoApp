// Generated by view binder compiler. Do not edit!
package uz.gita.to_do_jamik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.to_do_jamik.R;

public final class PageIntroBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView headerImageIntro;

  @NonNull
  public final TextView tvIntroDescription;

  @NonNull
  public final TextView tvIntroTitle;

  private PageIntroBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView headerImageIntro,
      @NonNull TextView tvIntroDescription, @NonNull TextView tvIntroTitle) {
    this.rootView = rootView;
    this.headerImageIntro = headerImageIntro;
    this.tvIntroDescription = tvIntroDescription;
    this.tvIntroTitle = tvIntroTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PageIntroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PageIntroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.page_intro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PageIntroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.header_image_intro;
      ImageView headerImageIntro = ViewBindings.findChildViewById(rootView, id);
      if (headerImageIntro == null) {
        break missingId;
      }

      id = R.id.tv_intro_description;
      TextView tvIntroDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvIntroDescription == null) {
        break missingId;
      }

      id = R.id.tv_intro_title;
      TextView tvIntroTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvIntroTitle == null) {
        break missingId;
      }

      return new PageIntroBinding((ConstraintLayout) rootView, headerImageIntro, tvIntroDescription,
          tvIntroTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
