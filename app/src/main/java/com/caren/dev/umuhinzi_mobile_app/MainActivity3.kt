package com.caren.dev.umuhinzi_mobile_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain2Binding
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnNextPage.setOnClickListener{
            validateRegistration()
        }

    }
    fun validateRegistration() {
        var formErr = false
        val firstName = binding.etFirstName.text.toString()
        if (firstName.isBlank()) {
            formErr = true
            binding.tilFirstname.error = "First name is required"
        } else {
            binding.tilFirstname.error = null
        }

        val lastName = binding.etLastName.text.toString()
        if (lastName.isBlank()) {
            formErr = true
            binding.tilLastName.error = "Last name is required"
        } else {
            binding.tilLastName.error = null
        }

        val id = binding.etId.text.toString()
        if (id.isBlank()) {
            formErr = true
            binding.tilId.error = "ID number is required"
        } else {
            binding.tilId.error = null
        }

        val phoneNumber = binding.etPhoneNumber.text.toString()
        if (phoneNumber.isBlank()) {
            formErr = true
            binding.tilPhone.error = "Phone number is required"
        } else {
            binding.tilPhone.error = null
        }

        if (!formErr) {
            // Proceed to registration
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
        fun clearForms(){
            binding.tilFirstname.error=null
            binding.tilLastName.error=null
            binding.tilId.error =null
            binding.tilPhone.error = null
        }
    }
