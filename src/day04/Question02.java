package day04;

public class Question02 {
    // 1 den 100 e kadar olan sayilarin 3'e 5'e ve 15' bolunen sayilari yazdiralim.
    // 3 e bolunen sayilar: 3 6 9 12 ----
    //5 e bolunen sayilar:5 10 15 20 --
    // 15 e bolunen sayilar: 15 30 45 60---

    public static void main(String[] args) {
       birdenYuzeKadar();
    }

    private static void birdenYuzeKadar() {
        System.out.print("3'e bolunenler ");
        for(int i = 1; i<=100; i++){
            if (i%3 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("5'e boulnenler ");

        for(int i = 1; i<=100; i++){
            if (i%5 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("15'e boulnenler ");
        for(int i = 1; i<=100; i++){
            if (i%15 == 0){
                System.out.print(i + " ");
            }
        }
    }


}
