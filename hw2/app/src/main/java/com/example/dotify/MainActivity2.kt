package com.example.dotify

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dotify.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater).apply {setContentView(root)}

        with(binding) {
            val songInfo = listOf<SongList> (
                    SongList("1", "Until I Bleed Out", "The Weeknd", "@drawable/after_hours"),
                    SongList("2", "Alone Again", "The Weeknd",  "@drawable/after_hours"),
                    SongList("3", "Too Late", "The Weeknd",  "@drawable/after_hours"),
                    SongList("4", "Hardest to Love", "The Weeknd",  "@drawable/after_hours"),
                    SongList("5", "Scared to Live", "The Weeknd",  "@drawable/after_hours"),
                    SongList("6", "Snow Child", "The Weeknd",  "@drawable/after_hours"),
                    SongList("7", "Escape From LA", "The Weeknd",  "@drawable/after_hours"),
                    SongList("8", "Heartless", "The Weeknd",  "@drawable/after_hours"),
                    SongList("9", "Faith", "The Weeknd",  "@drawable/after_hours"),
                    SongList("10", "Blinding Lights", "The Weeknd",  "@drawable/after_hours")
                    )
            val adapter = SongAdapter(songInfo)
            info.adapter = adapter

            //adapter.onSongClickListener = { position, name ->
            //    Toast.makeText(this@MainAcitvity2, "Suffled")
            //}

            //shuffleBtn.setOnClickListener = {
            //    adapter.updateSongs(songs.toMutableList().shuffle())
            //}
        }



    }
}

