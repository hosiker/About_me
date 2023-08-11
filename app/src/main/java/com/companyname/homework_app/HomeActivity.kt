package com.companyname.homework_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val strData = intent.getStringExtra("IdData")
        val editText = findViewById<EditText>(R.id.editText)

        editText.setText(strData)
        editText.contentDescription = strData

        val btn_close = findViewById<Button>(R.id.buttonThirdActivity)
        btn_close.setOnClickListener{
            Toast.makeText(this,"${strData}", Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}