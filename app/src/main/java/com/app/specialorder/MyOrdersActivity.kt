package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivityMyOrdersBinding

class MyOrdersActivity : BaseActivity() {

    lateinit var binding: ActivityMyOrdersBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, MyOrdersActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_my_orders)
        binding.llOrder1.setOnClickListener {
            launchActivity(OrderDetailsActivity.getIntent(mContext))
        }
    }
}