package com.caren.dev.umuhinzi_mobile_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain8Binding

class Profile_Edit_Page : AppCompatActivity() {
    lateinit var binding: ActivityMain8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain8Binding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnEditDetails.setOnClickListener{
            val intent = Intent(this, Profile_Page::class.java)
            startActivity(intent)
        binding.etSave.setOnClickListener{
            val intent = Intent(this, Profile_Page::class.java)
            startActivity(intent)
        }
        }

    }
}