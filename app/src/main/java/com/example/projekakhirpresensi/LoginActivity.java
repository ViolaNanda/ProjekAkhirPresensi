package com.example.projekakhirpresensi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcomelogin_activity);

        findViewById(R.id.btn_login).setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, Dashboard.class);
            startActivity(intent);
        });

        findViewById(R.id.btn_signup).setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, Dashboard.class);
            startActivity(intent);
        });

        findViewById(R.id.btn_forgotpw).setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
            startActivity(intent);
        });
    }
}
