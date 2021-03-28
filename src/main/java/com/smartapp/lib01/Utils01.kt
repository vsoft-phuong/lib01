package com.smartapp.lib01

import android.content.Context
import android.widget.Toast

class Utils01 {
    companion object{
        fun makeToast(context: Context, text:String){
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
        }
    }
}