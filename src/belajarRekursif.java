import java.util.*;

public class belajarRekursif {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  System.out.print("Masukkan angka = ");
  int nilai = in.nextInt();

  cetakAngka(nilai);
 }

 private static void cetakAngka(int angka) {
  if (angka > 0) {
   System.out.println(angka);
   cetakAngka(++angka);
  }
 }

}
