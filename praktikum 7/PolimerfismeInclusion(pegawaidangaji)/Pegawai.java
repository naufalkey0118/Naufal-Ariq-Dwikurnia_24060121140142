/**
 * File      : Pegawai.java		03/05/23
 * Penulis   : Naufal Ariq Dwkurnia / 24060121140142
 * Deskripsi : Pegawai.java adalah superkelas yang akan diturunkan ke kelas Manajer dan Pegawai
 *
 */

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        //cara 1
        //System.out.println("Nama : " + this.nama + ", Gaji Pokok : " + this.gajiPokok);
        //cara 2
        System.out.printf("Nama : %s, Gaji pokok : %d \n", nama, gajiPokok);
    }
}
