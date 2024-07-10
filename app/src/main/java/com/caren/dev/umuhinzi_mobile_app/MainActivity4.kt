package com.caren.dev.umuhinzi_mobile_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain3Binding
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            validateRegistration()
        }

    }

    fun validateRegistration() {
        var formErr = false
        val enterPassword = binding.etPassword.text.toString()
        val confirmPassword = binding.etConfirmPassword.text.toString()

        if (enterPassword.isBlank()) {
            formErr = true
            binding.etPassword.error = "Enter password is required"
        } else {
            binding.etPassword.error = null
        }

        if (confirmPassword.isBlank()) {
            formErr = true
            binding.etConfirmPassword.error = "Confirm password is required"
        } else {
            binding.etConfirmPassword.error = null
        }

        if (enterPassword.isNotBlank() && confirmPassword.isNotBlank() && enterPassword != confirmPassword) {
            formErr = true
            binding.etConfirmPassword.error = "Passwords do not match"
        } else {
            binding.etConfirmPassword.error = null
        }

        if (!formErr) {
            // Proceed to registration
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
    }
}