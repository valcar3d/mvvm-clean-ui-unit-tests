package com.example.mvvm_clean.domain.usecases

import com.example.mvvm_clean.domain.repositories.CounterRepository
import javax.inject.Inject

class IncrementCounterUseCase
@Inject constructor(
    private val repository: CounterRepository
) {
    suspend fun execute(): Int {
        repository.increment()
        return repository.getCount()
    }
}