package uz.gita.to_do_jamik.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0017J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016\u00a8\u0006\n"}, d2 = {"Luz/gita/to_do_jamik/di/WorkManagerInitializer;", "Landroidx/startup/Initializer;", "Landroidx/work/WorkManager;", "()V", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class WorkManagerInitializer implements androidx.startup.Initializer<androidx.work.WorkManager> {
    @org.jetbrains.annotations.NotNull
    public static final uz.gita.to_do_jamik.di.WorkManagerInitializer INSTANCE = null;
    
    private WorkManagerInitializer() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.work.WorkManager create(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return null;
    }
}