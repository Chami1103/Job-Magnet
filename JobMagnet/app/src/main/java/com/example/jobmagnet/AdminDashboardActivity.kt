package com.example.jobmagnet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AdminDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_dashboard)

        val btnUserManagement = findViewById<Button>(R.id.btn_user_management)
        btnUserManagement.setOnClickListener {
            val intent = Intent(this, ManageUserActivity::class.java)
            startActivity(intent)
        }

        val btnAppUpdate = findViewById<Button>(R.id.btn_app_update)
        btnAppUpdate.setOnClickListener {
            val intent = Intent(this, PutUpdateActivity::class.java)
            startActivity(intent)
        }
    }
}
