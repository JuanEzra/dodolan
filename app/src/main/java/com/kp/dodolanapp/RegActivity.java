package com.kp.dodolanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegActivity extends AppCompatActivity {
    TextView loginBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        loginBack = findViewById(R.id.btnLoginback);

        loginBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }




}