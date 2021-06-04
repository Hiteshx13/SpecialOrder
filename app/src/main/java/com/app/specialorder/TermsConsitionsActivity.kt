package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivityTermsBinding

class TermsConsitionsActivity : BaseActivity() {

    lateinit var binding: ActivityTermsBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, TermsConsitionsActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_terms)
        initialization()
    }

    fun initialization() {
        binding.ivBack.setOnClickListener {
            finish()
        }

        binding.btnAgree.setOnClickListener {
            finish()
        }
    }
}