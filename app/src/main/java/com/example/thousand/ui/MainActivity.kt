package com.example.thousand.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thousand.R
import kotlinx.android.synthetic.main.activity_main.*
import com.example.thousand.ui.single_movie_details.SingleMovie

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val intent = Intent(this, SingleMovie::class.java)
            intent.putExtra("id",299534 )
            this.startActivity(intent)
        }
    }
}
