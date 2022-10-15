package day04;

import java.util.Scanner;

public class Question07 {

    /*
		ask user to enter a name and a character,
		then check how many times the character is repeated
		in the name using loops in the name
		e.g:
		char ch1= 'a' ;
		String name =“John came late" => number of a = 2
		*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cumle girin");
        String cumle = scan.nextLine();
        System.out.println("Harf gir");
        char harf = scan.next().charAt(0);

        count(cumle, harf);
    }

    public static void count(String str, char arananHarf){
        int count = 0;
        //araba
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == arananHarf){
                count++;
            }
        }
        System.out.println(arananHarf + " = " + count);
    }


}
