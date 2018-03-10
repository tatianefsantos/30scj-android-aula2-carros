package com.example.logonrm.carros.ui.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.example.logonrm.carros.R
import com.example.logonrm.carros.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        carregar()
    }

    fun carregar() {
        val aniamacao = AnimationUtils.loadAnimation(this, R.anim.animacao_splash)
        ivLogoSplash.startAnimation(aniamacao);

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            this.finish()
        }, 3000)
    }
}
