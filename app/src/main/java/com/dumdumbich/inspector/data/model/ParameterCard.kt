package com.dumdumbich.inspector.data.model

import com.dumdumbich.inspector.data.utils.Colors

data class ParameterCard(
    val name: String = "",
    val value: Int = 0,
    val color: Colors = Colors.GREEN
)
