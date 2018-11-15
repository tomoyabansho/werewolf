package jp.co.seesaa.intern.werewolf.model.game

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import jp.co.seesaa.intern.werewolf.data.RoomData

class SelectRoomFragmentModel : ViewModel() {
    var roomDatas = MutableLiveData<List<RoomData>>()

    fun connectToServer() {

    }
}