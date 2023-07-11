package uz.gita.to_do_jamik.utils

import android.content.Context
import androidx.work.WorkManager
import java.util.UUID

/**
 *   Created by Jamik on 7/6/2023 ot 7:24 PM
 **/

fun cancelWork(context: Context, workId: UUID) {
    WorkManager.getInstance(context).cancelWorkById(workId)
}