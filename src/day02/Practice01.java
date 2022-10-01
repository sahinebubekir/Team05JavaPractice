package day02;

import java.util.Scanner;

public class Practice01 {
		/*
		 Write a Java program that accepts two float numbers and checks if they are equal.
EXAMPLE:
       INPUT      :
first float number: 1235
second float number: 2534

       OUTPUT :
These numbers are different.
 */

    public static void main(String[] args) {
        System.out.println("Ilk float sayinizi giriniz");
        float sayi1 = new Scanner(System.in).nextFloat();
        System.out.println("first float number: " + sayi1);
        float sayi2 = 1234f;
        System.out.println("first float number: " + sayi2);

        if(sayi1 == sayi2) {
            System.out.println("These numbers are equals");
        }else{
            System.out.println("These numbers are different");
        }


    }
}