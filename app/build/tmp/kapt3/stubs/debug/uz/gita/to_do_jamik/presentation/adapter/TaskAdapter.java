package uz.gita.to_do_jamik.presentation.adapter;

/**
 * Created by Jamik on 7/7/2023 ot 5:07 PM
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00182\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0018\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u00020\u00072\n\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006J\u001a\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006J\u001a\u0010\u0016\u001a\u00020\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006J\u001a\u0010\u0017\u001a\u00020\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Luz/gita/to_do_jamik/presentation/adapter/TaskAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Luz/gita/to_do_jamik/data/model/TaskData;", "Luz/gita/to_do_jamik/presentation/adapter/TaskAdapter$Holder;", "()V", "checkListener", "Lkotlin/Function1;", "", "itemClickListener", "longItemClickListener", "updateListener", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCheckedListener", "block", "setItemClickListener", "setItemLongClickListener", "setUpdatetaskListener", "Companion", "Holder", "TaskItemCallback", "app_debug"})
public final class TaskAdapter extends androidx.recyclerview.widget.ListAdapter<uz.gita.to_do_jamik.data.model.TaskData, uz.gita.to_do_jamik.presentation.adapter.TaskAdapter.Holder> {
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super uz.gita.to_do_jamik.data.model.TaskData, kotlin.Unit> updateListener;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super uz.gita.to_do_jamik.data.model.TaskData, kotlin.Unit> checkListener;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super uz.gita.to_do_jamik.data.model.TaskData, kotlin.Unit> itemClickListener;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super uz.gita.to_do_jamik.data.model.TaskData, kotlin.Unit> longItemClickListener;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TIME = "Time:";
    @org.jetbrains.annotations.NotNull
    public static final uz.gita.to_do_jamik.presentation.adapter.TaskAdapter.Companion Companion = null;
    
    public TaskAdapter() {
        super(null);
    }
    
    public final void setCheckedListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super uz.gita.to_do_jamik.data.model.TaskData, kotlin.Unit> block) {
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super uz.gita.to_do_jamik.data.model.TaskData, kotlin.Unit> block) {
    }
    
    public final void setItemLongClickListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super uz.gita.to_do_jamik.data.model.TaskData, kotlin.Unit> block) {
    }
    
    public final void setUpdatetaskListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super uz.gita.to_do_jamik.data.model.TaskData, kotlin.Unit> block) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public uz.gita.to_do_jamik.presentation.adapter.TaskAdapter.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    uz.gita.to_do_jamik.presentation.adapter.TaskAdapter.Holder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Luz/gita/to_do_jamik/presentation/adapter/TaskAdapter$Companion;", "", "()V", "TIME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Luz/gita/to_do_jamik/presentation/adapter/TaskAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Luz/gita/to_do_jamik/databinding/ListItemTodoBinding;", "(Luz/gita/to_do_jamik/presentation/adapter/TaskAdapter;Luz/gita/to_do_jamik/databinding/ListItemTodoBinding;)V", "getBinding", "()Luz/gita/to_do_jamik/databinding/ListItemTodoBinding;", "bind", "", "app_debug"})
    public final class Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final uz.gita.to_do_jamik.databinding.ListItemTodoBinding binding = null;
        
        public Holder(@org.jetbrains.annotations.NotNull
        uz.gita.to_do_jamik.databinding.ListItemTodoBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.to_do_jamik.databinding.ListItemTodoBinding getBinding() {
            return null;
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Luz/gita/to_do_jamik/presentation/adapter/TaskAdapter$TaskItemCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Luz/gita/to_do_jamik/data/model/TaskData;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class TaskItemCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<uz.gita.to_do_jamik.data.model.TaskData> {
        @org.jetbrains.annotations.NotNull
        public static final uz.gita.to_do_jamik.presentation.adapter.TaskAdapter.TaskItemCallback INSTANCE = null;
        
        private TaskItemCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        uz.gita.to_do_jamik.data.model.TaskData oldItem, @org.jetbrains.annotations.NotNull
        uz.gita.to_do_jamik.data.model.TaskData newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        uz.gita.to_do_jamik.data.model.TaskData oldItem, @org.jetbrains.annotations.NotNull
        uz.gita.to_do_jamik.data.model.TaskData newItem) {
            return false;
        }
    }
}