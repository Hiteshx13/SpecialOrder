package com.app.specialorder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app.specialorder.databinding.ActivityChatBinding
import com.app.specialorder.databinding.ActivitySpDetailsBinding

class ChatActivity : BaseActivity() {

    lateinit var binding: ActivityChatBinding

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, ChatActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_chat)
        binding.ivBack.setOnClickListener {
            finish()
        }
        binding.ivRight.setOnClickListener {
             launchActivity(MyOrders2Activity.getIntent(mContext))
        }
    }
}