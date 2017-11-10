package com.locker.famous.follow

import android.content.Context
import android.widget.ImageView
import com.locker.famous.R
import com.youth.banner.loader.ImageLoader

/**
 * @description
 * @author fxc
 * @date 2017/11/10.
 */
class GlideImageLoader:ImageLoader() {
    override fun displayImage(context: Context?, path: Any?, imageView: ImageView?) {
        imageView?.setImageResource(R.mipmap.ic_launcher)
    }
}