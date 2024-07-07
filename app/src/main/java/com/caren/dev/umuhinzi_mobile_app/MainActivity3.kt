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
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
            validateRegistration()
        }

    }
    fun validateRegistration(){
        var formErr= false
        var firstName = binding.etFirstName.text.toString()
        if (firstName.isBlank()){
            formErr = true
            binding.tilFirstname.error = "First name is required"
        }
        val lastName = binding.etLastName.text.toString()
        if (lastName.isBlank()){
            formErr= true
            binding.tilLastName.error ="lastnameis required"
        }
        val id =binding.etId.text.toString()
        if (id.isBlank()){
            formErr = true
            binding.tilId.error = "Id nuumber is required"
        }
        val phoneNumber = binding.etPhoneNumber.text.toString()
        if (phoneNumber.isBlank()){
            formErr =true
            binding.tilPhone.error ="phone number is required"
        }
        if (!formErr){
            //proceed to registration
        }
        fun clearForms(){
            binding.tilFirstname.error=null
            binding.tilLastName.error=null
            binding.tilId.error =null
            binding.tilPhone.error = null
        }
    }
}