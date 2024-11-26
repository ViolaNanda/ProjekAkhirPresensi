package com.example.projekakhirpresensi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);

        // Inisialisasi tombol
        Button btnCheckIn = findViewById(R.id.btn_checkin);
        Button btnCheckOut = findViewById(R.id.btn_checkout);
        Button btnAttendanceHistory = findViewById(R.id.btn_attendance_history);

        // Fungsi tombol Presensi Masuk
        btnCheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi saat tombol Presensi Masuk diklik
                Intent intent = new Intent(MainActivity.this, CheckInActivity.class);
                startActivity(intent);
            }
        });

        // Fungsi tombol Presensi Pulang
        btnCheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi saat tombol Presensi Pulang diklik
                Intent intent = new Intent(MainActivity.this, CheckOutActivity.class);
                startActivity(intent);
            }
        });

        // Fungsi tombol Riwayat Kehadiran
        btnAttendanceHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi saat tombol Riwayat Kehadiran diklik
                Intent intent = new Intent(MainActivity.this, AttendanceHistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}
