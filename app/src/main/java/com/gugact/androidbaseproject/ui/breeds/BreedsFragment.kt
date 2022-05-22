package com.gugact.androidbaseproject.ui.breeds

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.gugact.androidbaseproject.databinding.FragmentBreedsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BreedsFragment : Fragment() {

    private lateinit var binding: FragmentBreedsBinding
    private val viewModel: BreedsViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentBreedsBinding.inflate(inflater, container, false)
        viewModel.breedsList.observe(viewLifecycleOwner) {
            binding.recyclerView.adapter = BreedsAdapter(it?.breedList)
        }
        return binding.root
    }

}