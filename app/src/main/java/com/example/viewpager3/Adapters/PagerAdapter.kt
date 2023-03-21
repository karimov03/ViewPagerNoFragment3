package com.example.viewpager3.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager3.Data.MyPager
import com.example.viewpager3.databinding.ItempagerBinding

class PagerAdapter(val list: ArrayList<MyPager.PagerData>):androidx.viewpager.widget.PagerAdapter() {
    override fun getCount(): Int =list.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itempagerBinding=ItempagerBinding.inflate(LayoutInflater.from(container.context),container,false)
        itempagerBinding.pagerImage.setImageResource(list[position].image)
        itempagerBinding.tvName.text=list[position].name
        itempagerBinding.tvAbout.text=list[position].about
        container.addView(itempagerBinding.root)

        return itempagerBinding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view= `object` as View
        container.removeView(view)
    }
}