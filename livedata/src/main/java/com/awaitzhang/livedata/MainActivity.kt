package com.awaitzhang.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var viewModelWithLiveData: ViewModelWithLiveData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModelWithLiveData = ViewModelProviders.of(this).get(ViewModelWithLiveData::class.java)

        viewModelWithLiveData!!.getLikeNumber().observe(this, Observer {
            textView.setText("ლ(′◉❥◉｀ლ) " + it.toString())
        })

        imageButton.setOnClickListener {
            viewModelWithLiveData!!.addNumber(1)
        }

        imageButton2.setOnClickListener {
            viewModelWithLiveData!!.addNumber(-1)
        }

    }
}
