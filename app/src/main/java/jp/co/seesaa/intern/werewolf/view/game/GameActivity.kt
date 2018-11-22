package jp.co.seesaa.intern.werewolf.view.game

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import jp.co.seesaa.intern.werewolf.R
import jp.co.seesaa.intern.werewolf.data.UserData
import jp.co.seesaa.intern.werewolf.databinding.ActivityGameBinding
import jp.co.seesaa.intern.werewolf.view.main.MainActivity
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    companion object {
        private const val USER_DATA_KEY = "user_data_key"
        fun createIntent(context: Context, userData: UserData): Intent {
            return Intent(context, GameActivity::class.java).apply {
                putExtra(USER_DATA_KEY, userData)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityGameBinding>(this, R.layout.activity_game)
        val userData = intent.getSerializableExtra(MainActivity.KEY_USERDATA) as UserData

        pager.adapter = GameActivityPagerAdapter(supportFragmentManager)

        binding.activity = this
    }

}
