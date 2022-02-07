package com.kp.dodolanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText username, password, email, nama;
    TextView registrasi;
    HomeActivity home = new HomeActivity();
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.edtUsername);
        password = findViewById(R.id.edtPassword);
        registrasi = findViewById(R.id.txtRegistrasi);
        email = findViewById(R.id.edtEmail);
        nama = findViewById(R.id.edtName);
        login = findViewById(R.id.btnLogin);

        registrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegActivity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Username Harus Diisi",Toast.LENGTH_SHORT).show();
                }else{
                    if(password.getText().toString().equals("")){
                        Toast.makeText(MainActivity.this,"Password Harus Diisi",Toast.LENGTH_SHORT).show();
                    }else {
                        login();
                    }
                }


            }
        });


    }

    private void login(){
        ApiInterface mApiInterface = ApiHelper.getClient().create(ApiInterface.class);
        Call<LoginModel> call = mApiInterface.signin(username.getText().toString(),password.getText().toString());
        call.enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                if(response.isSuccessful()){
//                    Log.d("response",""+response.body().getResult().get(0).getId().toString()+
//                            " "+response.body().getResult().get(0).getNama().toString());
                   Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                   startActivity(intent);
                }else{
                    Log.d("response",""+response.message());
                    Toast.makeText(MainActivity.this, "Gagal login : "+response.message(),Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error"+t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}