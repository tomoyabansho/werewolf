package jp.co.seesaa.intern.werewolf.view.main

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.bigkoo.alertview.AlertView
import jp.co.seesaa.intern.werewolf.R
import jp.co.seesaa.intern.werewolf.data.UserData
import jp.co.seesaa.intern.werewolf.databinding.ActivityMainBinding
import jp.co.seesaa.intern.werewolf.model.main.StatusModel
import jp.co.seesaa.intern.werewolf.view.game.GameActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val OK = 0
        const val KEY_USERDATA = "key user data"
    }

    val showToastListener = View.OnClickListener {
        AlertView.Builder()
                .setContext(this)
                .setStyle(AlertView.Style.Alert)
                .setTitle(getString(R.string.confirm_play_game))
                .setCancelText(getString(R.string.confirm_player_game_no))
                .setDestructive(getString(R.string.confirm_player_game_ok))
                .setOnItemClickListener { _, position ->
                    when (position) {
                        OK -> transitionGameScene()
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
                listOf(
                        getString(R.string.tab_name_news),
                        getString(R.string.tab_name_status),
                        getString(R.string.tab_name_preference))
        )
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs.setupWithViewPager(pager)
        binding.activity = this
    }

    private fun transitionGameScene() {
        val activity = this as FragmentActivity
        val model = ViewModelProviders.of(activity).get(StatusModel::class.java)
        startActivity(GameActivity.createIntent(this, model.data.value as UserData))
    }
}
