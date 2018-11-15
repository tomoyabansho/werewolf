package jp.co.seesaa.intern.werewolf.view.main

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.co.seesaa.intern.werewolf.R
import jp.co.seesaa.intern.werewolf.data.UserData
import jp.co.seesaa.intern.werewolf.databinding.FragmentStatusBinding
import jp.co.seesaa.intern.werewolf.model.StatusModel

class StatusFragment : Fragment() {
    lateinit var model: StatusModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activity = this.activity as FragmentActivity
        this.model = ViewModelProviders.of(activity).get(StatusModel::class.java)
        this.model.data.postValue(UserData(getString(R.string.preference_test_id), getString(R.string.preference_test_name), 5, 2, 3))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = DataBindingUtil.inflate<FragmentStatusBinding>(inflater, R.layout.fragment_status, container, false)

        binding.setLifecycleOwner(this)
        binding.statusModel = model

        return binding.root
    }
}