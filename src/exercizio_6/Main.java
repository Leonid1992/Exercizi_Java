//Scrivere un metodo in java che prende in input una stringa e transformi in maiuscolo tutti i caratteri pari
package exercizio_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stringa = scan.nextLine();
        String result = trasformato(stringa);
        System.out.println(result);
    }
    public static String trasformato(String stringa) {

        char[] array = stringa.toCharArray();
        for (int i = 0; i < array.length-1; i++) {
            if (i % 2 == 0) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        return new String(array);
    }
}




