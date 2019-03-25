package it.example.cond72.animationtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable

/**
 * Created by alexm on 25/03/2019
 */
class MainActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<LottieAnimationView>(R.id.animationView)?.apply {
            setAnimation("lottie.json")
            repeatCount = LottieDrawable.INFINITE
            playAnimation()
            setOnClickListener{
                (it as LottieAnimationView).also {
                    if(it.isAnimating) it.pauseAnimation()
                    else it.resumeAnimation()
                }
            }
        }
    }

}