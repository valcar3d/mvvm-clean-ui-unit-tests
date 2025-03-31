package com.example.mvvm_clean.di

import com.example.mvvm_clean.data.repositories.CounterRepositoryImpl
import com.example.mvvm_clean.domain.repositories.CounterRepository
import com.example.mvvm_clean.domain.usecases.IncrementCounterUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideCounterRepository(): CounterRepository = CounterRepositoryImpl()

    @Provides
    fun provideIncrementCounterUseCase(repository: CounterRepository): IncrementCounterUseCase {
        return IncrementCounterUseCase(repository)
    }
}

