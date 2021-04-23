package com.example.dotify

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dotify.databinding.ActivityItemsBinding

class SongAdapter (private val listOfSongs: List<SongList>): RecyclerView.Adapter<SongAdapter.SongViewHolder>() {
    var onSongClickListener: (name: String) -> Unit = { _ ->  }

    class SongViewHolder(val binding: ActivityItemsBinding): RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongAdapter.SongViewHolder {
        val binding = ActivityItemsBinding.inflate(LayoutInflater.from(parent.context))
        return SongViewHolder(binding)

    }

    override fun onBindViewHolder(holder: SongAdapter.SongViewHolder, position: Int) {
        val sName: SongList = listOfSongs[position]
        with(holder.binding) {
            val adapter = SongAdapter(listOf())
            songName.text = sName.name
            // albumCover.src = song.
            root.setOnClickListener{
                onSongClickListener(sName.name)
            }
        }
    }

    override fun getItemCount(): Int = listOfSongs.size
}