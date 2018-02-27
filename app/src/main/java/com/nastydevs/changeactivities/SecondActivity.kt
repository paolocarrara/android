package com.nastydevs.changeactivities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun goToNextActivity (view: View) {
        val intent = Intent(this, ThirdActivity::class.java)
        val bundle = Bundle()

        bundle.putString("name", "Paolo")
        bundle.putInt("age", 27)
        bundle.putBoolean("male", true)

        intent.putExtras(bundle)

        startActivity(intent)
    }
}
