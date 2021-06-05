package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivityServicesProviderBinding

class ServiceProviderActivity : BaseActivity() {

    lateinit var binding: ActivityServicesProviderBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, ServiceProviderActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_services_provider)
        binding.btnSendRequest.setOnClickListener {
            launchActivity(TermsConsitionsActivity.getIntent(mContext))
        }
        binding.cb1.setOnClickListener {
            binding.cb1.isSelected = !binding.cb1.isSelected
            binding.cb2.setOnClickListener {
                binding.cb2.isSelected = !binding.cb2.isSelected
            }
            binding.cb3.setOnClickListener {
                binding.cb3.isSelected = !binding.cb3.isSelected
            }
            binding.cb4.setOnClickListener {
                binding.cb4.isSelected = !binding.cb4.isSelected

            }
            binding.cb5.setOnClickListener {
                binding.cb5.isSelected = !binding.cb5.isSelected

            }
            binding.cb6.setOnClickListener {
                binding.cb6.isSelected = !binding.cb6.isSelected
            }
        }
    }
}