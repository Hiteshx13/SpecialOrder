package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivityMyOrdersBinding

class MyOrders2Activity : BaseActivity() {

    lateinit var binding: ActivityMyOrdersBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, MyOrders2Activity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_my_orders)
        binding.llOrder1.setOnClickListener {
            launchActivity(ServiceProviderActivity.getIntent(mContext))
        }
    }
}