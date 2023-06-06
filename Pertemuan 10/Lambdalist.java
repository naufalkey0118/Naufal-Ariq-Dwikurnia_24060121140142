/**
 * File      : Lambdalist.java		31/05/23
 * Penulis   : Naufal Ariq Dwikurnia / 24060121140142
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai parameter pada method.
 *
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Varrel");
        mahasiswaList.add("Inong");
        mahasiswaList.add("Erlan");
        mahasiswaList.add("Durapi");

        //lambda digunakan sebagai parameter pada method
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
