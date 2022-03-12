package com.bioskop;

public class RuangStudio {
    public String namaStudio;
    public boolean penuh;
    public int kapasitas;

    public RuangStudio(String namaStudio, boolean penuh, int kapasitas) {
        this.namaStudio = namaStudio;
        this.penuh = penuh;
        this.kapasitas = kapasitas;

    }
    public void infoRuangStudio() {
        String statusKapasitas = this.penuh ? "Penuh" : "Kosong";
        System.out.println("Nama Studio : " + this.getNamaStudio());
        System.out.println("Apakah studio masih tersedia: " + statusKapasitas);

    }
    public String getNamaStudio() { return  namaStudio; }

    public  void setNamaStudio(String namaStudio) { this.namaStudio = namaStudio; }

    public  boolean isPenuh() { return  penuh; }

    public void setPenuh(boolean penuh) { this.penuh = penuh; }

    public int getKapasitas() { return kapasitas; }

    public void setKapasitas(int kapasitas) { this.kapasitas = kapasitas; }



}
