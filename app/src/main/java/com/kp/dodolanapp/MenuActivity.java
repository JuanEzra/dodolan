package com.kp.dodolanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MenuActivity extends AppCompatActivity {
    ImageView test;

    TextView kategori;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mRecyclerView = (RecyclerView) findViewById(R.id.rvBarang);
        mLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setLayoutManager(mLayoutManager);
        test = findViewById(R.id.testBanner);
        kategori = findViewById(R.id.category);


        kategori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });


        showData();

    }

    public void showData(){
        ApiInterface mApiInterface = ApiHelper.getClient().create(ApiInterface.class);
        Call<BarangModel> call = mApiInterface.tampilBarang();
        call.enqueue(new Callback<BarangModel>() {
            @Override
            public void onResponse(Call<BarangModel> call, Response<BarangModel> response) {
                List<Barang> barangList = response.body().getBarangs();
                mAdapter = new BarangAdapter(barangList,MenuActivity.this);
                mRecyclerView.setAdapter(mAdapter);


            }

            @Override
            public void onFailure(Call<BarangModel> call, Throwable t) {

            }
        });
    }
}