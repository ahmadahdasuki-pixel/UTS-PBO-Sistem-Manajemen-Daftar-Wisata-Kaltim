/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managesystem;

/**
 *
 * @author Ahmad Ahdasuki
 */
public class WisataAlam extends TempatWisata {

    private String jenisAlam;
    private String tingkatKesulitan;
    private String fasilitasAlam;

    // Constructor
    public WisataAlam(
            int idWisata,
            String namaWisata,
            String lokasi,
            int hargaTiket,
            String jenisAlam,
            String tingkatKesulitan,
            String fasilitasAlam) {

        super(
            idWisata,
            namaWisata,
            lokasi,
            hargaTiket
        );

        this.jenisAlam = jenisAlam;
        this.tingkatKesulitan = tingkatKesulitan;
        this.fasilitasAlam = fasilitasAlam;
    }

    // Getter

    public String getJenisAlam() {
        return jenisAlam;
    }

    public String getTingkatKesulitan() {
        return tingkatKesulitan;
    }

    public String getFasilitasAlam() {
        return fasilitasAlam;
    }

    // Setter

    public void setJenisAlam(String jenisAlam) {
        this.jenisAlam = jenisAlam;
    }

    public void setTingkatKesulitan(String tingkatKesulitan) {
        this.tingkatKesulitan = tingkatKesulitan;
    }

    public void setFasilitasAlam(String fasilitasAlam) {
        this.fasilitasAlam = fasilitasAlam;
    }

    // Menampilkan data
    @Override
    public void tampilkanDataUmum() {
        super.tampilkanDataUmum();
        System.out.println("Jenis Alam        : " + jenisAlam);
        System.out.println("Tingkat Kesulitan : " + tingkatKesulitan);
        System.out.println("Fasilitas         : " + fasilitasAlam);
    }

}
