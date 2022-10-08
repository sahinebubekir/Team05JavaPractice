package day03;

import java.util.Scanner;

public class Question09 {

    /*
     * StringMethods
       Write a Java program to compare a given string to another string, ignoring case considerations.

      ORNEK:

      INPUT      : Stephen Edwin King
                    Walter Winchell
      OUTPUT  : False

      INPUT      : Stephen Edwin King
                   stephen edwin king
      OUTPUT  : true
     */
    public static void main(String[] args) {
        String str = "Stephan Edwin King";
        System.out.println("Bir değer giriniz:");
        String str2 = new Scanner(System.in).next();
        if (str.equalsIgnoreCase(str2)) {
            System.out.println("true");
        } else
            System.out.println("false");
    }

}

