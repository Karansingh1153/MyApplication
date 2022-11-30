package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class SecondActivity : AppCompatActivity(), Animation.AnimationListener {
    lateinit var image : ImageView
    lateinit var twinAnimation : Animation
    lateinit var logoAnimation : AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        image = findViewById<ImageView>(R.id.logo)
        image.setBackgroundResource(R.drawable.uvpce_logo)
        twinAnimation = AnimationUtils.loadAnimation(this,R.anim.twin_animation)
        twinAnimation.setAnimationListener(this)

        val btn2 = findViewById<Button>(R.id.btn2)

        btn2.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            image.startAnimation(twinAnimation)
        }
    }
    override fun onAnimationStart(p0: Animation?) {
    }

    override fun onAnimationEnd(p0: Animation?) {

    }

    override fun onAnimationRepeat(p0: Animation?) {

    }
}