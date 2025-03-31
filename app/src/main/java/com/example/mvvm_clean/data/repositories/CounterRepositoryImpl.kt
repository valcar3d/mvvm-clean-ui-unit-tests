package com.example.mvvm_clean.data.repositories

import com.example.mvvm_clean.domain.repositories.CounterRepository
import kotlinx.coroutines.delay
import javax.inject.Inject


class CounterRepositoryImpl @Inject constructor() : CounterRepository {
    private var count = 0

    override fun getCount() = count

    override suspend fun increment() {
        delay(100)
        count++
    }
}