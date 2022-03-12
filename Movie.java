package com.bioskop;

public class Movie {

        public String judul;
        public String kategori_film;
        public String deskripsi_film;
        public Jadwal jadwal;

        public Movie(String judul, String kategori_film, String deskripsi_film, Jadwal jadwal) {
            this.judul = judul;
            this.kategori_film = kategori_film;
            this.deskripsi_film = deskripsi_film;
            this.jadwal = jadwal;
        }

        public void infoMovie() {
            System.out.println();
            System.out.println("=====INFO TIKET YANG KAMU BELI=====");
            System.out.println("Judul : " + this.getJudul());
            System.out.println("Kategori Film : " + this.getKategori_film());
            System.out.println("Deskripsi Film : " + this.getDeskripsi_film());
            this.jadwal.infoJadwal();
            System.out.println("===========================================");
        }

        public String getJudul() { return judul;}

        public void setJudul(String judul) { this.judul = judul; }

        public String getKategori_film() {return kategori_film;} { this.kategori_film = kategori_film; }

        public void setKategori_film(String kategori_film) {this.kategori_film = kategori_film; }

        public String getDeskripsi_film() { return deskripsi_film;}

        public void setDeskripsi_film(String deskripsi_film) {this.deskripsi_film = deskripsi_film;}

        public Jadwal getJadwal() { return jadwal; }

        public void setJadwal(Jadwal jadwal) { this.jadwal = jadwal; }


}
