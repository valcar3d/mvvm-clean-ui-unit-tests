package com.example.mvvm_clean.data.repositories

import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertEquals


class CounterRepositoryImplTest {
    @Test
    fun `increment should increase count`() = runTest {
        // given a new instance of the repository
        val repository = CounterRepositoryImpl()

        // initially count should be 0
        assertEquals(0, repository.getCount())

        // when we call increment it should increase the count
        repository.increment()

        // after one increment count should be 1
        assertEquals(1, repository.getCount())

        // when we call increment again count should increase further
        repository.increment()

        // now should be 2
        assertEquals(2, repository.getCount())

    }

}