/**
 * File      : Segitiga.java		03/05/23
 * Penulis   : Naufal Ariq Dwikurnia / 24060121140142
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 *
 */

 public class Segitiga extends BangunDatar{
    private double sisi;

    public Segitiga(double sisi) {
        this.sisi = sisi;
    }
    public double hitungKeliling() {
        return sisi + sisi + sisi;
    }
}
