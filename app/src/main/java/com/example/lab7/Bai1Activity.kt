package com.example.lab7

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.RotateAnimation
import com.example.lab7.databinding.ActivityBai1Binding

class Bai1Activity : AppCompatActivity() {
    lateinit var binding:ActivityBai1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBai1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bai1RotationBtn.setOnClickListener {
            val rotateAnimation = AnimationUtils.loadAnimation(applicationContext,R.anim.rotation)
            binding.bai1ImageView.startAnimation(rotateAnimation)
        }
        binding.bai1ZoomBtn.setOnClickListener {
            val zoomAnimation = AnimationUtils.loadAnimation(applicationContext,R.anim.zoom)
            binding.bai1ImageView.startAnimation(zoomAnimation)
        }
        binding.bai1MovingBtn.setOnClickListener {
            val moveAnimation = AnimationUtils.loadAnimation(applicationContext,R.anim.move)
            binding.bai1ImageView.startAnimation(moveAnimation)
        }
    }
}