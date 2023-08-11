package com.companyname.homework_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            val edit_Nametext = findViewById<EditText>(R.id.editText3)
            val strNameData = edit_Nametext.text.toString()

            val edit_Idtext = findViewById<EditText>(R.id.editText)
            val strIdData = edit_Idtext.text.toString()


            val edit_Passwordtext = findViewById<EditText>(R.id.editText2)
            val strPasswordData = edit_Passwordtext.text.toString()



            if (strNameData.isNotEmpty() && strIdData.isNotEmpty() && strPasswordData.isNotEmpty()) {
                val intent = Intent(this, SignInActivity::class.java)
                intent.putExtra("IdData", strIdData)
                intent.putExtra("PasswordData", strPasswordData)

                startActivity(intent)
                finish()
            } else {
                android.widget.Toast.makeText(
                    this,
                    "입력되지 않은 정보가 있습니다..",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}