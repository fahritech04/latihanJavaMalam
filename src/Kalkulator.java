import java.util.*;

public class Kalkulator {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  int a = in.nextInt();
  int b = in.nextInt();

  in.close();

  System.out.println(tambah(a, b));
  System.out.println(kurang(a, b));
  System.out.println(bagi(a, b));
  System.out.println(kali(a, b));
 }

 private static int tambah(int a, int b) {
  int hasil = a + b;
  return hasil;
 }

 private static int kurang(int a, int b) {
  int hasil = a - b;
  return hasil;
 }

 private static int bagi(int a, int b) {
  int hasil = a / b;
  return hasil;
 }

 private static int kali(int a, int b) {
  int hasil = a * b;
  return hasil;
 }
}
