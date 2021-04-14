package com.example.dotify

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.dotify.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var username: TextView
    private lateinit var userBtn: Button
    private lateinit var prevSong: ImageButton
    private lateinit var nextSong: ImageButton
    private lateinit var play: ImageButton
    private lateinit var changeUsername: EditText
    private lateinit var numPlays: TextView
    private lateinit var binding: ActivityMainBinding
    private val randomNumber = Random.nextInt(1000, 10000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById(R.id.username)
        userBtn = findViewById(R.id.userBtn)
        prevSong = findViewById(R.id.prevSong)
        nextSong = findViewById(R.id.nextSong)
        numPlays = findViewById(R.id.numPlays)
        play = findViewById(R.id.play)
        changeUsername = findViewById(R.id.changeUsername)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {setContentView(root)}

        numPlays.text = randomNumber.toString()

        prevSong.setOnClickListener {
            navPrevClicked()
        }

        nextSong.setOnClickListener {
            navNextClicked()
        }

        play.setOnClickListener {
            playClicked()
        }

        var applyOn = true

        binding.userBtn.setOnClickListener {
            binding.changeUsername.visibility = if (applyOn) {
                binding.userBtn.text = "Apply"
                View.VISIBLE
            } else {
                binding.userBtn.text = "Change User"
                View.INVISIBLE
            }
            binding.username.visibility = if (applyOn) {
                View.GONE
            } else {
                View.VISIBLE
            }
            binding.username.text = changeUsername.text
            applyOn = false
        }


    }
    fun navNextClicked() {
        Log.i("navNextMessage", "Skipping to next track")
        Toast.makeText(this, "Skipping to next track", Toast.LENGTH_SHORT).show()
    }

    fun navPrevClicked() {
        Log.i("navPrevMessage", "Skipping to prev track")
        Toast.makeText(this, "Skipping to prev track", Toast.LENGTH_SHORT).show()
    }

    fun playClicked() {
        numPlays.text = (randomNumber + 1).toString()
    }

}