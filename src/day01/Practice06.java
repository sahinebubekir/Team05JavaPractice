package day01;

import java.util.Scanner;

public class Practice06 {

    /*
   Kullanıcıdan, bir dikdörtgenin uzunluğu ve
   genişliği için iki çift girdi vermesini ve
   int'ye dönüştürülen yazdırma alanı türünü vermesini isteyin.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdortgenin uzunlugunu giriniz");
        System.out.println("Dikdortgenin genisligini giriniz");
        double uzunluk = scan.nextDouble();
        double genislik = scan.nextDouble();

        System.out.println((int) (uzunluk * genislik));
        int alan = (int) (genislik * uzunluk);
        System.out.println("Alan 2.yontem: " + alan);
    }
}
