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
        binding =ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnRegister.setOnClickListener{
           val intent =Intent(this,MainActivity5::class.java)
           startActivity(intent)
           validateRegistration()
       }

    }
    fun validateRegistration(){
        var formErr = false
        val enterPassword = binding.etPassword.text.toString()
        if (enterPassword.isBlank()){
            formErr = true
            binding.etPassword.error = "Enter password is required"
        }
        val confirmPassword = binding.etConfirmPassword.text.toString()
        if (confirmPassword.isBlank()){
            formErr = true
            binding.etConfirmPassword.error = "Confirm password is required"
        }

    }
}