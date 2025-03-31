package com.example.mvvm_clean.domain.usecases

import com.example.mvvm_clean.domain.repositories.CounterRepository
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Test
import kotlin.test.assertEquals

class IncrementCounterUseCaseTest {
    // create a mock repository using mockK
    private val repository: CounterRepository = mockk(relaxed = true)

    // inject the mock into the use case
    private val useCase = IncrementCounterUseCase(repository)

    @Test
    fun `increment counter returns incremented value`() = runBlocking {

        // for increment unit just return Unit
        coEvery { repository.increment() } returns Unit

        // for getCount, return the expected value
        coEvery { repository.getCount() } returns 6

        // call the use case
        val result = useCase.execute()

        // assert:
        // verify that the repository.increment() was called exactly once
        coVerify(exactly = 1) { repository.increment() }

        // verify that the repository.count() was called exactly once
        coVerify(exactly = 1) {repository.getCount()}


        assertEquals(6, result)
    }
}