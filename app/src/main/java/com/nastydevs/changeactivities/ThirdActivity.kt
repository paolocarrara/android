package com.nastydevs.changeactivities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.w3c.dom.Text

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
        val nameTextView = findViewById<TextView>(R.id.name)
        nameTextView.text = this.name

        val ageTextView = findViewById<TextView>(R.id.age)
        ageTextView.text = this.age.toString()

        val genderTextView = findViewById<TextView>(R.id.gender)
        genderTextView.text = if (this.male) {
            "male"
        } else {
            "female"
        }
    }
}
