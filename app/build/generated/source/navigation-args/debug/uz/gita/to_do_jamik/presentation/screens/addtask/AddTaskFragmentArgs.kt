package uz.gita.to_do_jamik.presentation.screens.addtask

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import uz.gita.to_do_jamik.`data`.model.TaskData

public data class AddTaskFragmentArgs(
  public val task: TaskData? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(TaskData::class.java)) {
      result.putParcelable("task", this.task as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(TaskData::class.java)) {
      result.putSerializable("task", this.task as Serializable?)
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(TaskData::class.java)) {
      result.set("task", this.task as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(TaskData::class.java)) {
      result.set("task", this.task as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): AddTaskFragmentArgs {
      bundle.setClassLoader(AddTaskFragmentArgs::class.java.classLoader)
      val __task : TaskData?
      if (bundle.containsKey("task")) {
        if (Parcelable::class.java.isAssignableFrom(TaskData::class.java) ||
            Serializable::class.java.isAssignableFrom(TaskData::class.java)) {
          __task = bundle.get("task") as TaskData?
        } else {
          throw UnsupportedOperationException(TaskData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __task = null
      }
      return AddTaskFragmentArgs(__task)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AddTaskFragmentArgs {
      val __task : TaskData?
      if (savedStateHandle.contains("task")) {
        if (Parcelable::class.java.isAssignableFrom(TaskData::class.java) ||
            Serializable::class.java.isAssignableFrom(TaskData::class.java)) {
          __task = savedStateHandle.get<TaskData?>("task")
        } else {
          throw UnsupportedOperationException(TaskData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __task = null
      }
      return AddTaskFragmentArgs(__task)
    }
  }
}
