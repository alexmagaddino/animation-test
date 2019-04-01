package it.example.cond72.animationtest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.kinda.crash.config.CrashConfig

/**
 * Created by alexm on 25/03/2019
 */
class MainActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.anim).setOnClickListener {
            startActivity(Intent(this, AnimationActivity::class.java))
        }

        findViewById<View>(R.id.chart).setOnClickListener {
            startActivity(Intent(this, ChartActivity::class.java))
        }

        throw RuntimeException("Ecca sangooo")
    }
}