package day01;

import java.util.Scanner;

public class Practice09 {
    /*
     * Kullaniciya gunde kac cay ictigini ve kac seker kullandigini sorun.
     * Bir yilda kac kg seker kullandigini hesaplayip yazdirin
     *
     * 1 seker = 1.7 gr
     *
     *
     * Ornek : Input : cay sayisi : 10 seker sayisi :2
     *         Output : Yilda 12.41 kg seker kullaniyorsunuz
     *
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gunde kac cay iciyorsunuz?");
        int caySayisi = scan.nextInt();
        System.out.println("Kac seker kullaniyorsunuz?");
        double sekerSayisi = scan.nextDouble();

        double sekerKiloYilda = (sekerSayisi * 1.7 * caySayisi * 365)/1000;
        System.out.println("Yilda " + sekerKiloYilda + " kg seker kullaniyorsunuz");

    }
}
