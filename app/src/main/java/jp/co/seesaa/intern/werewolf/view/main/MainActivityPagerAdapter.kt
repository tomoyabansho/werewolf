package jp.co.seesaa.intern.werewolf.view.main

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import timber.log.Timber

class MainActivityPagerAdapter(fm: FragmentManager, private val titles: List<String>) : FragmentPagerAdapter(fm) {
    private val PAGENUM = 3

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }

    override fun getItem(position: Int) = when (position) {
        0 -> NewsFragment.newInstance()
        1 -> StatusFragment.newInstance()
        2 -> SettingsFragment.newInstance()
        else -> {
            Timber.d("unreachable value: $position")
            null
        }
    }

    override fun getCount() = PAGENUM
}