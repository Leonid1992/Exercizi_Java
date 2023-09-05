//Scrivere un metodo java che prende in input un numero e stampi tutti i numeri dispari minori di quel numero

package exercizio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        risultato(numero);
    }
    public static void risultato (int numero) {
        for (int i = 0; i < numero; i++) {
            if (i % 2 == 1) {
                System.out.println(i + "numero dispari");
            }
        }
    }
}
