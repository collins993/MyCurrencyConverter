package io.github.collins993.mycurrencyconverter.data.models

data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: Rates
)