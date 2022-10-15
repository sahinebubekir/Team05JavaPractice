package day04;

import java.util.Scanner;

public class Question06 {
    /* Kullanıcıdan sayı alın ve o sayı kadar ard arda gelen fibonacci sayı
     * dizisini ekrana yazdırın
     * örnek : Kullanıcı 10 sayısını girdi, 10 tane sayıyı ekrana yazdıracağız.
     * 		   0 1  a= 0 b = 1 c = /
     *         0 1 1 a = 0 b = 1 c = a+B = 1
     *         0 1 1 2  C'NIN DEGERI B'NIN YENI DEGERINE A'NIN DA YENI DEGERI B'NIN ESKI DEGERINE
     *
     * Süre : 3 dk ,  9 geçe biter.
     *
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fibonacciDiziSayisi = scan.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b);
        for(int i = 0; i<fibonacciDiziSayisi-2; i++){
            c = a + b; // c = 1 b =1 a=0
            a = b; // c= 1 b=1 a=1
            b = c; //c = 1 b = 1 a= 1
            System.out.print(" " + c);
        }
    }
}
