package com.example.mvvm_clean.domain.repositories

interface CounterRepository {
    fun getCount(): Int
    suspend fun increment()
}