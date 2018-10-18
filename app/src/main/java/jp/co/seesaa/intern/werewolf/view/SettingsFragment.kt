package jp.co.seesaa.intern.werewolf.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.co.seesaa.intern.werewolf.R
import jp.co.seesaa.intern.werewolf.data.UserData
import jp.co.seesaa.intern.werewolf.databinding.FragmentSettingsBinding
import jp.co.seesaa.intern.werewolf.model.SettingsModel

class SettingsFragment : Fragment() {
    lateinit var model: SettingsModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = ViewModelProviders.of(this).get(SettingsModel::class.java)
        model.data.postValue(UserData(getString(R.string.preference_test_id), getString(R.string.preference_test_name)))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = DataBindingUtil.inflate<FragmentSettingsBinding>(inflater, R.layout.fragment_settings, container, false)
        binding.setLifecycleOwner(this)
        binding.model = model
        return binding.root
    }
}