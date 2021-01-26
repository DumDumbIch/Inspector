package com.dumdumbich.inspector.data.source

import com.dumdumbich.inspector.data.model.ParameterCard
import com.dumdumbich.inspector.entity.BoilerPlant

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
object ParametersRepository {
    var statusMessage: String = "18:18012021:1006:-21:21:72:64:75:64:73:66:78:64:103:2048:961:1921:0:0"
    private var boilerPlant: BoilerPlant
    var parameterCards: List<ParameterCard>

    init {
        boilerPlant = BoilerPlant(statusMessage)
        parameterCards = mutableListOf(
            ParameterCard("Outdoor temperature", boilerPlant.temperatureOutdoor),
            ParameterCard("Inside temperature", boilerPlant.temperatureInside),
            ParameterCard("Heat network supply temperature", boilerPlant.temperatureHeatNetworkSupply),
            ParameterCard("Heat network return temperature", boilerPlant.temperatureHeatNetworkReturn),
            ParameterCard("Boiler circuit supply temperature", boilerPlant.temperatureBoilerCircuitSupply),
            ParameterCard("Boiler circuit return temperature", boilerPlant.temperatureBoilerCircuitReturn),
            ParameterCard("Boiler 1 supply temperature", boilerPlant.temperatureBoilerFirstSupply),
            ParameterCard("Boiler 1  return temperature", boilerPlant.temperatureBoilerFirstReturn),
            ParameterCard("Boiler 2 supply temperature", boilerPlant.temperatureBoilerSecondSupply),
            ParameterCard("Boiler 2 return temperature", boilerPlant.temperatureBoilerSecondReturn)
        )
    }
}