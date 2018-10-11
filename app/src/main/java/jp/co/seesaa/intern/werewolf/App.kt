package jp.co.seesaa.intern.werewolf

import android.app.Application
import android.util.Log
import timber.log.Timber
import timber.log.Timber.DebugTree

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        } else {
            Timber.plant(WerewolfCrashReportingTree())
        }
    }

    private class WerewolfCrashReportingTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            if (priority == Log.ERROR) {
                Log.e("Crash Report", "***** Fatal Error *****")
                Log.d("Crash Report", tag)
                Log.d("Crash Report", message)
            }
        }
    }
}