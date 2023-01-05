package com.example.groceryappplus.model.remote.dto

data class RegisterResponse(
    val `data`: Data,
    val error: Boolean,
    val message: String
)