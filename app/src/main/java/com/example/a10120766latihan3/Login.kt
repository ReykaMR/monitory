
// NIM : 10120766 , NAMA : REYKA MOCHAMMAD RAIHAN , KELAS : IF-9 ,TGL PENGERJAAN : 30/04/23

package com.example.a10120766latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val buttonClick = findViewById<Button>(R.id.button_masuk)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Bio::class.java)
            startActivity(intent)
           }
      }
}
