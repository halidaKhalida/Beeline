package com.example.viewpagertablayout.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.viewpagertablayout.R
import com.example.viewpagertablayout.adapter.MyViewpagerAdapter
import com.example.viewpagertablayout.ui.fragment.FirstFragment
import com.example.viewpagertablayout.ui.fragment.SecondFragment
import com.example.viewpagertablayout.ui.fragment.ThirdFragment
import com.example.viewpagertablayout.util.DepthPageTransformer
import com.example.viewpagertablayout.util.ZoomOutPageTransformer
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var myAdapter:MyViewpagerAdapter
    lateinit var list:ArrayList<Fragment>
    lateinit var titles:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        loadFragments()
        val viewPager=findViewById<ViewPager>(R.id.view_pager)
        val tabLayout=findViewById<TabLayout>(R.id.tabLayour)
        myAdapter=MyViewpagerAdapter(list,titles,supportFragmentManager)
        viewPager.adapter=myAdapter
        tabLayout.setupWithViewPager(viewPager)
        viewPager.setPageTransformer(true, DepthPageTransformer())

    }

    private fun loadFragments() {
        list= ArrayList()
        titles= ArrayList()

        list.add(FirstFragment())
        titles.add("Тарифы")

        list.add(SecondFragment())
        titles.add("Услуги")

        list.add(ThirdFragment())
        titles.add("Роуминг")
        list.add(FirstFragment())
        titles.add("Акции")

        list.add(SecondFragment())
        titles.add("Новости")


    }
}