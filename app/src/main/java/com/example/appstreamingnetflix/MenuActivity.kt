package com.example.appstreamingnetflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appstreamingnetflix.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    final lateinit var binding: ActivityMenuBinding
    var peli_seleccionada = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.spider.setOnClickListener{
            val vistaVideo = Intent(this, SpiderManActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.harry.setOnClickListener{
            val vistaVideo = Intent(this, HarryActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.expediente.setOnClickListener{
            val vistaVideo = Intent(this, ExpedienteActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.breaking.setOnClickListener{
            val vistaVideo = Intent(this, BreakingBadActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.elite.setOnClickListener{
            val vistaVideo = Intent(this, EliteActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.stranger.setOnClickListener{
            val vistaVideo = Intent(this, StrangerActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.naruto.setOnClickListener{

            val vistaVideo = Intent(this, NarutoActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.kimetsu.setOnClickListener{
            val vistaVideo = Intent(this, KimetsuActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.onepiece.setOnClickListener{
            val vistaVideo = Intent(this, OnePieceActivity::class.java)
            startActivity(vistaVideo)
        }
    }


}