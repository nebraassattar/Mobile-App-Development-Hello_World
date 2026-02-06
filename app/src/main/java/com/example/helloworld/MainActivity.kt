package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var displayButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } */

        displayButton = findViewById(R.id.display_button)
        displayButton.setOnClickListener {
            val editText : EditText = findViewById(R.id.name_box)
            val greeting /*: TextView*/ = findViewById<TextView>(R.id.message_box)
            var newText /*: String*/ = editText.getText().toString()
            if(newText == "") {
                newText = "World!"
            }
            greeting.setText("Hello " + newText)
        }
    }
}