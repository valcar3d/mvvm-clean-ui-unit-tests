package com.example.mvvm_clean.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.example.mvvm_clean.ui.viewmodels.CounterViewModel

@Composable
fun CounterScreen(
    innerPaddingValues: PaddingValues,
    counterViewModel: CounterViewModel
) {
    // counter variable as state to observe changes
    val counterNumber = counterViewModel.count.collectAsState()

    // stateless screen where all design is created
    CounterScreenStateless(
        innerPaddingValues = innerPaddingValues,
        counter = counterNumber.value,
        onButtonClick = {
            counterViewModel.increment()
        })
}