package day04;

import java.util.Scanner;

public class Question08 {

     /*
		 * Perfect Number (Mükemmel sayı)
         Bir sayının mükemmel olup olmadığını bulan method yazınız.
         Mükemmel sayı : bir sayının kendisi hariç tam bölenlerinin toplamı,
         kendisine eşitse o sayı mükemmeldir.
        örnek :   ->


         ORNEK:

     INPUT      : 6

     OUTPUT :  1,2,3
                        1+2+3 = 6 = 6 (Mükemmel)
		 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi gir");
        int sayi = scan.nextInt();
        int toplam = 0;
        for(int i = 1; i<sayi-1; i++){
            if(sayi%i == 0 ){
                toplam += i;
            }
        }
       if(toplam == sayi){
           System.out.println("Mukemmel sayi");
       }else{
           System.out.println("Mukemmel sayi degil");
       }
    }


}
