//Scrivere un metodo che prenda in input un array di numery e restituisca  il massimo tra tutti gli elelemti

package exercizio_11;
public class Main {
    public static void main(String[] args) {
        int[] numeri = {4, 7, 2, 1, 6};

        int max = cerca(numeri);

        System.out.println("Il valore massimo:  " + max);
    }

    public static int cerca(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
