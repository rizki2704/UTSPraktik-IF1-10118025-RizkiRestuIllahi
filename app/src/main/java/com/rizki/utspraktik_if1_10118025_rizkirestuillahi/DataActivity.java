package com.rizki.utspraktik_if1_10118025_rizkirestuillahi;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DataActivity extends AppCompatActivity {
    //  5 Juni 2021 10118025 Rizki Restu Illahi IF-1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        Intent intent = getIntent();

        String nik = intent.getStringExtra(MainActivity.Extra_nik);
        String nama = intent.getStringExtra(MainActivity.Extra_NAMA);
        String jk = intent.getStringExtra(MainActivity.Extra_jk);
        String tgl = intent.getStringExtra(MainActivity.Extra_tgl);
        String hub = intent.getStringExtra(MainActivity.Extra_hub);

        TextView tvNik = findViewById(R.id.isinik);
        TextView tvNama = findViewById(R.id.isinama);
        TextView tvTgl = findViewById(R.id.isittl);
        TextView tvHub = findViewById(R.id.isihubungan);
        TextView tvJk = findViewById(R.id.isijk);



        tvNik.setText(nik);
        tvNama.setText(nama);
        tvTgl.setText(tgl);
        tvJk.setText(jk);
        tvHub.setText(hub);



    }

    public void simpan(View view) {
        Intent intent = new Intent(DataActivity.this, DialogueActivity.class);
        startActivity(intent);
    }

    public void ubah(View view) {
        Intent intent = new Intent(DataActivity.this, MainActivity.class);
        startActivity(intent);
    }
}