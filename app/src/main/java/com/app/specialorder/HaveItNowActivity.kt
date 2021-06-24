package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivityHaveItNowBinding

class HaveItNowActivity : BaseActivity() {

    lateinit var binding: ActivityHaveItNowBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, HaveItNowActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_have_it_now)
        initialization()
    }

    fun initialization() {

        binding.ivBack.setOnClickListener {
            finish()
        }
        binding.btnHaveItNow.setOnClickListener {
           launchActivity(MyOrdersActivity.getIntent(mContext))
        }

        binding.tvVisit.setOnClickListener {
            finish()
        }
    }
}