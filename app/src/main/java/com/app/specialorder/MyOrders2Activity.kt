package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivityMyOrdersSecondBinding

class MyOrders2Activity : BaseActivity() {

    lateinit var binding: ActivityMyOrdersSecondBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, MyOrders2Activity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_my_orders_second)
        binding.tvCancelOrder.setOnClickListener {
            finish()
        }
        binding.tvGiveRatings.setOnClickListener {
            launchActivity(RatingsActivity.getIntent(mContext))
        }
        binding.tvRepeatOrder.setOnClickListener {
        }
        binding.tvTrackOrder.setOnClickListener {
        }
        binding.llOrder1.setOnClickListener {
            launchActivity(OrderDetails2ctivity.getIntent(mContext))
        }
        binding.llOrder2.setOnClickListener {
            launchActivity(OrderDetails2ctivity.getIntent(mContext))
        }
    }
}