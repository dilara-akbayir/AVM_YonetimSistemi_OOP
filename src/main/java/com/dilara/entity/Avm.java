package com.dilara.entity;

public class Avm {
    private int id;
    private String ad;
    private String adres;
    private int magazaKapasitesi;
    private Magaza[] magazalar;
    public static int magazaSayisi;

    public Avm(int id, String ad, String adres, int magazaKapasitesi) {
        this.id = id;
        this.ad = ad;
        this.adres = adres;
        this.magazaKapasitesi = magazaKapasitesi;
        magazalar = new Magaza[magazaKapasitesi];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getMagazaKapasitesi() {
        return magazaKapasitesi;
    }

    public void setMagazaKapasitesi(int magazaKapasitesi) {
        this.magazaKapasitesi = magazaKapasitesi;
    }

    public Magaza[] getMagazalar() {
        return magazalar;
    }

    public void setMagazalar(Magaza[] magazalar) {
        this.magazalar = magazalar;
    }

}
