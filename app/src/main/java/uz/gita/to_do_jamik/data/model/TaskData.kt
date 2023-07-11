package uz.gita.to_do_jamik.data.model

import android.os.Parcelable
import androidx.room.*
import kotlinx.parcelize.Parcelize
import java.io.Serializable
import java.util.UUID

/**
 *   Created by Jamik on 7/6/2023 ot 4:48 PM
 **/
@Parcelize
@Entity(tableName = "tasks")
data class TaskData(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val time: String,
    @ColumnInfo(name = "ic_working")
    val isWorking: Int,
    val uuid: UUID,
    val icFinish: Int = 0,
) : Parcelable, Serializable