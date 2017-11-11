package com.locker.famous.follow

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.locker.famous.R
import kotlinx.android.synthetic.main.item_peoples.view.*

/**
 * @description
 * @author fxc
 * @date 2017/11/10.
 */
class PeoplesAdapter(private var ctx: Context, private var list: List<Int>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convert = convertView
        val holder: ViewHolder
        if (convert == null) {
            convert = LayoutInflater.from(ctx).inflate(R.layout.item_peoples, parent, false)
            holder = ViewHolder(convert)
            convert!!.tag = holder
        } else {
            holder = convert.tag as ViewHolder
        }
        holder.image.setImageResource(list[position])
        return convert
    }

    override fun getItem(position: Int): Int {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }

    class ViewHolder(container: View) {
        val image = container.peoples!!
    }
}