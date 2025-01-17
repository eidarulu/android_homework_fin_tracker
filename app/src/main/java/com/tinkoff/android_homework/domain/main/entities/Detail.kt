package com.tinkoff.android_homework.domain.main.entities

import com.tinkoff.android_homework.presentation.model.operations.OperationType


data class Detail(
    val type: OperationType,
    val comment: String,
    val positions: List<String>,
)
