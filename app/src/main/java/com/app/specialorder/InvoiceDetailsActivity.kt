package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivityInvoiceDetailsBinding

class InvoiceDetailsActivity : BaseActivity() {

    lateinit var binding: ActivityInvoiceDetailsBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, InvoiceDetailsActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_invoice_details)

        binding.btnAccept.setOnClickListener {
            binding.btnChat.visibility = View.VISIBLE
            binding.btnPayNow.visibility = View.VISIBLE
            binding.btnAccept.visibility = View.GONE
        }

        binding.ivBack.setOnClickListener { finish() }
        binding.btnChat.setOnClickListener { launchActivity(ChatActivity.getIntent(mContext)) }
        binding.btnPayNow.setOnClickListener { launchActivity(MyOrders2Activity.getIntent(mContext)) }
    }
}