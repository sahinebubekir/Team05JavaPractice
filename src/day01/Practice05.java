package day01;

import java.util.Scanner;

public class Practice05 {

    /*
    Kullanicidan iki ayri String isteyin ve bu Stringleri birlestirerek yazin
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk Stringi giriniz");
        String first = scan.next();
        System.out.println("Ikinci Stringi giriniz");
        String second = scan.next();

        System.out.println(first + " " + second);

        String sum = first + second;
        System.out.println("Ikinci yontem " + sum);
    }
}
