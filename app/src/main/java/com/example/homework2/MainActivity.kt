package com.example.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun changeToNextActivity(view: View){
        val intentChangeToNextActivity = Intent (this, NewActivity::class.java)
        startActivity(intentChangeToNextActivity)
    }

}