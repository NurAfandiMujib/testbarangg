package com.example.testbarang1;

import java.io.Serializable;

public class Barang implements Serializable{
    private String kode, nama;

    public Barang(){}

    public String getKode(){
        return kode;
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    @Override
    public String toString(){
        return " "+kode+"\n" + " "+nama;
    }

    public Barang(String kd, String nm){
        kode = kd;
        nama = nm;
    }
}
