package com.bioskop;

public class Jadwal {

    public String tanggal;
    public String hari;
    public String jam;
    public RuangStudio ruangStudio;

    public Jadwal(String tanggal, String hari, String jam, RuangStudio ruangStudio) {
        this.tanggal = tanggal;
        this.hari = hari;
        this.jam = jam;
        this.ruangStudio = ruangStudio;

    }
    public void infoJadwal() {
        System.out.println("Tanggal : " + this.getTanggal());
        System.out.println("Hari : " + this.getHari());
        System.out.println("Jam : " + this.getJam());
        this.ruangStudio.infoRuangStudio();
    }

    public String getTanggal() { return tanggal; }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getHari() { return hari;}
    public String getJam() { return jam;}


}
