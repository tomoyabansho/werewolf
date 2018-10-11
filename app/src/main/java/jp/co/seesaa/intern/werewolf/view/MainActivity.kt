package jp.co.seesaa.intern.werewolf.view

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import jp.co.seesaa.intern.werewolf.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager.adapter = MainActivityPagerAdapter(
                supportFragmentManager,
                arrayListOf<String>(
                        getString(R.string.tab_name_news),
                        getString(R.string.tab_name_status),
                        getString(R.string.tab_name_preference)).toTypedArray())
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))

        tabs.setupWithViewPager(pager)
    }
}
