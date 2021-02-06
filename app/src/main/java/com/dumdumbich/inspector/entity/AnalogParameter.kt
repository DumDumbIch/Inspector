package com.dumdumbich.inspector.entity

open class AnalogParameter(
    name:String,
    unit:String,
    place:String,
    var actual: Double = 0.0,
    var minimum: Double = 0.0,
    var maximum: Double = 0.0,
    var low: Double = 0.0,
    var high: Double = 0.0
) : Parameter(name,unit,place) {

    override fun state(): ParameterState {
        return when {
            minimum > actual || actual > maximum -> ParameterState.FAILURE
            low > actual || actual > high -> ParameterState.DANGER
            low <= actual || actual <= high -> ParameterState.NOMINAL
            else -> ParameterState.UNDEFINED
        }
    }

}