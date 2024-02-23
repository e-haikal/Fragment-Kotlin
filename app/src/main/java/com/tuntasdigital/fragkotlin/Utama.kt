package com.tuntasdigital.fragkotlin

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentContainerView

class Utama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.utama)

        val btn_chat:Button = findViewById(R.id.btn_chat)
        val btn_status:Button = findViewById(R.id.btn_status)
        val fc_konten:FragmentContainerView = findViewById(R.id.fc_konten)

        btn_chat.setOnClickListener {
            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            ft.replace(fc_konten.id, ChatFragment())
            ft.commit()
        }
        btn_status.setOnClickListener {
            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            ft.replace(fc_konten.id, StatusFragment())
            ft.commit()
        }
    }
}