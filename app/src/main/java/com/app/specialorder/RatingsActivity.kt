package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivityRatingsBinding

class RatingsActivity : BaseActivity() {

    lateinit var binding: ActivityRatingsBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, RatingsActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_ratings)
        binding.btnSubmit.setOnClickListener {
            finish()
        }
        binding.ivBack.setOnClickListener {
            finish()
        }
    }
}