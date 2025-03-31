package com.example.mvvm_clean.data.datasource.remote

interface ApiServiceDataSource {
    suspend fun someApiCall(): String
}