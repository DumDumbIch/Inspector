package com.dumdumbich.inspector.entity

open class DigitalParameter(
    name:String,
    unit:String,
    place:String,
    var actual: Boolean = false,
    var nominal: Boolean = false,
) : Parameter(name, unit, place) {

    override fun state(): ParameterState {
        return when {
            actual == nominal -> ParameterState.NOMINAL
            else -> ParameterState.FAILURE
        }
    }

}