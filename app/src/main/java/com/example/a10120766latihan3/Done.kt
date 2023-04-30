
// NIM : 10120766 , NAMA : REYKA MOCHAMMAD RAIHAN , KELAS : IF-9 ,TGL PENGERJAAN : 30/04/23

package com.example.a10120772latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Done : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)
        this.bindExtras()
    }
    private fun bindExtras(){
        var nama = intent.extras?.getString("nama")
        var umur = intent.extras?.getString("umur")
        var tvDone = findViewById<TextView>(R.id.text_beres)
        tvDone.setText("Beres! Sekarang "+ nama + " udah bisa ngecek penggunaan HP " + nama + " tiap hari buat bantu " + nama + " ngatur waktu :D")
        }
}