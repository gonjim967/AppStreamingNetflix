package com.example.appstreamingnetflix

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appstreamingnetflix.databinding.ActivitySpiderManBinding

class SpiderManActivity : AppCompatActivity() {
    final lateinit var binding: ActivitySpiderManBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spider_man)

        binding = ActivitySpiderManBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var videoPath = "android.resource://" + packageName + "/" + R.raw.trailerspiderman
        val uri = Uri.parse(videoPath)

        binding.videoView.setVideoURI(uri)
        binding.videoView.requestFocus()

        binding.videoView.setOnCompletionListener {
            Toast.makeText(this@SpiderManActivity, "Gracias por verlo", Toast.LENGTH_LONG).show()
        }

        binding.videoView.setOnErrorListener { mp, what, extra ->
            Toast.makeText(this@SpiderManActivity, "Ha ocurrido un error", Toast.LENGTH_LONG).show()
            false
        }

        binding.videoView.setOnPreparedListener { mp ->
            binding.videoView.start()
        }
    }
}