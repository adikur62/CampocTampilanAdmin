package com.example.ux32vd.simplifiedcampocadmin.helper;

public class Model {

    String id;
    String deskripsi;
    String foto;
    String lokasi;
    String detail;

    public Model(){

    }

    public Model(String id, String deskripsi, String foto, String lokasi, String detail) {
        this.id = id;
        this.deskripsi = deskripsi;
        this.foto = foto;
        this.lokasi = lokasi;
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getFoto() {
        return foto;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getDetail() { return detail; }
}
