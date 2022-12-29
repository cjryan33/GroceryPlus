package com.example.groceryappplus.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.groceryappplus.R
import com.example.groceryappplus.databinding.ActivitySignInBinding
import com.example.groceryappplus.view.fragment.LoginFragment
import com.example.groceryappplus.view.fragment.RegisterFragment

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    private lateinit var loginFragment: LoginFragment
    private lateinit var registerFragment: RegisterFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loginFragment = LoginFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frameFragments, loginFragment).commit()
        setupEvents()
    }

    private fun setupEvents() {
        registerFragment = RegisterFragment()
        binding.apply {
            txtSendToRegister.setOnClickListener {
                txtSendToRegister.visibility = View.GONE
                txtSendToLogin.visibility = View.VISIBLE
                supportFragmentManager.beginTransaction().replace(R.id.frameFragments,registerFragment).commit()
            }

            txtSendToLogin.setOnClickListener {
                txtSendToRegister.visibility = View.VISIBLE
                txtSendToLogin.visibility = View.GONE
                supportFragmentManager.beginTransaction().replace(R.id.frameFragments,loginFragment).commit()
            }
        }
    }
}