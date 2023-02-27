package com.example.appstreamingnetflix

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appstreamingnetflix.databinding.ActivityStrangerBinding

class StrangerActivity : AppCompatActivity() {
    final lateinit var binding: ActivityStrangerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stranger)

        binding = ActivityStrangerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var videoPath = "android.resource://" + packageName + "/" + R.raw.trailerstrangerthings
        val uri = Uri.parse(videoPath)

        binding.videoView.setVideoURI(uri)
        binding.videoView.requestFocus()

        binding.videoView.setOnCompletionListener {
            Toast.makeText(this@StrangerActivity, "Gracias por verlo", Toast.LENGTH_LONG).show()
        }

        binding.videoView.setOnErrorListener { mp, what, extra ->
            Toast.makeText(this@StrangerActivity, "Ha ocurrido un error", Toast.LENGTH_LONG).show()
            false
        }

        binding.videoView.setOnPreparedListener { mp ->
            binding.videoView.start()
        }
    }
}