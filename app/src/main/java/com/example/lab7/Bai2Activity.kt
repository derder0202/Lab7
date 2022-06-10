package com.example.lab7

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.lab7.databinding.ActivityBai2Binding

class Bai2Activity : AppCompatActivity() {
    lateinit var binding:ActivityBai2Binding
    lateinit var imageView:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBai2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val allBtn = binding.bai2AllBtn
        val nobiBtn = binding.bai2NobiBtn
        val doreBtn = binding.bai2DoreBtn
        imageView = binding.bai2ImageView
        allBtn.setOnClickListener {
            showImage("")
        }
        nobiBtn.setOnClickListener {
            showImage("nobita")
        }
        doreBtn.setOnClickListener {
            showImage("dore")
        }


    }
    private fun showImage(img:String){
        //hide img
        val anim = ObjectAnimator.ofFloat(imageView,"translationX",0f,500f)
        anim.duration = 2000
        val anim1 = ObjectAnimator.ofFloat(imageView,"alpha",1f,0f)
        anim1.duration = 2000
        //show
        val anim2 = ObjectAnimator.ofFloat(imageView,"translationX",-500f,0f)
        anim2.duration = 2000
        val anim3 = ObjectAnimator.ofFloat(imageView,"alpha",0f,1f)
        anim3.duration = 2000

        val animSet = AnimatorSet()
        animSet.play(anim2).with(anim3).after(anim).after(anim1)
        animSet.start()

        anim1.addListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator?) {
                TODO("Not yet implemented")
            }

            override fun onAnimationEnd(p0: Animator?) {
                if(img=="nobita"){
                    imageView.setImageResource(R.drawable.nobita)
                }
                if(img=="dore"){
                    imageView.setImageResource(R.drawable.doraemon)
                }
            }

            override fun onAnimationCancel(p0: Animator?) {
                TODO("Not yet implemented")
            }

            override fun onAnimationRepeat(p0: Animator?) {
                TODO("Not yet implemented")
            }

        })
    }
}