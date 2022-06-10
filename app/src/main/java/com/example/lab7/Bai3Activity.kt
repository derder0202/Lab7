package com.example.lab7

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.Interpolator
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import com.example.lab7.databinding.ActivityBai3Binding

class Bai3Activity : AppCompatActivity() {
    lateinit var binding: ActivityBai3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBai3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val hour = binding.bai3Hour
        val minute = binding.bai3Minute
        val second = binding.bai3Second

        val animHour = animTime(hour,43200000)
        val animMin = animTime(minute,3600000)
        val animSec = animTime(second,60000)
        val animSet = AnimatorSet()
        animSet.playTogether(animHour,animSec,animMin)
        animSet.start()


    }
    private fun animTime(imageView: ImageView,durationView:Long):ObjectAnimator{
        val anim = ObjectAnimator.ofFloat(imageView,"rotation",360f)
        anim.apply {
            duration = durationView*2
            repeatCount = Animation.INFINITE
            repeatMode = ValueAnimator.RESTART
            startDelay = 0
            interpolator = LinearInterpolator()
        }
        return anim
    }
}