package day02;

import java.util.Scanner;

public class Practice04 {

    /*
     * Print “Please enter your job title” create a String variable named “jobTitle”
     * and get the data from the user Use the below test data to print the correct
     * jobTitle. Example : if jobTitle is qa then print “Your job title is Quality
     * Analyst” test data: qa then print Quality Analyst dev then print Developer ba
     * then print Business Analyst pm then print Project Manager
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your job title");
        char jobTitle = scan.next().toLowerCase().charAt(0);


        if(jobTitle == 't'){
            System.out.println("Testersiniz");
        }else if(jobTitle == 'd'){
            System.out.println("Developersiniz");
        }else if(jobTitle == 'b'){
            System.out.println("Is Analistisiniz");
        }else{
            System.out.println("Yanlis meslek kodu girdiniz");
        }

    }
}
