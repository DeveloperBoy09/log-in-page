package com.example.login_first_projects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        title = "Verify"

        val img2 = findViewById<ImageView>(R.id.imageView2)
        val textView = findViewById<TextView>(R.id.textView)
        val img = findViewById<ImageView>(R.id.imageView)
        val textView2 = findViewById<TextView>(R.id.textView2)

        img2.setOnClickListener {

            val intent = Intent(Intent(this,MainActivity3::class.java))
            startActivity(intent)
        }

    }
}