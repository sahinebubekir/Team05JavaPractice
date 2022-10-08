package day02;

import java.util.Objects;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        /*Soru 4- Kullanicidan gun ismini girmesini isteyin, girilen gun hafta ici bir gun ise
                  "Simdi calisma zamani tatile .. gun var" seklinde hafta sonu tatiline kac
                   gun kaldigini yazdirin, girilen gun hafta sonu ise "Simdi dinlenme
                   zamani" yazdirin.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismini giriniz");
        String gunismi = scan.next();

        if (Objects.equals(gunismi, "pazartesi")) {
            System.out.println("simdi calışma zamanı tatile " + (5) + "gun var");
        }
        if (Objects.equals(gunismi, "salı")) {
            System.out.println("simdi calışma zamanı tatile " + (4) + "gun var");
        }
        if (Objects.equals(gunismi, "carsamba")) {
            System.out.println("simdi calışma zamanı tatile " + (3) + "gun var");
        }
        if (Objects.equals(gunismi, "persembe")) {
            System.out.println("simdi calışma zamanı tatile " + (2) + "gun var");
        }
        if (Objects.equals(gunismi, "cuma")) {
            System.out.println("simdi calışma zamanı tatile " + (1) + "gun var");
        }
        if (Objects.equals(gunismi, "cumartesi")) {
            System.out.println("simdi dinlenme zamanı");
        }
        if (Objects.equals(gunismi, "pazar")) {
            System.out.println("simdi dinlenme zamanı");
        }
    }
}
