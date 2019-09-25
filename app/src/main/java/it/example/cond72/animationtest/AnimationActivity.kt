package it.example.cond72.animationtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable

/**
 * Created by alexm on 26/03/2019
 */
class AnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        supportActionBar?.setHomeButtonEnabled(true)

        findViewById<LottieAnimationView>(R.id.animationView)?.apply {
            setAnimation("lottie.json")
            repeatCount = LottieDrawable.INFINITE
            playAnimation()
            setOnClickListener {
                (it as LottieAnimationView).also { lottie ->
                    if (lottie.isAnimating) lottie.pauseAnimation()
                    else lottie.resumeAnimation()
                }
            }
        }
    }
}