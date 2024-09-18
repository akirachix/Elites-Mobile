package com.akirachix.investikatrial.api
import com.akirachix.investikatrial.model.LoginResponse
import com.akirachix.investikatrial.model.LoginRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST


interface ApiInterface {
    @Headers("Content-Type: application/json")
    @POST("auth/login/")
    fun login(@Body loginRequest: LoginRequest): Call<LoginResponse>

}

