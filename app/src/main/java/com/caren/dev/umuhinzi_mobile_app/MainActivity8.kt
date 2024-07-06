package com.caren.dev.umuhinzi_mobile_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain7Binding
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain8Binding

class MainActivity8 : AppCompatActivity() {
    lateinit var binding: ActivityMain8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain8Binding.inflate(layoutInflater)

        setContentView(R.layout.activity_main8)

        binding.btnEditDetails.setOnClickListener{
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }

    }
}