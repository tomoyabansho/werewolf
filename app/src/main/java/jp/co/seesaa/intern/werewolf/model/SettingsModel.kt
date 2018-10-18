package jp.co.seesaa.intern.werewolf.model

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import jp.co.seesaa.intern.werewolf.data.UserData

class SettingsModel : ViewModel() {
    var data = MutableLiveData<UserData>()
}