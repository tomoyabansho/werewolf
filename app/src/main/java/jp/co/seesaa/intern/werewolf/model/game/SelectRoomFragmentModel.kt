package jp.co.seesaa.intern.werewolf.model.game

import android.arch.lifecycle.ViewModel
import jp.co.seesaa.intern.werewolf.data.RoomData

class SelectRoomFragmentModel : ViewModel() {
    var roomDatas: List<RoomData>? = null

    fun connectToServer() {
        roomDatas = listOf(
                RoomData("001-abs-124", "大和撫子", listOf()),
                RoomData("001-abs-124", "sabakutani", listOf()),
                RoomData("001-abs-124", "神よ！", listOf()))
    }
}