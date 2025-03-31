package com.example.mvvm_clean.utils

import java.util.Locale

fun String.toUpperCase(convertToUpperCase: String): String {
        return uppercase(Locale.ROOT)
}