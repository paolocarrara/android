package com.nastydevs.changeactivities

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FifthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
    }

    fun changeColor (view: View) {
        val color = Color.parseColor(view.tag.toString())
        window.decorView.setBackgroundColor(color)
        view.setBackgroundColor(color)
    }
}
