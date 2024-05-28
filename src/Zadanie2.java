import java.util.Random;

public class Zadanie2 {
    /*
    wygeneruj tablice (100 elementów) losowych liczb
    poszukaj w tej tablicy największej liczby
     */
    public static void main(String[] args) {
        Random losowacz = new Random();
        int[] tab = new int[100];
        tab[0] = losowacz.nextInt(0,201);
        System.out.print(tab[0] + " ");
        int max = tab[0];
        for(int i = 1; i < tab.length; i++) {
            tab[i] = losowacz.nextInt(0,201);
            if(tab[i] > max) {
                max = tab[i];
            }
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println(max);
    }
}
