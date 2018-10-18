package jp.co.seesaa.intern.werewolf.view

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso

class ImageViewBindingAdapter {
    companion object {
        @BindingAdapter("app:imageUrl")
        @JvmStatic
        fun loadImage(view: ImageView, imageUrl: String) {
            Picasso.get()
                    .load(imageUrl)
                    .fit()
                    .centerCrop()
                    .into(view)
        }
    }
}