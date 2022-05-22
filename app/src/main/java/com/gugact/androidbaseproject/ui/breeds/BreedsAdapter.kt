package com.gugact.androidbaseproject.ui.breeds

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gugact.androidbaseproject.databinding.ItemBreedBinding

class BreedsAdapter(private val breedsList: List<String>?) :
    RecyclerView.Adapter<BreedsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(ItemBreedBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.breedName.text = breedsList?.get(position)
    }

    override fun getItemCount() = breedsList?.size ?: 0
    class ViewHolder(val binding: ItemBreedBinding) : RecyclerView.ViewHolder(binding.root)
}