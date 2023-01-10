package com.example.groceryappplus.model.remote.dto

data class SearchData(
    val __v: Int,
    val _id: String,
    val catId: Int,
    val created: String,
    val description: String,
    val image: String,
    val mrp: Int,
    val position: Int,
    val price: Float,
    val productName: String,
    val quantity: Int,
    val status: Boolean,
    val subId: Int,
    val unit: String
)