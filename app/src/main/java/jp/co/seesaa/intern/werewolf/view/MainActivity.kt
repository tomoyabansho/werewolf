package jp.co.seesaa.intern.werewolf.view

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.design.widget.TabLayout.GRAVITY_FILL
import android.support.v7.app.AppCompatActivity
import jp.co.seesaa.intern.werewolf.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabs.addTab(tabs.newTab().setText(R.string.tab_name_news))
        tabs.addTab(tabs.newTab().setText(R.string.tab_name_status))
        tabs.addTab(tabs.newTab().setText(R.string.tab_name_preference))
        tabs.tabGravity = GRAVITY_FILL

        pager.adapter = MainActivityPagerAdapter(supportFragmentManager)
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))

        tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
                pager.currentItem = tabs.selectedTabPosition
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
            }
        })
    }
}
