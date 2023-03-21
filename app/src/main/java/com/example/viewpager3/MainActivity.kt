package com.example.viewpager3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.example.viewpager3.Adapters.PagerAdapter
import com.example.viewpager3.Data.MyPager
import com.example.viewpager3.databinding.ActivityMainBinding
import com.example.viewpager3.databinding.TabItemBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var adapter: PagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        MyPager.AddList()
        adapter = PagerAdapter(MyPager.PagerList)
        binding.viewpager.adapter = adapter

        binding.tabLayout.setupWithViewPager(binding.viewpager)

        val tabCount = binding.tabLayout.tabCount


        for (i in 0 until tabCount) {
            val tabItem = TabItemBinding.inflate(layoutInflater)
            val tab = binding.tabLayout.getTabAt(i)
            tab?.customView = tabItem.root

            if (i == 0) {
                tabItem.tabImage.setImageResource(R.drawable.tab_full)
            } else {
                tabItem.tabImage.setImageResource(R.drawable.tab_empty)

            }


        }
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val customView = tab?.customView
                customView?.findViewById<ImageView>(R.id.tab_image)
                    ?.setImageResource(R.drawable.tab_full)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

                val customView = tab?.customView
                customView?.findViewById<ImageView>(R.id.tab_image)
                    ?.setImageResource(R.drawable.tab_empty)
            }


            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

    }
}