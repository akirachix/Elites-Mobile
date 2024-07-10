package com.caren.dev.umuhinzi_mobile_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain3Binding
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            validateRegistration()
        }
    }

    fun validateRegistration() {
        var formErr = false
        val enterUserName = binding.etUserName.text.toString()
        if (enterUserName.isBlank()) {
            formErr = true
            binding.tilUserName.error = "Username is required"
        } else {
            binding.tilUserName.error = null
        }

        val enterPassword = binding.etPassword.text.toString()
        if (enterPassword.isBlank()) {
            formErr = true
            binding.tilenterPassword.error = "Password is required"
        } else {
            binding.tilenterPassword.error = null
        }

        if (!formErr) {
            // Proceed to registration
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
    }
}



