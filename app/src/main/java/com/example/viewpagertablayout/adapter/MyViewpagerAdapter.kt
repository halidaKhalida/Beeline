package com.example.viewpagertablayout.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyViewpagerAdapter(val fragments: ArrayList<Fragment>,val titles:ArrayList<String>, fm: FragmentManager):FragmentPagerAdapter(fm) {


    override fun getCount(): Int =fragments.size

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }
}