package com.example.noot.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabAdapter (fm:FragmentManager): FragmentPagerAdapter(fm){
    private val fragments = mutableListOf<Fragment>()
    private val fragmentTitle = mutableListOf<String>()

    override fun getItem(position: Int): Fragment {
       return fragments[position]
    }
    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitle[position]
    }
    fun addFragment(fragment: Fragment, title:String){
        fragments.add(fragment)
        fragmentTitle.add(title)
    }


}