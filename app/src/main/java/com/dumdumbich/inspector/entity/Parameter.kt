package com.dumdumbich.inspector.entity

abstract class Parameter(
    var name: String = "Parameter",
    var unit: String = "Unit",
    var place: String = "Placement",
) {
    abstract fun state(): ParameterState
}