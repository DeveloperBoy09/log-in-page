package com.example.login_first_projects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext,"onCreate Called",Toast.LENGTH_LONG).show()

        title = "Login"

        val img = findViewById<ImageView>(R.id.img)
        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val editText2 = findViewById<TextView>(R.id.editText2)
        val editText = findViewById<TextView>(R.id.editText)
        val textView3 = findViewById<TextView>(R.id.textView3)
        val btn = findViewById<Button>(R.id.button)
        val textView4 = findViewById<TextView>(R.id.textView4)
        val textView5 = findViewById<TextView>(R.id.textView5)

        btn.setOnClickListener {

            val intent = Intent(Intent(this,MainActivity2::class.java))
            startActivity(intent)
        }

        textView5.setOnClickListener {

            val intent = Intent(Intent(this,MainActivity2::class.java))
            startActivity(intent)
        }

        textView3.setOnClickListener {

            val intent = Intent(Intent(this,MainActivity3::class.java))
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(applicationContext,"onStart Called",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(applicationContext,"onResume Called",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(applicationContext,"onPause Called",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(applicationContext,"onStop Called",Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(applicationContext,"onRestart Called",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(applicationContext,"onDestroy Called",Toast.LENGTH_LONG).show()
    }
}