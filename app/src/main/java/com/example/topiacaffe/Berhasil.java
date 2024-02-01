package com.example.topiacaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.topiacaffe.TopiaMenu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Berhasil extends AppCompatActivity {

    private Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berhasil);

        // Dapatkan data inputan dari Intent
        String nama = getIntent().getStringExtra("nama");
        String nomor = getIntent().getStringExtra("nomor");

        // Tampilkan data inputan di layar
        TextView tvNama = findViewById(R.id.tv_nama);
        tvNama.setText("Nama Pelanggan : " + nama);
        TextView tvNomor = findViewById(R.id.tv_nomor);
        tvNomor.setText("Nomor Meja : " + nomor);

        // Mendapatkan tanggal dan waktu hari ini
        Date dateNow = new Date();

        // Format tanggal dan waktu sesuai kebutuhan
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dateAndTime = dateFormat.format(dateNow);

        // Menampilkan tanggal dan waktu pada TextView
        TextView textView = findViewById(R.id.waktu);
        textView.setText(dateAndTime);

        btnMenu = findViewById(R.id.btn_menu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Berhasil.this, TopiaMenu.class);
                startActivity(intent);
            }
        });
    }

}