package com.dumdumbich.inspector.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

/**
 *  Объект, подключенный к системе теплоснабжения
 */
@Parcelize
data class Facility(
    var name: String = "",
    var address: String = "",
    var phone: String = "",
    var eMail: String = "",
    var temperature: Int = 0,
    var lastChanged: Date = Date()
) : Parcelable {

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

}