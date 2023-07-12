// Generated by view binder compiler. Do not edit!
package uz.gita.to_do_jamik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.to_do_jamik.R;

public final class DialogInfoTaskBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final LinearLayout appbar;

  @NonNull
  public final AppCompatButton btnCancel;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView desc;

  @NonNull
  public final TextView time;

  @NonNull
  public final TextView title;

  private DialogInfoTaskBinding(@NonNull CardView rootView, @NonNull LinearLayout appbar,
      @NonNull AppCompatButton btnCancel, @NonNull TextView date, @NonNull TextView desc,
      @NonNull TextView time, @NonNull TextView title) {
    this.rootView = rootView;
    this.appbar = appbar;
    this.btnCancel = btnCancel;
    this.date = date;
    this.desc = desc;
    this.time = time;
    this.title = title;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogInfoTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogInfoTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_info_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogInfoTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar;
      LinearLayout appbar = ViewBindings.findChildViewById(rootView, id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.btn_cancel;
      AppCompatButton btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.date;
      TextView date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.desc;
      TextView desc = ViewBindings.findChildViewById(rootView, id);
      if (desc == null) {
        break missingId;
      }

      id = R.id.time;
      TextView time = ViewBindings.findChildViewById(rootView, id);
      if (time == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new DialogInfoTaskBinding((CardView) rootView, appbar, btnCancel, date, desc, time,
          title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}