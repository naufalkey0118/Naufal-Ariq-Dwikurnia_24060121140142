/**
 * File      : Car.java		03/05/23
 * Penulis   : Naufal Ariq Dwikurnia / 24060121140142
 * Deskripsi : Car.java adalah adalah kelas yang berisi atribut dan metode dari sub kelas Car
 *
 */

package PolimorfismeInclusion;

public class Car extends Vehicle{
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("harga sewa mobil = " + fare);
    }
}
