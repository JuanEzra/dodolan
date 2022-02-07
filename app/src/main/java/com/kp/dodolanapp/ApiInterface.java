package com.kp.dodolanapp;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {
    @POST("users/signin")
    @FormUrlEncoded
    Call<LoginModel> signin(
            @Field("username") String username,
            @Field("password") String password);
    @POST("users/signup")
    @FormUrlEncoded
    Call<LoginModel> signup(
            @Field("nama") String nama,
            @Field("username") String userame,
            @Field("password") String password);
    @GET("users/showbarang")
    Call<BarangModel> tampilBarang();
}
