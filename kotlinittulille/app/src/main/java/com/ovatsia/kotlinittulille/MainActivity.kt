package com.ovatsia.kotlinittulille

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textShit.text = "elikkäs bissee"

        btnOhyeah.setOnClickListener { view ->
            textShit.text = txtOhyeah.text
        }

    }

}
