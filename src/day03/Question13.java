package day03;

import java.util.Scanner;

public class Question13 {
    /*
    Kullanicidan basinda ve sonunda bosluklar olan bir String alin
    varolan basindaki ve sonundaki bosluklari kaldirin.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birsey giriniz");
        String str = scan.nextLine();

        System.out.println(str.trim());
    }
}
