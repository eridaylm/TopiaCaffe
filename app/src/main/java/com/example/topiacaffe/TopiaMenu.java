package com.example.topiacaffe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class TopiaMenu extends AppCompatActivity implements View.OnClickListener {
    private Button btnPesan;
    private int mCount1 = 0;
    private TextView mShowCount1;
    private int mCount2 = 0;
    private TextView mshowCount2;
    private int mCount3 = 0;
    private TextView mshowCount3;
    private int mCount4 = 0;
    private TextView mshowCount4;
    private int mCount5 = 0;
    private TextView mshowCount5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topia_menu);

        mShowCount1 = (TextView) findViewById(R.id.show_count_1);
        ImageButton btnTambah1 = findViewById(R.id.btn_tambah1);
        ImageButton btnKurang1 = findViewById(R.id.btn_kurang1);
        Button btnAdd1 = findViewById(R.id.btn_add1);

        mshowCount2 = (TextView) findViewById(R.id.show_count_2);
        ImageButton btnTambah2 = findViewById(R.id.btn_tambah2);
        ImageButton btnKurang2 = findViewById(R.id.btn_kurang2);
        Button btnAdd2 = findViewById(R.id.btn_add2);


        mshowCount3 = (TextView) findViewById(R.id.show_count_3);
        ImageButton btnTambah3 = findViewById(R.id.btn_tambah3);
        ImageButton btnKurang3 = findViewById(R.id.btn_kurang3);
        Button btnAdd3 = findViewById(R.id.btn_add3);

        mshowCount4 = (TextView) findViewById(R.id.show_count_4);
        ImageButton btnTambah4 = findViewById(R.id.btn_tambah4);
        ImageButton btnKurang4 = findViewById(R.id.btn_kurang4);
        Button btnAdd4 = findViewById(R.id.btn_add4);

        mshowCount5 = (TextView) findViewById(R.id.show_count_5);
        ImageButton btnTambah5 = findViewById(R.id.btn_tambah5);
        ImageButton btnKurang5 = findViewById(R.id.btn_kurang5);
        Button btnAdd5 = findViewById(R.id.btn_add5);


        Button btnPesan = findViewById(R.id.btn_pesan);

        btnTambah1.setOnClickListener(this);
        btnKurang1.setOnClickListener(this);
        btnAdd1.setOnClickListener(this);

        btnTambah2.setOnClickListener(this);
        btnKurang2.setOnClickListener(this);
        btnAdd2.setOnClickListener(this);

        btnTambah3.setOnClickListener(this);
        btnKurang3.setOnClickListener(this);
        btnAdd3.setOnClickListener(this);

        btnTambah4.setOnClickListener(this);
        btnKurang4.setOnClickListener(this);
        btnAdd4.setOnClickListener(this);

        btnTambah5.setOnClickListener(this);
        btnKurang5.setOnClickListener(this);
        btnAdd5.setOnClickListener(this);

        btnPesan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_tambah1) {
            mCount1++;
            if (mShowCount1 != null) {
                mShowCount1.setText(Integer.toString(mCount1));
            }
        } else if (view.getId() == R.id.btn_kurang1) {
            mCount1--;
            if (mShowCount1 != null) {
                mShowCount1.setText(Integer.toString(mCount1));
            }
        } else if (view.getId() == R.id.btn_add1) {
            // Create a toast show it.
            Toast toast = Toast.makeText(this, mCount1 + " Beef Carbonara Berhasil ditambahkan", Toast.LENGTH_LONG);
            toast.show();

        } else if (view.getId() == R.id.btn_tambah2) {
            mCount2++;
            if (mshowCount2 != null) {
                mshowCount2.setText(Integer.toString(mCount2));
            }
        } else if (view.getId() == R.id.btn_kurang2) {
            mCount2--;
            if (mshowCount2 != null) {
                mshowCount2.setText(Integer.toString(mCount2));
            }
        } else if (view.getId() == R.id.btn_add2) {
            //Create a toast show it.
            Toast toast = Toast.makeText(this, mCount2 + "Cherry Pastry Pie Berhasil ditambahkan", Toast.LENGTH_LONG);
            toast.show();
        } else if (view.getId() == R.id.btn_tambah3) {
            mCount3++;
            if (mshowCount3 != null) {
                mshowCount3.setText(Integer.toString(mCount3));
            }
        } else if (view.getId() == R.id.btn_kurang3) {
            mCount3--;
            if (mshowCount3 != null) {
                mshowCount3.setText(Integer.toString(mCount3));
            }
        } else if (view.getId() == R.id.btn_add3) {
            //Create a toast show it.
            Toast toast = Toast.makeText(this, mCount3 + "Oreo Milshake Berhasil ditambahkan", Toast.LENGTH_LONG);
            toast.show();
        } else if (view.getId() == R.id.btn_tambah4) {
            mCount4++;
            if (mshowCount4 != null) {
                mshowCount4.setText(Integer.toString(mCount4));
            }
        } else if (view.getId() == R.id.btn_kurang4) {
            mCount4--;
            if (mshowCount4 != null) {
                mshowCount4.setText(Integer.toString(mCount4));
            }
        } else if (view.getId() == R.id.btn_add4) {
            //Create
            Toast toast = Toast.makeText(this, mCount4 + "Topia's Sandwich Berhasil ditambahkan", Toast.LENGTH_LONG);
            toast.show();
        } else if (view.getId() == R.id.btn_tambah5) {
            mCount5++;
            if (mshowCount5 != null) {
                mshowCount5.setText(Integer.toString(mCount5));
            }
        } else if (view.getId() == R.id.btn_kurang5) {
            mCount5--;
            if (mshowCount5 != null) {
                mshowCount5.setText(Integer.toString(mCount5));
            }
        } else if (view.getId() == R.id.btn_add5) {
            //Create
            Toast toast = Toast.makeText(this, mCount5 + "Strawberry Smoothies Berhasil ditambahkan", Toast.LENGTH_LONG);
            toast.show();
        } else if (view.getId() == R.id.btn_pesan) {
            EditText etNama = findViewById(R.id.et_nama);
            EditText etNomor = findViewById(R.id.et_nomor);

            // Ambil data inputan pengguna
            String nama = etNama.getText().toString();
            String nomor = etNomor.getText().toString();

            Intent intent = new Intent(TopiaMenu.this, Berhasil.class);
            intent.putExtra("nama", nama);
            intent.putExtra("nomor", nomor);
            startActivity(intent);
        }
    }
}