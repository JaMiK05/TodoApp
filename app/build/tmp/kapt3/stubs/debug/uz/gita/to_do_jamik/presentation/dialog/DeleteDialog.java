package uz.gita.to_do_jamik.presentation.dialog;

/**
 * Created by Jamik on 7/10/2023 ot 1:17 AM
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u001a\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Luz/gita/to_do_jamik/presentation/dialog/DeleteDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "task", "Luz/gita/to_do_jamik/data/model/TaskData;", "(Landroid/content/Context;Luz/gita/to_do_jamik/data/model/TaskData;)V", "binding", "Luz/gita/to_do_jamik/databinding/TaskDeleteDialogBinding;", "editListener", "Lkotlin/Function1;", "", "getTask", "()Luz/gita/to_do_jamik/data/model/TaskData;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setEditListener", "block", "app_debug"})
public final class DeleteDialog extends android.app.Dialog {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final uz.gita.to_do_jamik.data.model.TaskData task = null;
    private uz.gita.to_do_jamik.databinding.TaskDeleteDialogBinding binding;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super uz.gita.to_do_jamik.data.model.TaskData, kotlin.Unit> editListener;
    
    public DeleteDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.data.model.TaskData task) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.to_do_jamik.data.model.TaskData getTask() {
        return null;
    }
    
    public final void setEditListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super uz.gita.to_do_jamik.data.model.TaskData, kotlin.Unit> block) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}