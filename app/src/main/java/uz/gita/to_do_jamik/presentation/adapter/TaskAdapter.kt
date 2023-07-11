package uz.gita.to_do_jamik.presentation.adapter

import android.annotation.SuppressLint
import android.graphics.Paint
import android.view.ViewGroup
import androidx.recyclerview.widget.*
import uz.gita.to_do_jamik.R
import uz.gita.to_do_jamik.data.model.TaskData
import uz.gita.to_do_jamik.databinding.ListItemTodoBinding
import uz.gita.to_do_jamik.utils.inflate

/**
 *   Created by Jamik on 7/7/2023 ot 5:07 PM
 **/
class TaskAdapter : ListAdapter<TaskData, TaskAdapter.Holder>(TaskItemCallback) {

    object TaskItemCallback : DiffUtil.ItemCallback<TaskData>() {

        override fun areItemsTheSame(oldItem: TaskData, newItem: TaskData): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: TaskData, newItem: TaskData): Boolean {
            return oldItem.id == newItem.id && oldItem.title == newItem.title && oldItem.description == newItem.description && oldItem.isWorking == newItem.isWorking
        }
    }

    inner class Holder(val binding: ListItemTodoBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.apply {
                rbTodo.setOnClickListener {
                    rbTodo.isChecked = !rbTodo.isChecked
                    checkListener?.invoke(getItem(adapterPosition))
                }
                root.setOnClickListener {
                    itemClickListener?.invoke(getItem(adapterPosition))
                }
                root.setOnLongClickListener {
                    longItemClickListener?.invoke(getItem(adapterPosition))
                    true
                }
            }

        }

        @SuppressLint("SetTextI18n")
        fun bind() {
            binding.apply {
                val data = getItem(adapterPosition)
                root.setBackgroundResource(if (data.isWorking == 1) R.drawable.bg_todo_completed else R.drawable.bg_todo)
                tvTimeTodo.text = "$TIME ${data.time}"
                tvNameTodo.text = data.title
                if (data.isWorking == 1) {
                    root.elevation = 4f
                    tvNameTodo.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
                }
                updateTask.setOnClickListener {
                    updateListener?.invoke(data)
                }
                rbTodo.isChecked = data.isWorking == 1
            }
        }
    }

    private var updateListener: ((TaskData) -> Unit)? = null
    private var checkListener: ((TaskData) -> Unit)? = null
    private var itemClickListener: ((TaskData) -> Unit)? = null
    private var longItemClickListener: ((TaskData) -> Unit)? = null

    fun setCheckedListener(block: (TaskData) -> Unit) {
        checkListener = block
    }

    fun setItemClickListener(block: (TaskData) -> Unit) {
        itemClickListener = block
    }

    fun setItemLongClickListener(block: (TaskData) -> Unit) {
        longItemClickListener = block
    }

    fun setUpdatetaskListener(block: (TaskData) -> Unit) {
        updateListener = block
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = Holder(
        ListItemTodoBinding.bind(
            parent.inflate(
                R.layout.list_item_todo
            )
        )
    )

    override fun onBindViewHolder(holder: Holder, position: Int) = holder.bind()

    companion object {
        const val TIME = "Time:"
    }
}