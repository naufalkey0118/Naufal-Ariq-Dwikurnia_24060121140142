/** 
* File      : BangunDatar.java
* Penulis   : Naufal Ariq Dwikurnia
* Deskripsi : Kelas abstrak, berisi abtraksi bangun datar
*
*/

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi); //interface hanya seperti ini

    public void setLuas(double l){ //tidak dapat di interface karena implementasi
        luas = 1;
    }

    public double getLuas(){ //tidak dapat diinterface karena implementasi
        return luas;
    }
}
