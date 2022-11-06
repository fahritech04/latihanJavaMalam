import java.util.*;

public class FunctionRecursive {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  System.out.print("Masukkan nilainya = ");
  int nilai = in.nextInt();

  printNilai(nilai);
 }

 private static void printNilai(int parameter) {
  System.out.println("nilainya adalah = " + parameter);

  if (parameter == 50) { // kalo mundur diganti menjadi 0 atau bagian terkecil
   return;
  }

  parameter++; // diganti menjadi parameter--

  printNilai(parameter);
 }

}
