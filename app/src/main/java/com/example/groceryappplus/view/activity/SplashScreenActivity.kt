package com.example.groceryappplus.view.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.example.groceryappplus.R
import com.example.groceryappplus.databinding.ActivitySplashScreenBinding
import com.example.groceryappplus.model.local.Constants.EMAIL
import com.example.groceryappplus.model.local.Constants.LOGIN_SHARED_PREF
import com.example.groceryappplus.model.local.Constants.PASSWORD

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        animations()
        moveToActivity()
    }

    private fun moveToActivity() {
        Handler().postDelayed({
            if (application.getSharedPreferences(LOGIN_SHARED_PREF, Context.MODE_PRIVATE)
                    .contains(EMAIL) && application.getSharedPreferences(
                    LOGIN_SHARED_PREF,
                    Context.MODE_PRIVATE
                )
                    .contains(PASSWORD)
            ) {
                val intent = Intent(applicationContext, DashboardActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(applicationContext, SignInActivity::class.java)
                startActivity(intent)
            }
        }, 1500)
    }

    private fun animations() {
        val appleAnim = AnimationUtils.loadAnimation(this,R.anim.rotate_translate_for_apple)
        binding.imgApple.startAnimation(appleAnim)

        val cheeseAnim = AnimationUtils.loadAnimation(this,R.anim.rotate_translate_for_cheese)
        binding.imgCheese.startAnimation(cheeseAnim)

        val broccoliAnim = AnimationUtils.loadAnimation(this,R.anim.rotate_translate_for_broccoli)
        binding.imgBroccoli.startAnimation(broccoliAnim)

        val eggAnim = AnimationUtils.loadAnimation(this,R.anim.rotate_translate_for_eggs)
        binding.imgEggs.startAnimation(eggAnim)

        val milkAnim = AnimationUtils.loadAnimation(this,R.anim.rotate_translate_for_milk)
        binding.imgMilk.startAnimation(milkAnim)
    }
}