package day01;

import java.util.Scanner;

public class Practice04 {
    /*
    Kullanicidan bir sayi isteyin ve bu sayinin karesini hesaplayan Java kodunu yazin
     */

    public static void main(String[] args) {
        //Kullanicidan int degerinde bir veri alma
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("Sayi1'in karesi " + sayi*sayi);

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = new Scanner(System.in).nextInt();
        System.out.println("Sayi2'nin karesi " + sayi2*sayi2);

    }
}
