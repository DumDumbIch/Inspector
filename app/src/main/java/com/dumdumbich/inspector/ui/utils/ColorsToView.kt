package com.dumdumbich.inspector.ui.utils

import com.dumdumbich.inspector.data.utils.Colors
import com.dumdumbich.inspector.R

class ColorsToView {
    companion object {
        fun assign(color: Colors): Int {
            return when (color) {
                Colors.WHITE -> R.color.color_white
                Colors.YELLOW -> R.color.color_yellow
                Colors.GREEN -> R.color.color_green
                Colors.BLUE -> R.color.color_blue
                Colors.RED -> R.color.color_red
                Colors.VIOLET -> R.color.color_violet
                Colors.PINK -> R.color.color_pink
                Colors.AQUAMARINE -> R.color.color_aquamarine
            }
        }
    }
}