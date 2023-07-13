package uz.gita.to_do_jamik.workmanager

import android.Manifest
import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.media.RingtoneManager
import android.net.Uri
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.gita.to_do_jamik.MainActivity
import uz.gita.to_do_jamik.R
import javax.inject.Singleton

/**
 *   Created by Jamik on 7/8/2023 ot 4:43 PM
 **/
@Singleton
class NotificationHelper(private val context: Context) {

    private val CHANNEL_ID = "id"
    private val CHANNEL_NAME = "Todo app Notification"
    private val NOTIFICATION_ID = 1
    private val soundUri: Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
    private val vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    private val scope = CoroutineScope(Job() + Dispatchers.IO)

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID, CHANNEL_NAME,
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply { setSound(soundUri, Notification.AUDIO_ATTRIBUTES_DEFAULT) }

            val notificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    @SuppressLint("NewApi")
    fun createNotification(title: String, desc: String) {
        createNotificationChannel()
        val intent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent =
            PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_IMMUTABLE)

        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setContentTitle(title)
            .setContentText(desc)
            .setSound(soundUri)
            .setVibrate(LongArray(10))
            .setSmallIcon(R.drawable.icon_todo)
            .setContentIntent(pendingIntent)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .build()

        if (ActivityCompat.checkSelfPermission(
                context,
                Manifest.permission.POST_NOTIFICATIONS
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }

        scope.launch {
            for (i in 0 until 2) {
                vibrator.vibrate(
                    VibrationEffect.createOneShot(
                        400,
                        VibrationEffect.DEFAULT_AMPLITUDE
                    )
                )
                delay(600)
            }
        }
        NotificationManagerCompat.from(context).notify(NOTIFICATION_ID, notification)
    }

}