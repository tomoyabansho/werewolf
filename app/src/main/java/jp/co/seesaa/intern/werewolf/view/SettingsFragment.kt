package jp.co.seesaa.intern.werewolf.view

import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat
import jp.co.seesaa.intern.werewolf.R

class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences)
    }
}