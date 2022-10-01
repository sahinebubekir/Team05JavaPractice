package day02;

import java.util.Scanner;

public class Practice02 {
                    /*
            Kullanicidan bir sifre aliniz.
            Eger sifre JavaLearner iste, console'da dogru degil ise yanlis yazdiriniz.
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sifre giriniz");

        String sifre = scan.next();

        if(sifre.equals("JavaLearner")) {
            System.out.println("Dogru");
        }else{
            System.out.println("Yanlis");
        }

        if("JavaLearner".equals(sifre)){
            System.out.println("Dogru");
        }else{
            System.out.println("Yanlis");
        }

//        if(sifre.equalsIgnoreCase("JavaLearner")) {
//            System.out.println("Dogru Ignore Case");
//        }


    }

}
