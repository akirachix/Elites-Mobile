package com.akirachix.investikatrial.model

data class LoginRequest(val username: String, val password: String)
data class LoginResponse(val status: String, val message: String)
