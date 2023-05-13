package com.example.login_first_projects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        title = "Forgot  password"

        val textView = findViewById<TextView>(R.id.textView)
        val img = findViewById<ImageView>(R.id.img)
        val textView6 = findViewById<TextView>(R.id.textView6)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {

            val intent = Intent(Intent(this,MainActivity4::class.java))
            startActivity(intent)
        }


    }
}