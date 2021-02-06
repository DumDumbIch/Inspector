package com.dumdumbich.inspector.data.model

import android.os.Parcelable
import com.dumdumbich.inspector.data.utils.Colors
import kotlinx.parcelize.Parcelize

@Parcelize
data class ParameterItem(
    val name: String = "",
    val value: Int = 0,
    val color: Colors = Colors.GREEN
): Parcelable
