package com.kp.dodolanapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.StrictMode;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BarangAdapter extends RecyclerView.Adapter<BarangAdapter.MyViewHolder> {
    List<Barang> barangList;
    public static String idkuu = "";
    Context context;

    public BarangAdapter(List<Barang> barangList, Context context) {
        this.barangList = barangList;
        this.context = context;
    }

    @Override
    public BarangAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_barang, parent, false);
        BarangAdapter.MyViewHolder mViewHolder = new BarangAdapter.MyViewHolder(mView);
        return mViewHolder;
    }


    @Override
    public void onBindViewHolder(BarangAdapter.MyViewHolder holder, final int position) {
        holder.txtNama.setText(barangList.get(position).getNama());
        holder.txtHarga.setText("Rp " + barangList.get(position).getHarga());
        Glide.with(context.getApplicationContext())
                .asBitmap()
                .override(300, 400) // resizes the image to these dimensions (in pixel)
                .centerCrop()
                .load(barangList.get(position).getFoto())
                .into(new CustomTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        holder.imgBarang.setImageBitmap(resource);
                    }

                    @Override
                    public void onLoadCleared(@Nullable Drawable placeholder) {

                    }
                });


    }


    @Override
    public int getItemCount() {
        Log.d("barang  ", "" + barangList.size());
        return barangList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtNama, txtHarga;
        ImageView imgBarang;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txtNamabarang);
            txtHarga = (TextView) itemView.findViewById(R.id.txtHarga);
            imgBarang = (ImageView) itemView.findViewById(R.id.imgBarang);
        }
    }
}