package com.kp.dodolanapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BarangModel {

    @SerializedName("result")
    private List<Barang> barangs;
    @SerializedName("status")
    private String status;

    public BarangModel(List<Barang> barangs, String status) {
        this.barangs = barangs;
        this.status = status;
    }

    public List<Barang> getBarangs() {
        return barangs;
    }

    public void setBarangs(List<Barang> barangs) {
        this.barangs = barangs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
