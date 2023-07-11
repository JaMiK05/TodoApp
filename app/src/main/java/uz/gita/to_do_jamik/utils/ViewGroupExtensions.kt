package uz.gita.to_do_jamik.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 *   Created by Jamik on 7/6/2023 ot 7:25 PM
 **/

fun ViewGroup.inflate(resId: Int): View {
    return LayoutInflater.from(this.context).inflate(resId, this, false)
}