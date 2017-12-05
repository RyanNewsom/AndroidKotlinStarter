package com.ryannewsom.androidkotlinstarter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife

class MainActivity : AppCompatActivity() {

    @BindView(R.id.hello_world_text_view)
    lateinit var mTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
    }
}
