package com.dumdumbich.inspector.data.source

import com.dumdumbich.inspector.data.model.EntityElement

object FacilityRepository {

    var facilityElements: MutableList<EntityElement>

    init {
        facilityElements = mutableListOf(
            EntityElement("Объект", "ОАО Шуйская Водка"),
            EntityElement("Адрес", "Ивановская обл., г.Шуя"),
            EntityElement("Телефон", "+79998887766"),
            EntityElement("E-mail", "facility@domain.net"),
            EntityElement("Температура", "+22"),
        )
    }
}