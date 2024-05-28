import java.util.Random;

public class Zadanie6 {
    /*
    wygeneruj tablice losowych (0 - 999) liczb 2D (10x10)
    program ma policzyć średią każdego wiersza
    program ma wypisać największą średnią i nuymer wiersza w którym ona wystąpiła
     */
    public static void main(String[] args) {
        int[][] tab = new int[10][10];
        Random losowacz = new Random();

        double max = 0.0;
        int maxRowNo = 0;
        for(int row = 0; row < 10; row++) {
            int sum = 0;
            for(int col = 0; col < 10; col++) {
                tab[row][col] = losowacz.nextInt(0, 1000);
                System.out.print(tab[row][col] + "\t");
                sum += tab[row][col];
            }
            System.out.println();
            double srednia = ((double) sum) / 10.0;
            if(srednia > max) {
                max = srednia;
                maxRowNo = row;
            }
        }
        System.out.println("Najwieksza srednia: " + max + " w wierszu: " + maxRowNo);
    }
}
