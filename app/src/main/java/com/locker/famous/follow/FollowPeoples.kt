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
    private val peoplesList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate")
        setContentView(R.layout.activity_follow)
        banner.setImageLoader(GlideImageLoader())
        val list = ArrayList<Int>()
        list.add(R.drawable.categorys_1)
        list.add(R.drawable.categorys_2)
        list.add(R.drawable.categorys_3)
        list.add(R.drawable.categorys_4)
        banner.setImages(list)
        banner.start()
        initCategoryData()
        initCategory()
        initPeopleData()
        initPeoples()
        initDetails()
        banner.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            Log.i("asd", "asdasd")
            if (hasFocus)
                scroll_view.smoothScrollTo(0, 0)
        }
        banner.post {
            banner.requestFocus()
        }
    }

    private fun initPeopleData() {
        for (i in 0 until 10) {
            peoplesList.add(R.drawable.peoples_1)
            peoplesList.add(R.drawable.peoples_2)
        }
    }

    private fun initCategoryData() {
        categoryList.add(R.drawable.categorys_1)
        categoryList.add(R.drawable.categorys_2)
        categoryList.add(R.drawable.categorys_3)
        categoryList.add(R.drawable.categorys_4)
        categoryList.add(R.drawable.categorys_5)
        categoryList.add(R.drawable.categorys_6)
        categoryList.add(R.drawable.categorys_7)
        categoryList.add(R.drawable.categorys_8)
        categoryList.add(R.drawable.categorys_9)
    }

    private fun initDetails() {

    }

    private fun initPeoples() {
        peoples.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
//            startActivity(Intent(this, star.c))
        }
        peoples.adapter = PeoplesAdapter(this, peoplesList)
        peoples.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                scroll_view.smoothScrollTo(0, banner.height)
            }

        }

    }

    private fun initCategory() {
        category.adapter = CategoryAdapter(this, categoryList)
        category.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                scroll_view.smoothScrollTo(0, banner.height)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }

}