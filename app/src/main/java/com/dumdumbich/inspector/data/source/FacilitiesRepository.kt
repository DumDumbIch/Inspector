package com.dumdumbich.inspector.data.source

import com.dumdumbich.inspector.data.model.FacilityCard

/**
 *  Список клиентов
 *  необходимо организовать хранение контактов в базе данных
 */
object FacilitiesRepository {

    var facilityCards: MutableList<FacilityCard>

    init {
        facilityCards = mutableListOf(
            FacilityCard("ОАО Шуйская водка", "Ивановская обл., г.Шуя"),
            FacilityCard("ООО Мир Пиццы", "г.Иваново, ул.Марии Рябининой"),
            FacilityCard("ООО Сервис-Универсал", "г.Иваново, Загородное шоссе")
        )
    }
}