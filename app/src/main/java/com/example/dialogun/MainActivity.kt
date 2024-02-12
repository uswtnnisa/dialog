package com.example.dialogun

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombol = findViewById<Button>(R.id.tombolDialog)

        tombol.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("judul")
                .setMessage("pesan yang tampil")
                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Tombol Yes Ditekan", Toast.LENGTH_LONG).show()
                })
                .setPositiveButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Tombol No Ditekan", Toast.LENGTH_LONG).show()
                })
                .show()
        }
    }
}