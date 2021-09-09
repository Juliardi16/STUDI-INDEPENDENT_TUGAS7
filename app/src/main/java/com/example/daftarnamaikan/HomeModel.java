package com.example.daftarnamaikan;

public class HomeModel {
    private String nama;
    private String warna;

    public HomeModel(String nama, String warna){
        this.nama = nama;
        this.warna = warna;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
