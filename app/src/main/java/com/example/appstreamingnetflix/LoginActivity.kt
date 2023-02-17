package com.example.appstreamingnetflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appstreamingnetflix.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    final lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val vistaMenu = Intent(this, MenuActivity::class.java)
            startActivity(vistaMenu)
        }

        binding.button3.setOnClickListener{
            val vistaRegistro = Intent(this, RegistroActivity::class.java)
            startActivity(vistaRegistro)
        }

        binding.imageView4.setOnClickListener{
            val vueltaAtras = Intent(this, MainActivity::class.java)
            startActivity(vueltaAtras)
        }
    }
}