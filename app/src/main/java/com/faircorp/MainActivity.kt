package com.faircorp
import android.os.Bundle

const val WINDOW_NAME_PARAM = "com.faircorp.windowname.attribute"
class MainActivity : BasicActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}