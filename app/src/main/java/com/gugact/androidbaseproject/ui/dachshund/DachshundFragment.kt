package com.gugact.androidbaseproject.ui.dachshund

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import coil.load
import com.gugact.androidbaseproject.databinding.FragmentDachshundBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DachshundFragment : Fragment() {

    private lateinit var binding: FragmentDachshundBinding
    private val viewModel: DachshundViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = FragmentDachshundBinding.inflate(inflater, container, false)
        viewModel.dachshundImage.observe(viewLifecycleOwner) {
            binding.dachshundPicture.load(it?.message)
        }
        binding.dachshundPicture.setOnClickListener {
            viewModel.getDachshundImage()
        }

        return binding.root
    }

}