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

    private val categoryList = ArrayList<Int>()
    private val peopelsList = ArrayList<Int>()

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
        initCategoryData()
        initCategory()
        initPeoples()
        initDetails()
    }

    private fun initCategoryData() {
        for (i in 0 until 10) {
            categoryList.add(R.mipmap.ic_launcher)
        }
    }

    private fun initDetails() {

    }

    private fun initPeoples() {
        peoples.adapter = PeoplesAdapter(this, ArrayList())
        peoples.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            }

        }

    }

    private fun initCategory() {
        category.adapter = CategoryAdapter(this, ArrayList())
        category.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }

}