package com.project.iviewcapstone.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.google.firebase.auth.FirebaseAuth
import com.project.iviewcapstone.R
import com.project.iviewcapstone.home.HomeActivity
import com.project.iviewcapstone.signup.SignUpActivity
import com.project.iviewcapstone.ui.screen.ScreenActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        auth = FirebaseAuth.getInstance()

        Handler().postDelayed(Runnable {
            checkUserLoginStatus()
        }, 3000L)
    }

    private fun checkUserLoginStatus(){
        val user = auth.currentUser
        val intent: Intent

        if (user != null){
            intent = Intent(this@SplashActivity, HomeActivity::class.java)
        } else {
            intent = Intent(this@SplashActivity, ScreenActivity::class.java)
        }

        startActivity(intent)
        finish()
    }

}