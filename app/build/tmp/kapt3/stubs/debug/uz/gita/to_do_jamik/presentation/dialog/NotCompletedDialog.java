package uz.gita.to_do_jamik.presentation.dialog;

/**
 * Created by Jamik on 7/11/2023 ot 6:30 PM
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J \u0010\u0017\u001a\u00020\u000f2\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\fJ\u001a\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fJ\u0014\u0010\u001a\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Luz/gita/to_do_jamik/presentation/dialog/NotCompletedDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adap", "Luz/gita/to_do_jamik/presentation/adapter/TaskAdapter;", "getAdap", "()Luz/gita/to_do_jamik/presentation/adapter/TaskAdapter;", "adap$delegate", "Lkotlin/Lazy;", "allClickListener", "Lkotlin/Function1;", "", "Luz/gita/to_do_jamik/data/model/TaskData;", "", "binding", "Luz/gita/to_do_jamik/databinding/DialogNotcompletedBinding;", "clickListener", "adapListener", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setClickBtnListener", "block", "setClickItemListener", "submidList", "list", "app_debug"})
public final class NotCompletedDialog extends android.app.Dialog {
    private uz.gita.to_do_jamik.databinding.DialogNotcompletedBinding binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy adap$delegate = null;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super uz.gita.to_do_jamik.data.model.TaskData, kotlin.Unit> clickListener;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.util.List<uz.gita.to_do_jamik.data.model.TaskData>, kotlin.Unit> allClickListener;
    
    public NotCompletedDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    private final uz.gita.to_do_jamik.presentation.adapter.TaskAdapter getAdap() {
        return null;
    }
    
    public final void setClickBtnListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.List<uz.gita.to_do_jamik.data.model.TaskData>, kotlin.Unit> block) {
    }
    
    public final void setClickItemListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super uz.gita.to_do_jamik.data.model.TaskData, kotlin.Unit> block) {
    }
    
    public final void submidList(@org.jetbrains.annotations.NotNull
    java.util.List<uz.gita.to_do_jamik.data.model.TaskData> list) {
    }
    
    private final void adapListener() {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}