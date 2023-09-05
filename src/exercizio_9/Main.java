//Scrivere un metodo che dati 2 array restituisca un array in cui ogni elemento e la somma degli alementi nella stessa posizione .Es:[1,2,3],[4,5,6]=[5,7,9]
package exercizio_9;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] somArray = somArrays(array1, array2);

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Sum Array: " + Arrays.toString(somArray));
    }

    public static int[] somArrays(int[] array1, int[] array2) {

        int[] somArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            somArray[i] = array1[i] + array2[i];
        }

        return somArray;
    }

}
