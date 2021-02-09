package com.ftiuksw.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class login_page : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun back_second_button(view: View) {
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)}

    fun signup_Text(view: View)
        {
        var intent = Intent(this, signup_page::class.java)
        startActivity(intent)
        }
    }