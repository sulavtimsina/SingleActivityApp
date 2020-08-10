package com.example.mysingleactivityapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mysingleactivityapp.databinding.Fragment1Binding

class Fragment1 : Fragment() {

    lateinit var binding: Fragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment1Binding.inflate(layoutInflater)
        initializeViews()
        return binding.root
    }

    private fun initializeViews() {
        binding.btn1.setOnClickListener {
            findNavController().navigate(Fragment1Directions.actionFragment1ToFragment2())
        }
    }
}