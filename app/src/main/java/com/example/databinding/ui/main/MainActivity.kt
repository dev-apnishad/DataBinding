package com.example.databinding.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.databinding.R
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var description: String = "Before"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.description = description

        binding.tvDesc.setOnClickListener { updateToAfter() }
    }

    private fun updateToAfter() {
        Log.d("MainActivity", "description: $description")
        description = "After"
        Log.d("MainActivity", "description: $description")
    }
}