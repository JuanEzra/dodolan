package com.kp.dodolanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CategoryActivity extends AppCompatActivity {

    TextView close, manajemenToko, favorit;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kategori);

        close = findViewById(R.id.btnClose);
        manajemenToko = findViewById(R.id.btnManajemen);
        favorit = findViewById(R.id.btnFavorit);

        logout= findViewById(R.id.btnLogout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        manajemenToko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

    }
}