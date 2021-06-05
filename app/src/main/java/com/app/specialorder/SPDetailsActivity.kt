package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivitySpDetailsBinding

class SPDetailsActivity : BaseActivity() {

    lateinit var binding: ActivitySpDetailsBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, SPDetailsActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sp_details)
        binding.ivBack.setOnClickListener {
            finish()
        }
        binding.llData.setOnClickListener {
            launchActivity(MyOrdersActivity.getIntent(mContext))
        }
    }
}