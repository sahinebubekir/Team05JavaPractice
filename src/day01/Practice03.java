package day01;

import java.util.Scanner;

public class Practice03 {
    			/*
			 Kullanicidan bir karakter girmesini isteyip, o karakterin ascii degerini yazdirin

	ORNEK:
	             INPUT : #
	 			 OUTPUT : girdiginiz # karakterinin ascii degeri = 125'dir.
			 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char karakter1 = scan.next().charAt(0);
        System.out.println(karakter1 + 0);
    }
}
