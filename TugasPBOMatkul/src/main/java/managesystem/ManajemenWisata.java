/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managesystem;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ahmad Ahdasuki
 */
public class ManajemenWisata {

    private ArrayList<WisataAlam> daftarWisataAlam;
    private ArrayList<WisataBuatan> daftarWisataBuatan;
    private Scanner scanner;

    public ManajemenWisata(Scanner scanner) {

        this.scanner = scanner;

        daftarWisataAlam = new ArrayList<>();
        daftarWisataBuatan = new ArrayList<>();

        // DATA DUMMY WISATA ALAM
        daftarWisataAlam.add(
            new WisataAlam(
                1,
                "Pulau Beras Basah",
                "Bontang",
                25000,
                "Pantai",
                "Mudah",
                "Toilet dan Gazebo"
            )
        );

        // DATA DUMMY WISATA BUATAN
        daftarWisataBuatan.add(
            new WisataBuatan(
                4,
                "Caribbean Waterpark",
                "Balikpapan",
                50000,
                "Waterpark",
                LocalTime.parse("08:00"),
                LocalTime.parse("18:00"),
                "5 Tahun"
            )
        );

    }

    // =========================
    // CREATE
    // =========================

    public void tambahWisata() {

        System.out.println("\n=== TAMBAH DATA WISATA ===");

        System.out.print("ID Wisata       : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        // CONDITION + LOOPING
        for (WisataAlam wisata : daftarWisataAlam) {
            if (wisata.getIdWisata() == id) {
                System.out.println("ID Wisata sudah digunakan!");
                return;
            }
        }

        for (WisataBuatan wisata : daftarWisataBuatan) {
            if (wisata.getIdWisata() == id) {
                System.out.println("ID Wisata sudah digunakan!");
                return;
            }
        }

        System.out.print("Nama Wisata     : ");
        String nama = scanner.nextLine();

        System.out.print("Lokasi          : ");
        String lokasi = scanner.nextLine();

        System.out.print("Harga Tiket     : ");
        int harga = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nJenis Wisata:");
        System.out.println("1. Wisata Alam");
        System.out.println("2. Wisata Buatan");
        System.out.print("Pilih jenis     : ");

        int jenis = scanner.nextInt();
        scanner.nextLine();

        // CONDITION
        if (jenis == 1) {

            System.out.print("Jenis Alam          : ");
            String jenisAlam = scanner.nextLine();

            System.out.print("Tingkat Kesulitan   : ");
            String tingkatKesulitan = scanner.nextLine();

            System.out.print("Fasilitas            : ");
            String fasilitasAlam = scanner.nextLine();

            daftarWisataAlam.add(
                new WisataAlam(
                    id,
                    nama,
                    lokasi,
                    harga,
                    jenisAlam,
                    tingkatKesulitan,
                    fasilitasAlam
                )
            );

            System.out.println("Data wisata alam berhasil ditambahkan!");

        } else if (jenis == 2) {

            System.out.print("Jenis Wahana        : ");
            String jenisWahana = scanner.nextLine();

            System.out.print("Jam Buka (HH:mm)    : ");
            LocalTime jamBuka = LocalTime.parse(scanner.nextLine());

            System.out.print("Jam Tutup (HH:mm)   : ");
            LocalTime jamTutup = LocalTime.parse(scanner.nextLine());

            System.out.print("Batas Usia          : ");
            String batasUsia = scanner.nextLine();

            daftarWisataBuatan.add(
                new WisataBuatan(
                    id,
                    nama,
                    lokasi,
                    harga,
                    jenisWahana,
                    jamBuka,
                    jamTutup,
                    batasUsia
                )
            );

            System.out.println("Data wisata buatan berhasil ditambahkan!");

        } else {

            System.out.println("Jenis wisata tidak tersedia.");
        }
    }

    // =========================
    // READ
    // =========================

    public void tampilkanWisata() {

        System.out.println("\n=== DATA TEMPAT WISATA ===");

        System.out.println("\n--- WISATA ALAM ---");

        if (daftarWisataAlam.isEmpty()) {

            System.out.println("Belum ada data wisata alam.");

        } else {

            // LOOPING
            for (WisataAlam wisata : daftarWisataAlam) {

                System.out.println("----------------------------");

                // POLYMORPHISM
                wisata.tampilkanDataUmum();
            }
        }

        System.out.println("\n--- WISATA BUATAN ---");

        if (daftarWisataBuatan.isEmpty()) {

            System.out.println("Belum ada data wisata buatan.");

        } else {

            // LOOPING
            for (WisataBuatan wisata : daftarWisataBuatan) {

                System.out.println("----------------------------");

                // POLYMORPHISM
                wisata.tampilkanDataUmum();
            }
        }

        System.out.println("----------------------------");
    }

    // =========================
    // UPDATE
    // =========================

    public void updateWisata() {

        System.out.println("\n=== UPDATE DATA WISATA ===");

        System.out.print("Masukkan ID Wisata : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        // UPDATE WISATA ALAM
        for (WisataAlam wisata : daftarWisataAlam) {

            if (wisata.getIdWisata() == id) {

                System.out.print("Nama Wisata baru        : ");
                String nama = scanner.nextLine();

                System.out.print("Lokasi baru             : ");
                String lokasi = scanner.nextLine();

                System.out.print("Harga Tiket baru        : ");
                int harga = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Jenis Alam baru         : ");
                String jenisAlam = scanner.nextLine();

                System.out.print("Tingkat Kesulitan baru : ");
                String tingkatKesulitan = scanner.nextLine();

                System.out.print("Fasilitas baru          : ");
                String fasilitas = scanner.nextLine();

                wisata.setNamaWisata(nama);
                wisata.setLokasi(lokasi);
                wisata.setHargaTiket(harga);
                wisata.setJenisAlam(jenisAlam);
                wisata.setTingkatKesulitan(tingkatKesulitan);
                wisata.setFasilitasAlam(fasilitas);

                System.out.println("Data wisata berhasil diupdate!");

                return;
            }
        }

        // UPDATE WISATA BUATAN
        for (WisataBuatan wisata : daftarWisataBuatan) {

            if (wisata.getIdWisata() == id) {

                System.out.print("Nama Wisata baru       : ");
                String nama = scanner.nextLine();

                System.out.print("Lokasi baru            : ");
                String lokasi = scanner.nextLine();

                System.out.print("Harga Tiket baru       : ");
                int harga = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Jenis Wahana baru      : ");
                String jenisWahana = scanner.nextLine();

                System.out.print("Jam Buka baru (HH:mm)  : ");
                LocalTime jamBuka =
                        LocalTime.parse(scanner.nextLine());

                System.out.print("Jam Tutup baru (HH:mm) : ");
                LocalTime jamTutup =
                        LocalTime.parse(scanner.nextLine());

                System.out.print("Batas Usia baru        : ");
                String batasUsia = scanner.nextLine();

                wisata.setNamaWisata(nama);
                wisata.setLokasi(lokasi);
                wisata.setHargaTiket(harga);
                wisata.setJenisWahana(jenisWahana);
                wisata.setJamBuka(jamBuka);
                wisata.setJamTutup(jamTutup);
                wisata.setBatasUsia(batasUsia);

                System.out.println("Data wisata berhasil diupdate!");

                return;
            }
        }

        System.out.println(
            "Data wisata dengan ID tersebut tidak ditemukan."
        );
    }

    // =========================
    // DELETE
    // =========================

    public void hapusWisata() {

        System.out.println("\n=== HAPUS DATA WISATA ===");

        System.out.print("Masukkan ID Wisata : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        // LOOPING
        for (int i = 0; i < daftarWisataAlam.size(); i++) {

            if (daftarWisataAlam.get(i).getIdWisata() == id) {

                daftarWisataAlam.remove(i);

                System.out.println(
                    "Data wisata berhasil dihapus!"
                );

                return;
            }
        }

        for (int i = 0; i < daftarWisataBuatan.size(); i++) {

            if (daftarWisataBuatan.get(i).getIdWisata() == id) {

                daftarWisataBuatan.remove(i);

                System.out.println(
                    "Data wisata berhasil dihapus!"
                );

                return;
            }
        }

        System.out.println(
            "Data wisata dengan ID tersebut tidak ditemukan."
        );
    }
}