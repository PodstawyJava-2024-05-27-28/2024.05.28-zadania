public class Zadanie1 {
    /*
    wygeneruj tablice z liczbami 0 - 99 (0,1,2,3,4,5,... - 100 elementow)
    wypisz z tablicy tylko liczbny podzielne przez 4
     */
    public static void main(String[] args) {
        int[] tab = new int[100];
        for(int i = 0; i < tab.length; i++) {
            tab[i] = i;
            if(tab[i] % 4 == 0 && tab[i] != 0) {
                System.out.println(tab[i]);
            }
        }
    }
}
