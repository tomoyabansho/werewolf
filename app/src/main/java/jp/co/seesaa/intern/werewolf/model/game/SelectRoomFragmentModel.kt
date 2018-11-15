package jp.co.seesaa.intern.werewolf.model.game

import android.arch.lifecycle.ViewModel
import jp.co.seesaa.intern.werewolf.data.RoomData

class SelectRoomFragmentModel : ViewModel() {
    lateinit var roomDatas: List<RoomData>

    fun connectToServer() {

    }
}