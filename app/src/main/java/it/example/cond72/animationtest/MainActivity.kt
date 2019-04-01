package it.example.cond72.animationtest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable
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

        CrashConfig.Builder.create()
                .backgroundMode(CrashConfig.BACKGROUND_MODE_CRASH) //default: CrashConfig.BACKGROUND_MODE_SHOW_CUSTOM
                .enabled(false) //default: true
                .showErrorDetails(false) //default: true
                .showRestartButton(false) //default: true
                .logErrorOnRestart(false) //default: true
                .trackActivities(true) //default: false
                .minTimeBetweenCrashesMs(2000) //default: 3000
//                .errorDrawable(R.drawable.ic_custom_drawable) //default: bug image
                .restartActivity(MainActivity::class.java) //default: null (your app's launch activity)
//                .errorActivity(YourCustomErrorActivity::class.java) //default: null (default error activity)
//                .eventListener(YourCustomEventListener()) //default: null
                .apply()

        throw RuntimeException("Ecca sangooo")
    }
}