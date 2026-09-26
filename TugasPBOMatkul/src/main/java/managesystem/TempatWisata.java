/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managesystem;

/**
 *
 * @author Ahmad Ahdasuki
 */
public class TempatWisata {

    private int idWisata;
    private String namaWisata;
    private String lokasi;
    private int hargaTiket;

    // Constructor
    public TempatWisata(
            int idWisata,
            String namaWisata,
            String lokasi,
            int hargaTiket) {

        this.idWisata = idWisata;
        this.namaWisata = namaWisata;
        this.lokasi = lokasi;
        this.hargaTiket = hargaTiket;
    }

    // Getter

    public int getIdWisata() {
        return idWisata;
    }

    public String getNamaWisata() {
        return namaWisata;
    }

    public String getLokasi() {
        return lokasi;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    // Setter

    public void setNamaWisata(String namaWisata) {
        this.namaWisata = namaWisata;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    // Menampilkan data umum

    public void tampilkanDataUmum() {
        System.out.println("ID Wisata   : " + idWisata);
        System.out.println("Nama Wisata : " + namaWisata);
        System.out.println("Lokasi      : " + lokasi);
        System.out.println("Harga Tiket : Rp" + hargaTiket);
    }
}
