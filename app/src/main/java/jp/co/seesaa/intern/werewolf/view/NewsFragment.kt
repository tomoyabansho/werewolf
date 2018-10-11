package jp.co.seesaa.intern.werewolf.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.co.seesaa.intern.werewolf.R
import jp.co.seesaa.intern.werewolf.R.string.news_subscription_message
import jp.co.seesaa.intern.werewolf.R.string.news_title_message
import jp.co.seesaa.intern.werewolf.data.News
import jp.co.seesaa.intern.werewolf.databinding.FragmentNewsBinding
import jp.co.seesaa.intern.werewolf.model.NewsModel

class NewsFragment : Fragment() {

    private lateinit var model: NewsModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        model = ViewModelProviders.of(this).get(NewsModel::class.java)

        model.news.postValue(News(getString(news_title_message), getString(news_subscription_message), ""))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = DataBindingUtil.inflate<FragmentNewsBinding>(inflater, R.layout.fragment_news, container, false)

        binding.setLifecycleOwner(this)
        binding.model = model

        return binding.root
    }
}
