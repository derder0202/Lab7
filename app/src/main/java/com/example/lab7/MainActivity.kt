package com.example.lab7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bai1Btn.setOnClickListener {
            startActivity(Intent(this,Bai1Activity::class.java))
        }
        binding.bai2Btn.setOnClickListener {
            startActivity(Intent(this,Bai2Activity::class.java))
        }
        binding.bai3Btn.setOnClickListener {
            startActivity(Intent(this,Bai3Activity::class.java))
        }
    }
}