package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivitySpecialOrderBinding

class SpecialOrdersActivity : BaseActivity() {

    lateinit var binding: ActivitySpecialOrderBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, SpecialOrdersActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_special_order)
        binding.btnNext.setOnClickListener {
            launchActivity(ServiceProviderActivity.getIntent(mContext))
        }
    }
}