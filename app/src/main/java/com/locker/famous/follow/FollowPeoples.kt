package com.locker.famous.follow

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import com.locker.famous.R
import kotlinx.android.synthetic.main.activity_follow.*

/**
 * @description
 * @author fxc
 * @date 2017/11/10.
 */
class FollowPeoples : Activity() {
    val TAG = "FollowPeoples"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate")
        setContentView(R.layout.activity_follow)
        banner.setImageLoader(GlideImageLoader())
        val list = ArrayList<Int>()
        list.add(R.mipmap.ic_launcher)
        list.add(R.mipmap.ic_launcher)
        list.add(R.mipmap.ic_launcher)
        list.add(R.mipmap.ic_launcher)
        banner.setImages(list)
        banner.start()
        initCategory()
        initPeoples()
        initDetails()
    }

    private fun initDetails() {
        details.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            }

        }

    }

    private fun initPeoples() {
        peoples.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            }

        }

    }

    private fun initCategory() {
        category.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }

}