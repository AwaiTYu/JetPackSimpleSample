package com.awaitzhang.touch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var model: MyViewModel? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        model = ViewModelProviders.of(this).get(MyViewModel::class.java)
        textView.setText(model?.number.toString())
        button.setOnClickListener {
            model!!.number++
            textView.setText(model?.number.toString())
        }
        button2.setOnClickListener {
            model!!.number--
            textView.setText(model?.number.toString())
        }
    }
}
