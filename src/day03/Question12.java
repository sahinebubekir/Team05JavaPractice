package day03;

import java.util.Scanner;

public class Question12 {
      /*
    Kullanicidan bir String ve bir karakter alin
    Verilen karakterin son gorundugu yerin indexini bulun
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birsey giriniz");
        String str = scan.next();
        String karakter = scan.next();

        System.out.println(str.lastIndexOf(karakter));
    }
}
