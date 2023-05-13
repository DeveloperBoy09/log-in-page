package com.example.login_first_projects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        title = "Register"

        val img = findViewById<ImageView>(R.id.img)
        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText3 = findViewById<EditText>(R.id.editText3)
        val editText4 = findViewById<EditText>(R.id.editText4)
        val btn = findViewById<Button>(R.id.button)
        val textView4 = findViewById<TextView>(R.id.textView4)
        val textView5 = findViewById<TextView>(R.id.textView5)


        btn.setOnClickListener {

            val intent = Intent(Intent(this,MainActivity3::class.java))
            startActivity(intent)
        }

        textView5.setOnClickListener {

            val intent = Intent(Intent(this,MainActivity::class.java))
            startActivity(intent)
        }
    }
}