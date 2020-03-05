package com.ovatsia.piirto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var mv : MunView = MunView(this, null)
        setContentView(R.layout.activity_main)
    }
}
