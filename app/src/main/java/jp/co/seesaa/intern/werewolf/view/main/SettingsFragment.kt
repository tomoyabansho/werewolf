package jp.co.seesaa.intern.werewolf.view.main

import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat
import jp.co.seesaa.intern.werewolf.R

class SettingsFragment : PreferenceFragmentCompat() {
    companion object {
        fun newInstance() = SettingsFragment()
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences)
    }
}