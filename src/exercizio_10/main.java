//Scrivere un metodo che prenda in input un numero e verifichi se e presente in un array

package exercizio_10;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        boolean trovato = cercaNumero(array, numero);

        if (trovato) {
            System.out.println(numero + " e presente");
        } else {
            System.out.println(numero + " non e presente");
        }
    }
    public static boolean cercaNumero(int[] array, int num) {
        for (int element : array) {
            if (element == num) {
                return true;
            }
        }
        return false;
    }
}
