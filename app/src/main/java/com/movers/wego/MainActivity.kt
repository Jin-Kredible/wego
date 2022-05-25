 package com.movers.wego

import android.os.Bundle
import com.movers.wego.activity.BaseActivity
import com.movers.wego.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
 /**
  * Created by kyounghee2018.kim
  * Date: 2022/05/25
  */

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}