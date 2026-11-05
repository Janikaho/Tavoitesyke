package com.example.tavoitesyke.viewmodels
import kotlin.math.roundToInt
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class HrViewModel: ViewModel() {
    var ageInput by mutableStateOf("")

    private val age: Int
        get() {
            return ageInput.toIntOrNull()?:0
        }

    val upper: Int
        get() {
            return if (age in 1..<120) ((220-age) * 0.85f).roundToInt() else 0
        }

    val lower: Int
        get() {
            return if (age in 1..<120) ((220-age) * 0.65f).roundToInt() else 0
        }
}