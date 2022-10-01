package day02;

import java.util.Scanner;

public class Practice03 {
        /*

    Kullanicidan bir sayi alip bu sayinin mutlak degerini yazan Java kodunu yaziniz.
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mutlak degerini gormek istediginiz bir sayi giriniz");
        int sayi = scan.nextInt();

        if(sayi<0){
            System.out.println(-sayi);
        }else{
            System.out.println(sayi);
        }
    }

}


/*

 */