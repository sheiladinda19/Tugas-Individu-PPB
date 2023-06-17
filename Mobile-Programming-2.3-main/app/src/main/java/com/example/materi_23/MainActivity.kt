package com.example.materi_23
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openYoutube(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.youtube.com")
        startActivity(intent)
    }

    fun openGoogle(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.google.com")
        startActivity(intent)
    }

    fun openGitHub(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.github.com")
        startActivity(intent)
    }

    fun openNetflix(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.netflix.com")
        startActivity(intent)
    }

    fun openSpotify(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.spotify.com")
        startActivity(intent)
    }
}