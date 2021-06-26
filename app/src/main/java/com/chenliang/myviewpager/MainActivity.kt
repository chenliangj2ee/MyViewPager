package com.chenliang.myviewpager

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_tab.view.*


class MainActivity : AppCompatActivity() {

    var tabTitle = arrayListOf("tab1", "tab2", "tab3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * 1、添加fragment
         */

        viewpager.addFragments(TestFragment(R.layout.fragment_1))
        viewpager.addFragments(TestFragment(R.layout.fragment_2), TestFragment(R.layout.fragment_3))

        /**
         * 1、1添加tabLayout 、 titles
         */
        viewpager.setTabLayout(tabLayout, tabTitle)
        /**
         * 1、2添加tabLayout 、 titles,自定义tabLayout layout
         */
        viewpager.setTabLayout(tabLayout, tabTitle, R.layout.layout_tab) {
            it.customView!!.button!!.text = tabTitle[it.position]
        }
        /**
         * 3、添加viewpager选中事件
         */
        viewpager.onPageSelected {
            Toast.makeText(this, "ViewPager选中$it", Toast.LENGTH_SHORT).show()
        }
        /**
         * 4、添加tabLayout选中事件
         */
        viewpager.onTabSelected {
            Toast.makeText(this, "Tab选中$it", Toast.LENGTH_SHORT).show()
        }


    }


}