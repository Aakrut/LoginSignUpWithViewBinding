package com.ex.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ex.loginsignup.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var signUpBinding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        signUpBinding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = signUpBinding.root
        setContentView(view)

        signUpBinding.buttonSignup.setOnClickListener {
            if(signUpBinding.emailSignup.text.toString() == "" || signUpBinding.passwordSignup.text.toString() == ""
                || signUpBinding.usernameSignup.text.toString() == "" || signUpBinding.fullnameSignup.text.toString() == ""){
                Toast.makeText(this, "Please Fill Up All The Fields.", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Sign Up SuccessFully", Toast.LENGTH_SHORT).show()
            }
        }

        signUpBinding.textLogin.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }

    }
}