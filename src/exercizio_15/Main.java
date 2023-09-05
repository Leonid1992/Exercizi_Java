//Scrivere un metodo in java che elimina da un array uno specifico numero di input

package exercizio_15;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        int[] newArray = cancellaNumero(array,numero);

        System.out.println("array originale: " + Arrays.toString(array));
        System.out.println("numero da rimuovere: " + numero);
        System.out.println("array: " + Arrays.toString(newArray));
    }
    public static int[] cancellaNumero(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }
        return newArray;
    }
}
