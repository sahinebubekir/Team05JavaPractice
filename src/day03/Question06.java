package day03;

import java.util.Locale;
import java.util.Scanner;

public class Question06 {
    /* ask user to enter firstName and lastName then make first initials uppercase and rest should be
     * all lovercase
     *
     * ferhat => Ferhat
     * kirac => Kirac
     *
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ISminizi giriniz");
        String isim = scan.next();
        System.out.println("SOyisminizi giriniz");
        String soyisim = scan.next();

        //1.Yontem
        isim = isim.replace(isim.substring(0, 1), isim.substring(0, 1).toUpperCase()).
                replace(isim.substring(1), isim.substring(1).toLowerCase());

        soyisim = soyisim.replace(soyisim.substring(0, 1), soyisim.substring(0, 1).toUpperCase());
        System.out.println(isim + " " + soyisim);

        //2.Yontem
        String ilkHarfiBuyukIsimVeSoyisim = isim.toUpperCase().charAt(0) + isim.substring(1) + " " +
                soyisim.toUpperCase().charAt(0) + soyisim.substring(1);
        System.out.println(ilkHarfiBuyukIsimVeSoyisim);
    }
}
