package com.dumdumbich.inspector.entity

/**
 *  Состояние наблюдаемого объекта
 */
class BoilerPlant(val statusMessage: String) {

    private var date = ""
    private var time = ""
    private var weather = Weather()
    private var facility = Facility()
    private var heatNetwork = HeatNetwork()
    private var boilerCircuit = BoilerCircuit()
    private var boiler1 = Boiler()
    private var boiler2 = Boiler()

    init {
        val statusArray = statusMessage.split(":")
        if (statusArray.isNotEmpty() && statusArray.size == statusArray[0].toInt() + 1) {
            date = statusArray[1]
            time = statusArray[2]
            weather.temperature = statusArray[3].toInt()
            facility.temperature = statusArray[4].toInt()
            heatNetwork.temperatureSupply = statusArray[5].toInt()
            heatNetwork.temperatureReturn = statusArray[6].toInt()
            boilerCircuit.temperatureSupply = statusArray[7].toInt()
            boilerCircuit.temperatureReturn = statusArray[8].toInt()
            boiler1.temperatureSupply = statusArray[9].toInt()
            boiler1.temperatureReturn = statusArray[10].toInt()
            boiler2.temperatureSupply = statusArray[11].toInt()
            boiler2.temperatureReturn = statusArray[12].toInt()
        }
    }

    val temperatureOutdoor = weather.temperature
    val temperatureInside = facility.temperature
    val temperatureHeatNetworkSupply = heatNetwork.temperatureSupply
    val temperatureHeatNetworkReturn = heatNetwork.temperatureReturn
    val temperatureBoilerCircuitSupply = boilerCircuit.temperatureSupply
    val temperatureBoilerCircuitReturn = boilerCircuit.temperatureReturn
    val temperatureBoilerFirstSupply = boiler1.temperatureSupply
    val temperatureBoilerFirstReturn = boiler1.temperatureReturn
    val temperatureBoilerSecondSupply = boiler2.temperatureSupply
    val temperatureBoilerSecondReturn = boiler2.temperatureReturn

}
