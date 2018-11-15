package jp.co.seesaa.intern.werewolf.view.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.bigkoo.alertview.AlertView
import jp.co.seesaa.intern.werewolf.R
import jp.co.seesaa.intern.werewolf.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val OK = 0
    }

    val showToastListener = View.OnClickListener {
        AlertView.Builder()
                .setContext(this)
                .setStyle(AlertView.Style.Alert)
                .setTitle("ゲームをプレイしますか？")
                .setCancelText("いいえ")
                .setDestructive("はい")
                .setOnItemClickListener { _, position ->
                    when (position) {
                        OK -> Toast.makeText(this, "play game!", Toast.LENGTH_SHORT).show()
                    }
                }
                .build()
                .show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        pager.adapter = MainActivityPagerAdapter(
                supportFragmentManager,
                arrayListOf<String>(
                        getString(R.string.tab_name_news),
                        getString(R.string.tab_name_status),
                        getString(R.string.tab_name_preference)).toTypedArray())
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs.setupWithViewPager(pager)
        binding.activity = this
    }
}
