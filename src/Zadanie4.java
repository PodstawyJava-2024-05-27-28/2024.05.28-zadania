import java.util.Random;

public class Zadanie4 {
    /*
    wygeneruj tablice losowych liczb (10, 0-99)
    policz srednia liczb w tej tablicy
     */
    public static void main(String[] args) {
        Random losowacz = new Random();
        int[] tab = new int[10];
        int sum = 0;
        for(int i = 0; i < tab.length; i++) {
            tab[i] = losowacz.nextInt(0, 100);
            sum += tab[i];
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println("Srednia: " + ((double) sum) / ((double) tab.length));
    }
}
