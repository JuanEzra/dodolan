package com.kp.dodolanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
    TextView kategori;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        kategori = findViewById(R.id.category2);

        kategori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });
    }
}