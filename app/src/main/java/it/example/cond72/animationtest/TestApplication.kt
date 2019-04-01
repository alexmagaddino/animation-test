package it.example.cond72.animationtest

import android.app.Application
import com.kinda.crash.config.CrashConfig

/**
 * Created by alexm on 01/04/2019
 */
class TestApplication: Application(){

    override fun onCreate() {
        super.onCreate()
        CrashConfig.Builder.create()
                .backgroundMode(CrashConfig.BACKGROUND_MODE_SHOW_CUSTOM) //default: CrashConfig.BACKGROUND_MODE_SHOW_CUSTOM
                .enabled(false) //default: true
                .showErrorDetails(true) //default: true
                .showRestartButton(true) //default: true
                .logErrorOnRestart(true) //default: true
                .trackActivities(true) //default: false
                .minTimeBetweenCrashesMs(2000) //default: 3000
//                .errorDrawable(R.drawable.ic_custom_drawable) //default: bug image
                .restartActivity(MainActivity::class.java) //default: null (your app's launch activity)
//                .errorActivity(YourCustomErrorActivity::class.java) //default: null (default error activity)
//                .eventListener(YourCustomEventListener()) //default: null
                .apply()

    }

}