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
            peli_seleccionada="spiderman"
            val vistaVideo = Intent(this, VideoActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.harry.setOnClickListener{
            peli_seleccionada="harrypotter"
            val vistaVideo = Intent(this, VideoActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.expediente.setOnClickListener{
            peli_seleccionada="expediente"
            val vistaVideo = Intent(this, VideoActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.breaking.setOnClickListener{
            peli_seleccionada="breakingbad"
            val vistaVideo = Intent(this, VideoActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.elite.setOnClickListener{
            peli_seleccionada="elite"
            val vistaVideo = Intent(this, VideoActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.stranger.setOnClickListener{
            peli_seleccionada="strangerthins"
            val vistaVideo = Intent(this, VideoActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.naruto.setOnClickListener{
            peli_seleccionada="naruto"
            val vistaVideo = Intent(this, VideoActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.kimetsu.setOnClickListener{
            peli_seleccionada="kimetsu"
            val vistaVideo = Intent(this, VideoActivity::class.java)
            startActivity(vistaVideo)
        }

        binding.onepiece.setOnClickListener{
            peli_seleccionada="onepiece"
            val vistaVideo = Intent(this, VideoActivity::class.java)
            startActivity(vistaVideo)
        }
    }


}