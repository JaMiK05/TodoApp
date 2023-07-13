package uz.gita.to_do_jamik.workmanager;

/**
 * Created by Jamik on 7/8/2023 ot 4:43 PM
 */
@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0007J\b\u0010\u0014\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Luz/gita/to_do_jamik/workmanager/NotificationHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "CHANNEL_ID", "", "CHANNEL_NAME", "NOTIFICATION_ID", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "soundUri", "Landroid/net/Uri;", "vibrator", "Landroid/os/Vibrator;", "createNotification", "", "title", "desc", "createNotificationChannel", "app_debug"})
public final class NotificationHelper {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CHANNEL_ID = "id";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CHANNEL_NAME = "Todo app Notification";
    private final int NOTIFICATION_ID = 1;
    @org.jetbrains.annotations.NotNull
    private final android.net.Uri soundUri = null;
    @org.jetbrains.annotations.NotNull
    private final android.os.Vibrator vibrator = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public NotificationHelper(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    private final void createNotificationChannel() {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    public final void createNotification(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String desc) {
    }
}