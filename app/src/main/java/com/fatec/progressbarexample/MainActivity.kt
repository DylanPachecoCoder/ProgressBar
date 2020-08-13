package com.fatec.progressbarexample

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            ObjectAnimator.ofInt(progress_bar, "progress", 0, 100, 0).setDuration(3000).start()
            ObjectAnimator.ofInt(progress_bar_linear, "progress", 0, 100, 0).setDuration(3000).start()
        }
    }
}
