package com.example.mysingleactivityapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mysingleactivityapp.databinding.Fragment2Binding

class Fragment2 : Fragment() {

    lateinit var binding: Fragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment2Binding.inflate(layoutInflater)
        initializeViews()
        return binding.root
    }

    private fun initializeViews() {
        binding.btn2.setOnClickListener {
            findNavController().navigate(Fragment2Directions.actionFragment2ToFragment1())
        }
    }
}