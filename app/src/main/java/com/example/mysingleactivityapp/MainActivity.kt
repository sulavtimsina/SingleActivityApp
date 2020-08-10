package com.example.mysingleactivityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysingleactivityapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // accessing binding object
        val binding = ActivityMainBinding.inflate(layoutInflater)
    }
}