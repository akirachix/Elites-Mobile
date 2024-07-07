package com.caren.dev.umuhinzi_mobile_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain3Binding
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain8Binding
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain9Binding

class MainActivity9 : AppCompatActivity() {
    lateinit var binding: ActivityMain9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain9Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ivBack.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
    fun validateRegistration(){
        var formErr= false
        var lastName = binding.etLastname.text.toString()
        if (lastName.isBlank()){
            formErr= true
            binding.tilLast.error ="lastname is required"
        }
    }

    }
