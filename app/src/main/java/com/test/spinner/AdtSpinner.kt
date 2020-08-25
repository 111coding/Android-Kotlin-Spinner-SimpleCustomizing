package com.test.spinner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.spn_item.view.*
import kotlinx.android.synthetic.main.spn_item_list.view.*

class AdtSpinner(context : Context, data : List<String>) : BaseAdapter(){

    val context  = context
    val data = data
    val inflater : LayoutInflater

    init {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getCount(): Int = data.size

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val tem = inflater.inflate(R.layout.spn_item, p2, false)
        tem.tv_spn_text.text = data[p0]
        return tem
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val tem = inflater.inflate(R.layout.spn_item_list, parent, false)
        tem.tv_spn_list_text.text = data[position]
        return tem
    }

    override fun getItem(p0: Int): Any = data.get(p0)

    override fun getItemId(p0: Int): Long = p0.toLong()

}