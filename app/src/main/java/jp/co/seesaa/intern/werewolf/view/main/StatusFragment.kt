package jp.co.seesaa.intern.werewolf.view.main

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.co.seesaa.intern.werewolf.R
import jp.co.seesaa.intern.werewolf.data.UserData
import jp.co.seesaa.intern.werewolf.databinding.FragmentStatusBinding
import jp.co.seesaa.intern.werewolf.model.main.StatusModel

class StatusFragment : Fragment() {
    private lateinit var model: StatusModel

    companion object {
        fun newInstance() = StatusFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        model = ViewModelProviders.of(requireActivity()).get(StatusModel::class.java)
        model.data.postValue(UserData(getString(R.string.preference_test_id), getString(R.string.preference_test_name), 5, 2, 3))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        FragmentStatusBinding.inflate(inflater, container, false)
        val binding = DataBindingUtil.inflate<FragmentStatusBinding>(inflater, R.layout.fragment_status, container, false)

        binding.setLifecycleOwner(this)
        binding.statusModel = model

        return binding.root
    }
}