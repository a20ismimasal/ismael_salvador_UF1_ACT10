package com.example.ismael_salvador_uf1_act10

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private var editTextName: EditText? = null
    private var editTextSurname: EditText? = null
    private var editTextAge: EditText? = null
    private var editTextUsername: EditText? = null
    private var editTextPassword: EditText? = null
    private var buttonSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        editTextName = findViewById(R.id.editTextName)
        editTextSurname = findViewById(R.id.editTextSurname)
        editTextAge = findViewById(R.id.editTextAge)
        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonSubmit = findViewById(R.id.buttonSubmit)

        buttonSubmit?.setOnClickListener {
            val name = editTextName?.text.toString()
            val surname = editTextSurname?.text.toString()
            val age = editTextAge?.text.toString()
            val username = editTextUsername?.text.toString()
            val password = editTextPassword?.text.toString()

            Toast.makeText(this, "Registro completo: $name $surname", Toast.LENGTH_SHORT).show()
        }
    }
}