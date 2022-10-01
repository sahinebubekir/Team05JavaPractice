package day02;

import java.util.Scanner;

public class Practice07 {
    //     Create a class : “NestedIfStatements”
//      ask user to enter 2 birth dates
//      Get the year, months, and day as integer
//      then find the older person using Nested if statements
//      Examples:
//      int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12,
//      int birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21;
//      Yusuf is Older


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A hanim dogum gununuzu giriniz");
        int aDogumGunu = scan.nextInt();
        System.out.println("A hanim dogum ayinizi giriniz");
        int aDogumAyi = scan.nextInt();
        System.out.println("A hanim dogum yilinizi giriniz");
        int aDogumYili = scan.nextInt();


        System.out.println("B bey dogum gununuzu giriniz");
        int bDogumGunu = scan.nextInt();
        System.out.println("B bey dogum ayinizi giriniz");
        int bDogumAyi = scan.nextInt();
        System.out.println("B bey dogum yilinizi giriniz");
        int bDogumYili = scan.nextInt();

        if (aDogumYili > bDogumYili) {
            System.out.println(" B kisisi daha buyuk");
        } else if (bDogumYili > aDogumYili) {
            System.out.println(" A kisisi daha buyuk");
        } else {
            if (aDogumAyi > bDogumAyi) {
                System.out.println(" B kisisi daha buyuk");
            } else if (bDogumAyi > aDogumAyi) {
                System.out.println(" A kisisi daha buyuk");
            } else {
                if (aDogumGunu > bDogumGunu) {
                    System.out.println("B kisisi daha buyuk");
                } else if (bDogumGunu > aDogumGunu) {
                    System.out.println("A Kisisi daha buyuk");
                } else {
                    System.out.println("Yasitsiniz");
                }
            }


        }


    }
}
