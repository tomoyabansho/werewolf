package jp.co.seesaa.intern.werewolf.view

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import timber.log.Timber

class MainActivityPagerAdapter(fm: FragmentManager, val titles: Array<String>) : FragmentPagerAdapter(fm) {
    private val PAGENUM = 3

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }

    override fun getItem(position: Int) = when (position) {
        0 -> NewsFragment()
        1 -> StatusFragment()
        2 -> SettingsFragment()
        else -> {
            Timber.d("unreachable value: $position")
            null
        }
    }

    override fun getCount() = PAGENUM
}