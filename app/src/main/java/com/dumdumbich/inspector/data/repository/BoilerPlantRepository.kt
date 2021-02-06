package com.dumdumbich.inspector.data.repository

import com.dumdumbich.inspector.data.model.ParameterItem

/**
 *  Получение и распаковка сообщения о состоянии объекта
 *  Формат сообщения:
 *  - количество параметров
 *  - дата
 *  - время
 *  - температура наружного воздуха
 *  - температура воздуха в помещении
 *  - температура в теплосети: подающая линия
 *  - температура в теплосети: обратная линия
 *  - температура в котловом контуре: подающая линия
 *  - температура в котловом контуре: обратная линия
 *  - температура котла 1: подающая линия
 *  - температура котла 1: обратная линия
 *  - температура котла 2: подающая линия
 *  - температура котла 2: обратная линия
 */
object BoilerPlantRepository {
    var statusMessage: String = "18:18012021:1006:-21:21:72:64:75:64:73:66:78:64:103:2048:961:1921:0:0"

    var parameterItems: MutableList<ParameterItem>

    init {

        parameterItems = mutableListOf(
            ParameterItem("Outdoor temperature", -21),
            ParameterItem("Inside temperature", 21),
            ParameterItem("Heat network supply temperature", 72),
            ParameterItem("Heat network return temperature", 64),
            ParameterItem("Boiler circuit supply temperature", 75),
            ParameterItem("Boiler circuit return temperature", 64),
            ParameterItem("Boiler 1 supply temperature", 73),
            ParameterItem("Boiler 1  return temperature", 66),
            ParameterItem("Boiler 2 supply temperature", 78),
            ParameterItem("Boiler 2 return temperature", 64)
        )
    }
}