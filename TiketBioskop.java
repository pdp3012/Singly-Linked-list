package com.bioskop;

import java.util.ArrayList;

public class TiketBioskop {
    private ArrayList<Movie> listTiket;
    public String nama;
    public int umur;
    public String email;

    public TiketBioskop(String nama, int umur, String email) {
        listTiket = new ArrayList<>();
        this.nama = nama;
        this.umur = umur;
        this.email = email;
    }

    public void beliTiket(Movie data) {
      listTiket.add(data);
    }
    public void hapusTiket(int index) {
        listTiket.remove(index);
        System.out.println("Tiket berhasil dihapus");
    }

    public void detailTiket() {
        for (Movie movie : listTiket) {
            movie.infoMovie();
        }
    }

    public void detailPembeli() {
        System.out.println("Nama :" + this.nama);
        System.out.println("Umur :" + this.umur);
        System.out.println("Email :" + this.email);
    }


}