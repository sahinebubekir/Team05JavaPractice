package day02;

import java.util.Scanner;

public class Practice05 {

    /*
     * Kullanicidan email girmesini isteyin,

     *
     *sadece “@gmail.com” ile bitiyorsayaziyorsa “email onaylandi” yazdirin
   “@gmail.com” disinda birsey ile bitiyorsa “Lutfen gmail
     * hesabinizi girin” yazdirin
     *
     * ORNEK:
     *
     * INPUT : java.com OUTPUT : “gecerli bir email girin”
     * INPUT : java@gmail.com OUTPUT : “email onaylandi”
     * INPUT : java@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin
     *
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mail adresininzi giriniz");
        String email = scan.next();
        //"ebu@gmail.com" bu String yan tarafinda yazan hersey ile biter. // "ebu@gmail.com .com m om com gmail.com @gmail.com
        if(email.endsWith("@gmail.com")){
            System.out.println("Email onaylandi");
        } else if(email.endsWith("@hotmail.com")){
            System.out.println("Gmail adresinizi giriniz");
        }else{
            System.out.println("Lutfen gecerli bir email adresi giriniz");
        }

    }
}
