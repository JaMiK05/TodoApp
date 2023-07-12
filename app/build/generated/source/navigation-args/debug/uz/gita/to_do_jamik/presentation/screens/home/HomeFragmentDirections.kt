package uz.gita.to_do_jamik.presentation.screens.home

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress
import uz.gita.to_do_jamik.R
import uz.gita.to_do_jamik.`data`.model.TaskData

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToAddTaskFragment(
    public val task: TaskData? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_addTaskFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(TaskData::class.java)) {
          result.putParcelable("task", this.task as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(TaskData::class.java)) {
          result.putSerializable("task", this.task as Serializable?)
        }
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToAddTaskFragment(task: TaskData? = null): NavDirections =
        ActionHomeFragmentToAddTaskFragment(task)
  }
}
