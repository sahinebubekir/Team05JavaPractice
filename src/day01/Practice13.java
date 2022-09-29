package day01;

import java.util.Scanner;

public class Practice13 {
    		/*
		 Ask user to enter two numbers
		 Show them e menu of operation signs and ask them to choose one.
		 "Addition: 1 , Subtraction : 2 , Multiplication : 3, Division : 4
		 Print the result on the console

		 EXAMPLE:
		 	INPUT:    Num1 : 23
		 		      Num2 : 55
		 	OUTPUT :  Result : 78
		 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Iki sayi girinniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Hangi islem yapmak istediginiz lutfen secininz" +
                "\nAddition: 1 , Subtraction : 2 , Multiplication : 3, Division : 4");
        byte secim = scan.nextByte();

        if(secim == 1){
            System.out.println(num1 + num2);
        }
        if(secim == 2){
            System.out.println(num1 - num2);
        }
        if(secim == 3){
            System.out.println(num1*num2);
        }
        if(secim == 4){
            System.out.println(num1/num2);
        }

    }
}
