package day03;

import java.util.Scanner;

public class Question08 {
    // ask user to enter an e-mail address
    // then if it contains "hotmail" replace it with "gmail"
    // e.g: johnbrown@hotmail.com ==> johnbrown@gmail.com

    public static void main(String[] args) {
        System.out.println("E-mail adresinizi giriniz");
        String email = new Scanner(System.in).next();

        if(email.contains("hotmail")){
            email = email.replace("hotmail", "gmail");
        }
        System.out.println(email);
    }
}
