package io.github.collins993.mycurrencyconverter.main

import io.github.collins993.mycurrencyconverter.data.models.CurrencyResponse
import io.github.collins993.mycurrencyconverter.util.Resource

interface MainRepository {
    suspend fun getRates(base: String): Resource<CurrencyResponse>
}