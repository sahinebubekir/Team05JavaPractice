package day03;

import java.util.Scanner;

public class Question05 {
    		/*
			 Kullanicidan 3 harften birisini girmesini soyle ve girilen harfe gore cumleyi consolda yazdir.

	ORNEK:

	     INPUT      : A
	     OUTPUT  : Sakla samani gelir zamani.
	     INPUT      : B
	     OUTPUT  : Oluler, dirilerin hergun helva yedigini sanirmis.
	     INPUT      : C
	     OUTPUT : If the cap fits, wear it.
			 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A & B & C'den birini giriniz");
        char secim = scan.next().toUpperCase().charAt(0);


        switch (secim){
            case 'A':
                System.out.println("Sakla samani gelir zamani.");
                break;
            case 'B':
                System.out.println("Oluler, dirilerin hergun helva yedigini sanirmis.");
                break;
            case 'C':
                System.out.println(" If the cap fits, wear it.");
                break;
        }
    }
}
