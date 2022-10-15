package day04;

public class Question09 {
    /*
     * HM(Hesap makinasi) isimli bir class olusturun
     * Icine 2 sayiyi carpan , 2 sayiyi toplayan ve sonucunu donduren 2 method
     * 3 sayiyi carpan, 3 sayiyi toplayan ve sonucu yazdiran 2 method olusturun
     *
     *
     */

    public static void main(String[] args) {
        int sayi1 = 5, sayi2 = 10, sayi3 = 15;
        ikiCarpma(sayi1, sayi2);
        System.out.println(ikiToplama(sayi1, sayi2));
        ucCarpma(sayi1, sayi2, sayi3);
        ucToplama(sayi1, sayi2, sayi3);
    }

    public static int ikiCarpma(int a, int b){
        System.out.println(a*b);
        return a*b;
    }
    public static int ikiToplama(int a, int b){
        return a+b;
    }
    public static int ucCarpma(int a, int b, int c){
        return a*b*c;
    }
    public static int ucToplama(int a, int b, int c){
        return a+b+c;
    }
}
