package com.dumdumbich.inspector.data.source

import com.dumdumbich.inspector.data.model.Parameter
import com.dumdumbich.inspector.data.model.Status

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
object Repository {
    var statusMessage: String = "18:18012021:1006:-21:21:72:64:75:64:73:66:78:64:103:2048:961:1921:0:0"
    private var status: Status
    var parameters: List<Parameter>

    init {
        status = Status(statusMessage)
        parameters = mutableListOf(
            Parameter("Outdoor temperature", status.temperatureOutdoor),
            Parameter("Inside temperature", status.temperatureInside),
            Parameter("Heat network supply temperature", status.temperatureHeatNetworkSupply),
            Parameter("Heat network return temperature", status.temperatureHeatNetworkReturn),
            Parameter("Boiler circuit supply temperature", status.temperatureBoilerCircuitSupply),
            Parameter("Boiler circuit return temperature", status.temperatureBoilerCircuitReturn),
            Parameter("Boiler 1 supply temperature", status.temperatureBoilerFirstSupply),
            Parameter("Boiler 1  return temperature", status.temperatureBoilerFirstReturn),
            Parameter("Boiler 2 supply temperature", status.temperatureBoilerSecondSupply),
            Parameter("Boiler 2 return temperature", status.temperatureBoilerSecondReturn)
        )
    }
}