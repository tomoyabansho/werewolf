package jp.co.seesaa.intern.werewolf.view.game

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import jp.co.seesaa.intern.werewolf.R
import jp.co.seesaa.intern.werewolf.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityGameBinding>(this, R.layout.activity_game)

        binding.activity = this
    }

}
