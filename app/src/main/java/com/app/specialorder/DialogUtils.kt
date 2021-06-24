package com.example.tyr.utils

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.RelativeLayout
import androidx.appcompat.widget.AppCompatButton
import com.app.specialorder.ButtonClickListener
import com.app.specialorder.R


fun showCancelDetailsDialog(
    context: Context?,
    listener: ButtonClickListener

) {
    val mDialog = Dialog(context!!)
    mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    mDialog.setContentView(R.layout.dialog_cancel_order)
    mDialog.setCancelable(true)
    mDialog.window!!.setBackgroundDrawableResource(R.color.colorTransparent)

    var llRoot = mDialog.findViewById<RelativeLayout>(R.id.llRoot)
    var btnCancel = mDialog.findViewById<AppCompatButton>(R.id.btnCancel)

    llRoot.setOnClickListener {
        mDialog.dismiss()
    }
    btnCancel.setOnClickListener (object:View.OnClickListener{
        override fun onClick(view: View) {
            listener.onClick(view)
        }
    })

    val window: Window = mDialog.window!!
    window.setLayout(
        WindowManager.LayoutParams.MATCH_PARENT,
        WindowManager.LayoutParams.WRAP_CONTENT
    )
    val wlp = window.attributes
    wlp.gravity = Gravity.BOTTOM

    wlp.flags = wlp.flags and WindowManager.LayoutParams.FLAG_DIM_BEHIND.inv()
    window.attributes = wlp
    mDialog.show()
}

