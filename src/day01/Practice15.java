package day01;

import java.util.Scanner;

public class Practice15 {        /*
 * Kullanicidan uc basamakli bir sayi alin
 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
 *
 *
 * Ornek : Inputs : 853
 * Output : Girdiginiz sayinin birler basamagi : 3
 *          Girdiginiz sayinin onlar basamagi : 5
 *          Girdiginiz sayinin yuzler basamagi : 8
 *
 *
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi yaziniz");
        String isim = scan.next();

        System.out.println("SOyisminizi yaziniz");

        String soyad = scan.nextLine();
        scan.nextLine();
        System.out.println("Adres yaziniz");
        String adres = scan.nextLine();

        System.out.println(isim + " " + soyad + " " + adres);

    }

}
