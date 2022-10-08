package day03;

import java.util.Scanner;

public class Question02 {
		/*
		 * Switch, IfElse

        Write a Java program to find the monthf of the year.

        ORNEK:

          INPUT:
        Input a month number: 2

          OUTPUT  :
        Subat
		 */

    public static void main(String[] args) {
        System.out.println("Ogrenmek istediginiz ayin sayi numarasini giriniz");
        byte ay = new Scanner(System.in).nextByte();

        switch (ay){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("MARt");
                break;
            case 4:
                System.out.println("nisan");
                break;

            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("HAZIRAN");
                break;
            case 7:
                System.out.println("TEMMUZ");
                break;
            case 8:
                System.out.println("AGUSTOS");
                break;
            case 9:
                System.out.println("EYLUL");
                break;
            case 10:
                System.out.println("EKIM");
                break;
            case 11:
                System.out.println("KASIM");
                break;
            case 12:
                System.out.println("ARALIK");
                break;
            default:
                System.out.println("1-12 arasi birsey giriniz");
        }
    }
}
