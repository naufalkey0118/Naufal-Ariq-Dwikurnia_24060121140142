/*Nama File: BujurSangkar.java 15/02/22
 * Penulis: Naufal Ariq Dwikurnia - 24060121140142
 * Deskripsi: Representasi dasar dari Bujur Sangkar 
 */

 package org.bangundatar;

 import org.poligon.Poligon;

 public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi) {
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = 4;
    }

    public double hitungLuas(){
        return this.panjangSisi * this.panjangSisi;

    }

    public double getPanjangSisi(){
        return this.panjangSisi;
    }
 }
