package day03;

import java.util.Scanner;

public class Question01 {
    /*
    Kullanicidan String degiskenine atanacak sekilde bir sayi alin ve onu integer'a cevirin
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi girin");
        String stringSayi = scan.next();

        //System.out.println(stringSayi);
        int sayiConverted = Integer.parseInt(stringSayi);
        System.out.println(sayiConverted + 5);
        // Su anki bilgilerimizle basaramadik.
//        if(Integer.parseInt(stringSayi)>=0 || Integer.parseInt(stringSayi)<0){
//            int sayiConverted = Integer.parseInt(stringSayi);
//            System.out.println(sayiConverted + 5);
//        }else{
//            System.out.println("SAYI GIRINIZ");
//        }

        //int sayiConverted = Integer.parseInt(stringSayi);
    }



}
