/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventaris.model;

/**
 *
 * @author 07rrk
 */
public class Barang {
    private String kode;
    private String nama;
    private int jumlah;
    
    // Menambahkan Constructor
    public Barang(String kode, String nama, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.jumlah = jumlah;
    }

    // Menambahkan Getters dan Setters
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}
