package day01;

import java.util.Scanner;

public class Practice07 {

    /*
   Kullanıcıdan iki tamsayı girdisi alıp toplamını yazdıran ve çarpan bir program yazın.
     */


    public static void main(String[] args) {
        System.out.println("Ilk tamsayi lutfen");
        int ilkTamSayi = new Scanner(System.in).nextInt();
        System.out.println("Ikinci tamsayi lutfen");
        int ikinciTamSayi = new Scanner(System.in).nextInt();

        int toplam = ilkTamSayi + ikinciTamSayi;
        int carpim = ilkTamSayi * ikinciTamSayi;

        System.out.println("Toplam: " + toplam + "\nCarpim: " + carpim);

    }
}
