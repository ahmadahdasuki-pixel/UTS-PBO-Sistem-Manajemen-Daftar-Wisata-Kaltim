/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managesystem;

import java.time.LocalTime;

/**
 *
 * @author Ahmad Ahdasuki
 */
public class WisataBuatan extends TempatWisata {

    private String jenisWahana;
    private LocalTime jamBuka;
    private LocalTime jamTutup;
    private String batasUsia;

    // Constructor
    public WisataBuatan(
            int idWisata,
            String namaWisata,
            String lokasi,
            int hargaTiket,
            String jenisWahana,
            LocalTime jamBuka,
            LocalTime jamTutup,
            String batasUsia) {

        super(
            idWisata,
            namaWisata,
            lokasi,
            hargaTiket
        );

        this.jenisWahana = jenisWahana;
        this.jamBuka = jamBuka;
        this.jamTutup = jamTutup;
        this.batasUsia = batasUsia;
    }

    // Getter

    public String getJenisWahana() {
        return jenisWahana;
    }

    public LocalTime getJamBuka() {
        return jamBuka;
    }

    public LocalTime getJamTutup() {
        return jamTutup;
    }

    public String getBatasUsia() {
        return batasUsia;
    }

    // Setter

    public void setJenisWahana(String jenisWahana) {
        this.jenisWahana = jenisWahana;
    }

    public void setJamBuka(LocalTime jamBuka) {
        this.jamBuka = jamBuka;
    }

    public void setJamTutup(LocalTime jamTutup) {
        this.jamTutup = jamTutup;
    }

    public void setBatasUsia(String batasUsia) {
        this.batasUsia = batasUsia;
    }

    // Menampilkan data
    @Override
    public void tampilkanDataUmum() {
        super.tampilkanDataUmum();
        System.out.println("Jenis Wahana     : " + jenisWahana);
        System.out.println("Jam Operasional  : " + jamBuka + " - " + jamTutup);
        System.out.println("Batas Usia       : " + batasUsia);
    }

}