package jp.co.seesaa.intern.werewolf.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.co.seesaa.intern.werewolf.R
import jp.co.seesaa.intern.werewolf.databinding.FragmentPreferenceBinding
import jp.co.seesaa.intern.werewolf.model.PreferenceModel

class PreferenceFragment : Fragment() {
    lateinit var model: PreferenceModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        model = ViewModelProviders.of(this).get(PreferenceModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = DataBindingUtil.inflate<FragmentPreferenceBinding>(inflater, R.layout.fragment_preference, container, false)

        binding.setLifecycleOwner(this)
        binding.preferenceModel = model

        return binding.root
    }
}