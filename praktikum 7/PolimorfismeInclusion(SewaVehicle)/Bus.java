/**
 * File      : Bus.java		03/05/23
 * Penulis   :  Naufal Ariq Dwikurnia / 24060121140142
 * Deskripsi : Bus.java adalah adalah kelas yang berisi atribut dan metode dari sub kelas bus
 *
 */

package PolimorfismeInclusion;

public class Bus extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 50.00f;
        System.out.println("harga sewa mobil = " + fare);
    }
}
