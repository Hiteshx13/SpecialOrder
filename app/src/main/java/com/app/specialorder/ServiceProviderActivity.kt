package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivityServiceProvidersBinding

class ServiceProviderActivity : AppCompatActivity() {

    lateinit var binding: ActivityServiceProvidersBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, ServiceProviderActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_service_providers)
        binding.btnNext.setOnClickListener {

        }
    }
}