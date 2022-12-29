package com.example.groceryappplus.model.remote

import com.example.groceryappplus.model.local.Constants
import com.example.groceryappplus.model.remote.dto.LoginResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST(Constants.LOGIN_END_POINT)
    fun login() : Call<LoginResponse>
}