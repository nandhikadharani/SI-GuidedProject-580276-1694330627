package com.example.login.ui.theme

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        val buttonAmazon = findViewById<Button>(R.id.buttonAmazon)
        val buttonMyntra = findViewById<Button>(R.id.buttonMyntra)
        val buttonNykaa = findViewById<Button>(R.id.buttonNykaa)


        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Replace this with your authentication logic
            if (isValidUser(username, password)) {
                // Successful login, navigate to another activity
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
        buttonAmazon.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com"))
            startActivity(intent)
        }
        buttonMyntra.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.myntra.com"))
            startActivity(intent)
        }
        buttonNykaa.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nykaa.com"))
            startActivity(intent)
        }
    }

    private fun isValidUser(username: String, password: String): Boolean {
        return username == "your_username" && password == "your_password"
    }
}