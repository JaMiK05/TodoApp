// Generated by view binder compiler. Do not edit!
package uz.gita.to_do_jamik.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.gita.to_do_jamik.R;

public final class DialogNotcompletedBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final LinearLayout appbar;

  @NonNull
  public final AppCompatButton btnAdd;

  @NonNull
  public final AppCompatButton btnCancel;

  @NonNull
  public final RecyclerView itemrecycler;

  @NonNull
  public final ImageView question;

  private DialogNotcompletedBinding(@NonNull CardView rootView, @NonNull LinearLayout appbar,
      @NonNull AppCompatButton btnAdd, @NonNull AppCompatButton btnCancel,
      @NonNull RecyclerView itemrecycler, @NonNull ImageView question) {
    this.rootView = rootView;
    this.appbar = appbar;
    this.btnAdd = btnAdd;
    this.btnCancel = btnCancel;
    this.itemrecycler = itemrecycler;
    this.question = question;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogNotcompletedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogNotcompletedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_notcompleted, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogNotcompletedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar;
      LinearLayout appbar = ViewBindings.findChildViewById(rootView, id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.btn_add;
      AppCompatButton btnAdd = ViewBindings.findChildViewById(rootView, id);
      if (btnAdd == null) {
        break missingId;
      }

      id = R.id.btn_cancel;
      AppCompatButton btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.itemrecycler;
      RecyclerView itemrecycler = ViewBindings.findChildViewById(rootView, id);
      if (itemrecycler == null) {
        break missingId;
      }

      id = R.id.question;
      ImageView question = ViewBindings.findChildViewById(rootView, id);
      if (question == null) {
        break missingId;
      }

      return new DialogNotcompletedBinding((CardView) rootView, appbar, btnAdd, btnCancel,
          itemrecycler, question);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
