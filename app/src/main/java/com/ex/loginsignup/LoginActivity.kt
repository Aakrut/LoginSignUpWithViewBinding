package com.ex.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.ex.loginsignup.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var loginBinding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        val view = loginBinding.root
        setContentView(view)

        loginBinding.buttonLogin.setOnClickListener {
            if(loginBinding.emailLogin.text.toString() == "" || loginBinding.passwordLogin.text.toString() == ""){
                Toast.makeText(this, "Please Fill Up All the Fields", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Logged In Successfully", Toast.LENGTH_SHORT).show()
            }
        }

        loginBinding.textCreateNew.setOnClickListener {
           startActivity(Intent(this,SignUpActivity::class.java))
        }
    }
}