package day04;

import java.util.Scanner;

public class Question01 {
    /* Write a return method that accepts an integer as input
     * and calculates factorial and prints like output
     *
     * Eg : Input : 6
     *      Output: 6!=6*5*4*3*2*1=720
     */


    public static void main(String[] args) {
        //ALternatif 1
        //Scanner scan = new Scanner(System.in);
        //int sayi = scan.nextInt()
        System.out.println("Faktoriyel istediginiz bir sayi giriniz");
        //Alternatif 2
        int sayi = new Scanner(System.in).nextInt();
        //factoriel(sayi);
        System.out.println(factoriel02(sayi));

    }

    private static void factoriel(int sayi) {
        int faktoriyel = 1;
        for(int i = sayi; i>0; i--){
            faktoriyel = sayi * faktoriyel;
        }
        System.out.println(sayi);
        System.out.println(faktoriyel);
    }

    private static int factoriel02(int sayi) {
        int faktoriyel = 1;
        for(int i = sayi; i>0; i--){
            faktoriyel = i * faktoriyel;
        }
        System.out.println(sayi);
        System.out.println(faktoriyel);
        return faktoriyel;
    }


}
