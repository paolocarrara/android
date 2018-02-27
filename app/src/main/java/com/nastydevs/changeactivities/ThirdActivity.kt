package com.nastydevs.changeactivities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    public var name: String = ""
    public var age: Int = 0
    public var male: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val bundle = intent.extras

        if (bundle != null) {
            this.name = if (bundle.containsKey("name")) {
                bundle.getString("name")
            } else {
                "No name"
            }

            this.age = if (bundle.containsKey("age")) {
                bundle.getInt("age")
            } else {
                -1
            }

            this.male = if (bundle.containsKey("male")) {
                bundle.getBoolean("male")
            } else {
                false
            }

            Log.i("name", this.name)
            Log.i("age", this.age.toString())
            Log.i("male", this.male.toString())

            this.setViewValues()
        }
    }

    private fun setViewValues () {
        nameTextView.text = this.name
        ageTextView.text = this.age.toString()
        genderTextView.text = if (this.male) {
            "male"
        } else {
            "female"
        }
    }

    fun goToNextActivity (view: View) {
        val intent = Intent(this, FourthActivity::class.java)
        startActivity(intent)
    }
}
