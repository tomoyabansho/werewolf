package jp.co.seesaa.intern.werewolf.view.game

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class GameActivityPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val pageNum = 1

    override fun getItem(position: Int): Fragment {
        return SelectRoomFragment()
    }

    override fun getCount(): Int {
        return pageNum
    }
}