package com.example.mvvm_clean.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm_clean.domain.usecases.IncrementCounterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CounterViewModel @Inject constructor(
    private val incrementCounterUseCase: IncrementCounterUseCase
) : ViewModel() {
    private val _count = MutableStateFlow(0)
    val count get() = _count

    fun increment() {
        viewModelScope.launch {
            _count.value = incrementCounterUseCase.execute()
        }
    }
}