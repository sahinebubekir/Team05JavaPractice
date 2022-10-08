package day03;

import java.util.Scanner;

public class Question04 {
    /*
	 Kullanicidan bir sayi iste.
Kullaniciya sececegi sembollerin menusunu goster ve birisini secmesini iste.
 Toplama : 1 Cikarma : 2 Carpma : 3 Bolme :4
Kullanicidan bir sayi daha iste.
Sonucu ekranda yazdir.
ORNEK:

INPUT      : Num1: 23
                         +
                  Num2: 55

OUTPUT  : Islemin Sonucu : 78
	 SWITCH ILE YAPIN

	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullaniciya sececegi sembollerin menusunu goster ve birisini secmesini iste.\n" +
                "Toplama : 1\nCikarma : 2\nCarpma : 3 \nBolme :4\n");
        String secim = scan.next();
        System.out.println("Lutfen islem yapmak istediginiz iki sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        switch (secim){
            case "1":
                System.out.println(sayi1 + sayi2);
                break;
            case "2":
                if(sayi1<sayi2){
                    System.out.println(sayi2 - sayi1);
                }else{
                    System.out.println(sayi1 - sayi2);
                }
                break;
            case "3":
                System.out.println(sayi1 * sayi2);
                break;
            case "4":
                System.out.println(sayi1 / sayi2);
                break;
            default:
                System.out.println("YANLis giris yaptiniz");
        }
    }
}
