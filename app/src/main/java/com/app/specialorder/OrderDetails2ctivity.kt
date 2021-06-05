package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivityInvoiceDetailsBinding
import com.app.specialorder.databinding.ActivityOrderDetailsSecondBinding

class OrderDetails2ctivity : BaseActivity() {

    lateinit var binding: ActivityOrderDetailsSecondBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, OrderDetails2ctivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_order_details_second)

        binding.btnCancelOrder.setOnClickListener {
           finish()
        }

        binding.btnChat.setOnClickListener{launchActivity(ChatActivity.getIntent(mContext))}
        binding.btnTrackOrder.setOnClickListener{launchActivity(MyOrders2Activity.getIntent(mContext))}
    }
}