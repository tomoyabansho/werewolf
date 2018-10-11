package jp.co.seesaa.intern.werewolf.view

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import timber.log.Timber

class MainActivityPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val PAGENUM = 3

    override fun getItem(position: Int) = when (position) {
        0 -> NewsFragment()
        1 -> PreferenceFragment()
        2 -> StatusFragment()
        else -> {
            Timber.d("unreachable value: $position")
            null
        }
    }

    override fun getCount() = PAGENUM
}