package com.ftiuksw.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class signup_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
    }

    fun back_third_button(view: View) {
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)}

    fun login_text(view: View){
        var intent = Intent(this,login_page::class.java)
        startActivity(intent)}
}

