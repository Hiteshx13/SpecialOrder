package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivityOrderDetailsBinding

class OrderDetailsActivity : BaseActivity() {

    lateinit var binding: ActivityOrderDetailsBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, OrderDetailsActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_order_details)
//        binding.btnNext.setOnClickListener {
//            launchActivity(ServiceProviderActivity.getIntent(mContext))
//        }
    }
}