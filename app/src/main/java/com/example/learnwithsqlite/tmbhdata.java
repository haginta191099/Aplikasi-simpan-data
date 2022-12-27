package com.example.learnwithsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class tmbhdata extends AppCompatActivity {
    Context context;
    biodataTBL biodataTBL;
    EditText nama,alamat;
    Button simpan;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tmbhdata);
        nama=findViewById(R.id.name);
        alamat=findViewById(R.id.alamat);
        simpan=findViewById(R.id.simpan_data);

        biodataTBL=new biodataTBL(getApplicationContext());
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                biodataTBL.simpan_data(
                        nama.getText().toString(),
                        alamat.getText().toString());


            }
        });

    }



}