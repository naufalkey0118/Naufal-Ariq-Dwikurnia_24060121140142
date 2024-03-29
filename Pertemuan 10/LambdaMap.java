/**
 * File      : LambdaMap.java		31/05/23
 * Penulis   : Naufal Ariq Dwikurnia / 24060121140142
 * Deskripsi : Ekspresi lambda pada hashmap, digunakan untuk parameter pada method.
 *
 */

 import java.util.HashMap;
 import java.util.Map;
 
 public class LambdaMap {
     public static void main(String[] args) {
         Map<String, String> mahasiswaMap = new HashMap<>();
         mahasiswaMap.put("24060121130090", "Mamang");
         mahasiswaMap.put("24060121140012", "Ojak");
         mahasiswaMap.put("24060121141213", "Kipli");
 
         mahasiswaMap.forEach((nim, nama) -> System.out.println( nim + ": " + nama));
     }
 }
