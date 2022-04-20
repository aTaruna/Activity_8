package com.example.apkact8.database;

import java.io.Serializable;

public class Teman implements Serializable{
    String id;
    String nama;
    String telepon;

    public Teman() {
    }

    public Teman(String id, String nama, String telepon) {
        this.id = id;
        this.nama = nama;
        this.telepon = telepon;
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

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}