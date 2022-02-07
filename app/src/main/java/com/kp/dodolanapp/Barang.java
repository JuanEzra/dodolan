package com.kp.dodolanapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Barang {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("harga")
    @Expose
    private String harga;
    @SerializedName("kondisi")
    @Expose
    private String kondisi;
    @SerializedName("stok")
    @Expose
    private String stok;
    @SerializedName("kategori")
    @Expose
    private String kategori;
    @SerializedName("subkategori")
    @Expose
    private String subkategori;
    @SerializedName("estimasi")
    @Expose
    private String estimasi;
    @SerializedName("deskripsi")
    @Expose
    private String deskripsi;
    @SerializedName("alamat")
    @Expose
    private String alamat;
    @SerializedName("nama_toko")
    @Expose
    private String namaToko;
    @SerializedName("foto")
    @Expose
    private String foto;

    public Barang(String id, String nama, String harga, String kondisi, String stok, String kategori, String subkategori, String estimasi, String deskripsi, String alamat, String namaToko, String foto) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.kondisi = kondisi;
        this.stok = stok;
        this.kategori = kategori;
        this.subkategori = subkategori;
        this.estimasi = estimasi;
        this.deskripsi = deskripsi;
        this.alamat = alamat;
        this.namaToko = namaToko;
        this.foto = foto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getSubkategori() {
        return subkategori;
    }

    public void setSubkategori(String subkategori) {
        this.subkategori = subkategori;
    }

    public String getEstimasi() {
        return estimasi;
    }

    public void setEstimasi(String estimasi) {
        this.estimasi = estimasi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
