package com.ftiuksw.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loginButton(view: View) {
        var intent = Intent(this, login_page::class.java)
        startActivity(intent)}

    fun signupbutton(view: View) {
        var intent = Intent(this, signup_page::class.java)
        startActivity(intent)}


}

