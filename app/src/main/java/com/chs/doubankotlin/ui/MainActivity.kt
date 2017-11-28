package com.chs.doubankotlin.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v4.content.ContextCompat
import android.view.View
import com.chs.doubankotlin.R
import com.chs.doubankotlin.base.BaseActivity
import com.chs.doubankotlin.base.BaseContract
import com.chs.doubankotlin.ui.home.FindFragment
import com.chs.doubankotlin.ui.home.HomeFragment
import com.chs.doubankotlin.ui.home.MineFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), View.OnClickListener {

    var homeFragment : HomeFragment? = null
    var findFragment : FindFragment? = null
    var mineFragment : MineFragment? = null

    override fun initPresenter(): BaseContract.Presenter {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragment(savedInstanceState);
        setRadioButton()
    }

    private fun setRadioButton() {
        rb_home.isChecked = true
        rb_home.setTextColor(ContextCompat.getColor(this,R.color.black))
        rb_home.setOnClickListener(this)
        rb_find.setOnClickListener(this)
        rb_mine.setOnClickListener(this)
    }

    private fun initFragment(savedInstanceState: Bundle?) {
        if(savedInstanceState !=null){
            val fragments : List<Fragment> = supportFragmentManager.fragments
            for (item in fragments){
                if(item is HomeFragment){
                    homeFragment = item
                }
                if(item is FindFragment){
                    findFragment = item
                }
                if(item is MineFragment){
                    mineFragment = item
                }
            }
        }else{
            homeFragment = HomeFragment()
            findFragment = FindFragment()
            mineFragment = MineFragment()
            val fragmentTrans = supportFragmentManager.beginTransaction()
            fragmentTrans.add(R.id.fl_content,homeFragment)
            fragmentTrans.add(R.id.fl_content,findFragment)
            fragmentTrans.add(R.id.fl_content,mineFragment)
            fragmentTrans.commit()
        }
        supportFragmentManager.beginTransaction().show(homeFragment)
                .hide(findFragment)
                .hide(mineFragment)
                .commit()
    }
    override fun onClick(v: View?) {
        clearState()
        val beginTransaction = supportFragmentManager.beginTransaction()
        hideFragment(beginTransaction);
        when(v?.id){
            R.id.rb_home -> {
                rb_home.isChecked = true
                rb_home.setTextColor(ContextCompat.getColor(this,R.color.black))
                beginTransaction.show(homeFragment)
                        .commit()
            }
            R.id.rb_find ->{
                rb_find.isChecked = true
                rb_find.setTextColor(ContextCompat.getColor(this,R.color.black))
                beginTransaction.show(findFragment)
                        .commit()
            }
            R.id.rb_mine ->{
                rb_mine.isChecked = true
                rb_mine.setTextColor(ContextCompat.getColor(this,R.color.black))
                beginTransaction.show(mineFragment)
                        .commit()
            }
        }
    }

    private fun clearState() {
        rg_root.clearCheck()
        rb_home.setTextColor(ContextCompat.getColor(this,R.color.gray))
        rb_mine.setTextColor(ContextCompat.getColor(this,R.color.gray))
        rb_find.setTextColor(ContextCompat.getColor(this,R.color.gray))
    }

    private fun hideFragment(transaction: FragmentTransaction) {
            transaction.hide(findFragment)
            .hide(homeFragment)
            .hide(mineFragment)
    }
}
