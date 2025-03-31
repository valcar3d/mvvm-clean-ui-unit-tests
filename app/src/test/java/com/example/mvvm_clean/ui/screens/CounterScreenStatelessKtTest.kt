package com.example.mvvm_clean.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import kotlin.test.assertTrue

@RunWith(RobolectricTestRunner::class)
class CounterScreenStatelessKtTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun counterScreenDisplaysCorrectCounterValue() {
        val counterValue = 10
        composeTestRule.setContent {
            CounterScreenStateless(
                innerPaddingValues = PaddingValues(),
                counter = counterValue,
                onButtonClick = {}
            )
        }
        // verify the counter text is displayed correctly
        composeTestRule.onNodeWithText("Count: $counterValue").assertIsDisplayed()

        // verify the button text is also displayed
        composeTestRule.onNodeWithText("Click to Count").assertIsDisplayed()
    }

    @Test
    fun counterScreenButtonClickInvokesCallback() {
        var clicked = false
        composeTestRule.setContent {
            CounterScreenStateless(
                innerPaddingValues = PaddingValues(),
                counter = 0,
                onButtonClick = { clicked = true }
            )
        }

        // perform a click on the button
        composeTestRule.onNodeWithText("Click to Count").performClick()

        // assert that the callback was invoked
        assertTrue(clicked)
    }

}