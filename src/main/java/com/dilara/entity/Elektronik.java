package com.dilara.entity;

import com.dilara.utility.IStok;

public class Elektronik extends Magaza implements IStok {
    private int teknikServisSayisi;
    private boolean urunMontajiVarMi;

    public Elektronik() {
    }

    public Elektronik(int id, String ad, String tur, int katNo, int teknikServisSayisi, boolean urunMontajiVarMi) {
        super(id, ad, tur, katNo);
        this.teknikServisSayisi = teknikServisSayisi;
        this.urunMontajiVarMi = urunMontajiVarMi;
    }

    public int getTeknikServisSayisi() {
        return teknikServisSayisi;
    }

    public void setTeknikServisSayisi(int teknikServisSayisi) {
        this.teknikServisSayisi = teknikServisSayisi;
    }

    public boolean isUrunMontajiVarMi() {
        return urunMontajiVarMi;
    }

    public void setUrunMontajiVarMi(boolean urunMontajiVarMi) {
        this.urunMontajiVarMi = urunMontajiVarMi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Elektronik{");
        sb.append("teknikServisSayisi=").append(teknikServisSayisi);
        sb.append(", urunMontajiVarMi=").append(urunMontajiVarMi);
        sb.append(", id=").append(getId());
        sb.append(", ad='").append(getAd()).append('\'');
        sb.append(", tur='").append(getTur()).append('\'');
        sb.append(", katNo=").append(getKatNo());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void stokTakip() {
        System.out.println("Stok takibi yapıldı.");
    }
}
