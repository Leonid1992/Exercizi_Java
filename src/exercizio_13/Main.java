//Scrivere un metodo che preso in input un numero stampi tutti multipli di quel numero fino a 100

package exercizio_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();


        System.out.println(numero);

        for (int i = numero; i <= 100; i += numero) {
            System.out.println(i);
        }

    }
}
