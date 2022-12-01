package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var createbirthdaybutton=findViewById<Button>(R.id.createbirthdaybutton) without extension
        // createbirthdaybutton.setOnClickListener {  } with extension

    }

    fun createcard(view: View) {
        val name1=name.editableText.toString()
       Toast.makeText(this,"Card has been succesfully created",Toast.LENGTH_LONG).show()
        val intent=Intent(this,GreetingCard::class.java)
        intent.putExtra(GreetingCard.NAME_EXTRA,name1)
        startActivity(intent)
    }
}




