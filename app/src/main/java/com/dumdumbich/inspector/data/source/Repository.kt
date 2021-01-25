package com.dumdumbich.inspector.data.source

import com.dumdumbich.inspector.data.model.Parameter
import com.dumdumbich.inspector.data.model.Status

object Repository {
    var statusMessage: String = "18:18012021:1006:-21:21:72:64:75:64:73:66:78:64:103:2048:961:1921:0:0"
    var parameters = mutableListOf(Parameter())
    private var status: Status

    init {
        status = Status(statusMessage)
        parameters.add(Parameter("Outdoor temperature", status.temperatureOutdoor)) // Температура наружного воздуха
        parameters.add(Parameter("Inside temperature", status.temperatureInside)) // Температура воздуха в помещении
        parameters.add(Parameter("Heat network supply temperature", status.temperatureHeatNetworkSupply)) // Температура в теплосети: подающая линия
        parameters.add(Parameter("Heat network return temperature", status.temperatureHeatNetworkReturn)) // Температура в теплосети: обратная линия
        parameters.add(Parameter("Boiler circuit supply temperature", status.temperatureBoilerCircuitSupply)) // Температура в котловом контуре: подающая линия
        parameters.add(Parameter("Boiler circuit return temperature", status.temperatureBoilerCircuitReturn)) // Температура в котловом контуре: обратная линия
        parameters.add(Parameter("Boiler 1 supply temperature", status.temperatureBoilerFirstSupply)) // Температура котла 1: подающая линия
        parameters.add(Parameter("Boiler 1  return temperature", status.temperatureBoilerFirstReturn)) // Температура котла 1: обратная линия
        parameters.add(Parameter("Boiler 2 supply temperature", status.temperatureBoilerSecondSupply)) // Температура котла 2: подающая линия
        parameters.add(Parameter("Boiler 2 return temperature", status.temperatureBoilerSecondReturn)) // Температура котла 2: обратная линия
    }
}