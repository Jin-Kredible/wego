package com.movers.wego.activity

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.movers.wego.R
import com.movers.wego.databinding.ActivityBaseBinding
/**
 * Created by kyounghee2018.kim
 * Date: 2022/05/25
 */
abstract class BaseActivity<T: ViewDataBinding>: AppCompatActivity() {

    lateinit var baseBinding: ActivityBaseBinding
    lateinit var activityBinding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        baseBinding = inflate(R.layout.activity_base)
    }

    override fun setContentView(layoutResID: Int) {
        if (baseBinding == null) baseBinding = inflate(R.layout.activity_base)
        activityBinding = inflate(layoutResID)
        baseBinding.flContents.addView(activityBinding.root, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))

        super.setContentView(layoutResID)
    }

    private fun <T: ViewDataBinding> inflate(layoutResID: Int) : T {
        return DataBindingUtil.inflate(layoutInflater, layoutResID, null,false)
    }

    fun replaceFragment(resId: Int, fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(resId, fragment).commitAllowingStateLoss()
    }
}