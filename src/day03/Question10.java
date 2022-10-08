package day03;

import java.util.Scanner;

public class Question10 {
    		/*StringMethods:
        Write a Java program to take the last three characters from a given string and add the three characters at
        both the front and back of the string.
         String length must be greater than three and more.

        ORNEK:

         INPUT      : Ankara

         OUTPUT  : araAnkaraara
		 *
		 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birsey giriniz");
        String str = scan.next();

        String sonUcKarakter = str.substring(str.length()-3);
        String strYeniHali = sonUcKarakter + str + sonUcKarakter;

        System.out.println(strYeniHali);

    }
}
