package com.example.projekakhirpresensi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword_activity);

        // Bind views
        EditText emailEditText = findViewById(R.id.et_email_reset);
        EditText phoneEditText = findViewById(R.id.et_phone_reset);
        Button sendButton = findViewById(R.id.btn_send_reset);

        // Set button click listener
        sendButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString();
            String phone = phoneEditText.getText().toString();

            if (email.isEmpty() || phone.isEmpty()) {
                Toast.makeText(ForgotPasswordActivity.this, "Harap isi email atau nomor telepon", Toast.LENGTH_SHORT).show();
            } else {
                // Simulasi pengiriman data
                Toast.makeText(ForgotPasswordActivity.this, "Reset password dikirim ke: " + email, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
