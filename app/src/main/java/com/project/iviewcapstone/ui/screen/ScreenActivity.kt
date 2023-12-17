package com.project.iviewcapstone.ui.screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.iviewcapstone.R
import com.project.iviewcapstone.databinding.ActivityScreenBinding
import com.project.iviewcapstone.signin.SignInActivity
import com.project.iviewcapstone.signup.SignUpActivity

class ScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnScreen1.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}