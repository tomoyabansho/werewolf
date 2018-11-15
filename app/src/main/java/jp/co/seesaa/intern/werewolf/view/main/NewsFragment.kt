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
import jp.co.seesaa.intern.werewolf.R.string.*
import jp.co.seesaa.intern.werewolf.data.News
import jp.co.seesaa.intern.werewolf.databinding.FragmentNewsBinding
import jp.co.seesaa.intern.werewolf.model.NewsModel

class NewsFragment : Fragment() {

    private lateinit var model: NewsModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activity = this.activity as FragmentActivity
        this.model = ViewModelProviders.of(activity).get(NewsModel::class.java)
        this.model.news.postValue(News(getString(news_title_message), getString(news_subscription_message), getString(dummy_image_src)))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = DataBindingUtil.inflate<FragmentNewsBinding>(inflater, R.layout.fragment_news, container, false)

        binding.setLifecycleOwner(this)
        binding.newsModel = model

        return binding.root
    }
}
