package com.nastydevs.changeactivities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        overridePendingTransition(R.anim.crazy, R.anim.hold)
    }

    override fun onPause() {
        // Whenever this activity is paused (i.e. looses focus because another activity is started etc)
        // Override how this activity is animated out of view
        // The new activity is kept still and this activity is pushed out to the left
        overridePendingTransition(R.anim.hold, R.anim.push_out_to_left)
        super.onPause()
    }

    // https://stackoverflow.com/questions/30284627/how-to-show-and-hide-actionbar-with-appcompat-v-7
    fun goToNextActivity (view: View) {
        val intent = Intent(this, FifthActivity::class.java)
        startActivity(intent)
    }
}
