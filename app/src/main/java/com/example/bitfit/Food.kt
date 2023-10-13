package com.example.bitfit

import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Keep
@Serializable
data class Food (
    @SerialName("food_name")
    val food_name: FoodName?,
    @SerialName("calorie_amount")
    val calorie_amount: CalorieAmount
): java.io.Serializable

@Keep
@Serializable
data class FoodName (
    @SerialName("food_name")
    val food_name: String
): java.io.Serializable

@Keep
@Serializable
data class CalorieAmount (
    @SerialName("calorie_amount")
    val calorie_amount: String
): java.io.Serializable