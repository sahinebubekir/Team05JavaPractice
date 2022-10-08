package day03;

import java.util.Scanner;

public class Question14 {
    /*
    Kullanicidan bir cumle alin ve birde harf veyahut kelime alin
    Alinan cumle, alinan harf veya kelime ile bitiyor mu kontrol edin
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Birsey giriniz");
        String str = scan.next();

        if(str.endsWith("")){
            System.out.println("EVET bitiyor");
        }else{
            System.out.println("Hayir bitmiyor");
        }
    }
}
