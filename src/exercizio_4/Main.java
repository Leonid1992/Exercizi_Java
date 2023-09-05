//Scrivere un metodo java che prende in input un numero e verifichi se quel numero sia pari o dispari

package exercizio_4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        risultato(numero);
    }
    private static void risultato (int numero) {

        String risultato = null;

            if (numero % 2 == 1) {
                System.out.println(numero + ": numero dispari");
            }
            else{
                System.out.println(numero + ": il numero e pari");
            }
    }
}