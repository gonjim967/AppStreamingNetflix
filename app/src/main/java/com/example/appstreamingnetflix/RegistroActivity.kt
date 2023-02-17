package com.example.appstreamingnetflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appstreamingnetflix.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {
    final lateinit var binding: ActivityRegistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView4.setOnClickListener{
            val vueltaAtras = Intent(this, LoginActivity::class.java)
            startActivity(vueltaAtras)
        }
    }
}
