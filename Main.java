package com.bioskop;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Masukan judul film yang ingin kamu tonton: ");
        String judul = br.readLine();
        System.out.println("Masukkan kategori film: ");
        String kategori = (br.readLine());
        System.out.println("Masukkan deskripsi film: ");
        String deskripsi = br.readLine();

        System.out.println("Masukkan tanggal: ");
        String tanggal = br.readLine();
        System.out.println("Masukkan hari: ");
        String hari = br.readLine();
        System.out.println("Masukkan jam: ");
        String jam = br.readLine();

        System.out.println("Masukkan nama ruang studio film : ");
        String namaStudio = br.readLine();
        System.out.println("Masukkan kapasitas studio film : ");
        int kapasitas = Integer.parseInt(br.readLine());

        Jadwal jadwal1 = new Jadwal(tanggal, hari, jam, new RuangStudio(namaStudio, false, kapasitas));
        Movie movie1 = new Movie(judul, kategori, deskripsi, jadwal1);

        System.out.println("Masukkan nama pembeli : ");
        String nama = br.readLine();
        System.out.println("Masukkan umur : ");
        int umur = Integer.parseInt(br.readLine());
        System.out.println("Masukkan email pembeli : ");
        String email = br.readLine();

        TiketBioskop tiket001 = new TiketBioskop(nama, umur, email);

        //beli tiket dengan method add arraylist
        tiket001.beliTiket(movie1);

        //detail tiket dengan looping data yang ada di arraylist
        tiket001.detailTiket();
        tiket001.detailPembeli();

        //contoh menghapus tiket yang baru ditambahkan (index 0)
        System.out.println("Menghapus tiket arraylist 0");
        tiket001.hapusTiket(0);

    }
}
