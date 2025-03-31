package com.example.mvvm_clean.data.datasource.remote

import kotlinx.coroutines.delay

class ApiServiceDataSourceImplementation: ApiServiceDataSource {
    override suspend fun someApiCall(): String {
        delay(3500)
        return "Returned api call value"
    }
}