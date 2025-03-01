package com.tinkoff.android_homework.domain.main.entities

import com.tinkoff.android_homework.presentation.model.operations.OperationType

data class Operation(
    val type: OperationType,
    val name: String,
    val amount: Int,
)
