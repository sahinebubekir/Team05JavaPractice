package day01;

import java.util.Scanner;

public class Practice08 {
    /*
    Kullanicidan bir sayi aliniz ve sayinin kupunun yarisini konsola yazdiran programi yaziniz.
     */

    public static void main(String[] args) {
        System.out.println("Bir sayi giriniz");

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        System.out.println((sayi*sayi*sayi)/2);
        System.out.println(new Scanner(System.in).nextInt() * new Scanner(System.in).nextInt() * new Scanner(System.in).nextInt());

    }
}
