package com.caren.dev.umuhinzi_mobile_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain5Binding
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMain6Binding
import com.caren.dev.umuhinzi_mobile_app.databinding.ActivityMainBinding

class MainActivity6 : AppCompatActivity() {
    lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvViewMore.setOnClickListener{
            val intent = Intent(this,MainActivity7::class.java)
            startActivity(intent)
        }

    }
}