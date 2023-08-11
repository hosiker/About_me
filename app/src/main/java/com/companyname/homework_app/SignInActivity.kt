package com.companyname.homework_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.jetbrains.annotations.NotNull

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val LogInbtn = findViewById<Button>(R.id.btn_roll)
        LogInbtn.setOnClickListener {
            val edit_idtext = findViewById<EditText>(R.id.editText)
            val strIdData = edit_idtext.text.toString()
            val strloadIdData = intent.getStringExtra("IdData")


            val edit_passwordtext = findViewById<EditText>(R.id.editText2)
            val strPaaswordData = edit_passwordtext.text.toString()
            val strPasswordIdData = intent.getStringExtra("PasswordData")


            if((strIdData == strloadIdData && strPaaswordData == strPasswordIdData)) {
                Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
                val intent1 = Intent(this, HomeActivity::class.java)
                intent1.putExtra("IdData",strIdData)

                startActivity(intent1)
            }else {
                android.widget.Toast.makeText(this, "아이디/비밀번호를 확인해주세요.", android.widget.Toast.LENGTH_SHORT).show()
            }
        }

        val SignUpbtn = findViewById<Button>(R.id.btn_roll2)
        SignUpbtn.setOnClickListener {
            val intent2 = Intent(this, SignupActivity::class.java)
            startActivity(intent2)
        }


    }

    fun onButtonLogin(v: View) {
        Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
    }

    fun onButtonSignup(v: View) {
        Toast.makeText(this, "회원가입버튼 버튼 눌림", Toast.LENGTH_SHORT).show()
    }


}