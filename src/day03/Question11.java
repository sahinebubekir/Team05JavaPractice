package day03;

import java.util.Scanner;

public class Question11 {
    /*
    Kullanicidan bir String ve bir karakter alin
    Verilen karakterin ilk gorundugu yerin indexini bulun

    input: AHMET, A
    OUTPUT:0. index
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birsey giriniz");
        String str = scan.next();
        String karakter = scan.next();

        System.out.println(str.indexOf(karakter));
    }
}
