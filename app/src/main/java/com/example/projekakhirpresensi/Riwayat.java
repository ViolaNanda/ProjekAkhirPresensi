package com.example.projekakhirpresensi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Riwayat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.riwayat_activity);

        // Back button click listener
        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(view ->
                Toast.makeText(Riwayat.this, "Back button clicked!", Toast.LENGTH_SHORT).show()
        );
    }
}
