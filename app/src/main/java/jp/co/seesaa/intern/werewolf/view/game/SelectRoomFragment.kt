package jp.co.seesaa.intern.werewolf.view.game

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.co.seesaa.intern.werewolf.R
import jp.co.seesaa.intern.werewolf.databinding.FragmentSelectRoomBinding
import jp.co.seesaa.intern.werewolf.model.game.SelectRoomFragmentModel

class SelectRoomFragment : Fragment() {
    lateinit var model: SelectRoomFragmentModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activity = this.activity as FragmentActivity
        this.model = ViewModelProviders.of(activity).get(SelectRoomFragmentModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = DataBindingUtil.inflate<FragmentSelectRoomBinding>(inflater, R.layout.fragment_select_room, container, false)
        binding.model = this.model
        val context = this.context
        if (context != null) {
            binding.rooms.adapter = RoomListAdapter(context, this.model)
        }
        return binding.root
    }
}