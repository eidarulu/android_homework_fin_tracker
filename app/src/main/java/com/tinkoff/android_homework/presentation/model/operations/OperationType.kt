package com.tinkoff.android_homework.presentation.model.operations

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class OperationType {
    @SerialName("OUTCOME")
    OUTCOME,
    @SerialName("INCOME")
    INCOME
}
