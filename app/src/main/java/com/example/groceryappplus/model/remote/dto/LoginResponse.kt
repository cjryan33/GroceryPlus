package com.example.groceryappplus.model.remote.dto


data class LoginResponse(
    val token: String,
    val user: User
)