package com.caren.dev.umuhinzi_mobile_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain7Binding

class Profile_Page : AppCompatActivity() {
    lateinit var binding: ActivityMain7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain7Binding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnBack.setOnClickListener{
            val intent = Intent(this,Profile_Edit_Page::class.java)
            startActivity(intent)
        }

    }
}