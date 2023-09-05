//Scrivere un metodo in java che converte una stringa in numero e in caso di eccezione restituisca la stringa "TI PIACEREBBE..."
package exercizio_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numero = scan.nextLine();
        risultato(numero);
    }
    private static void risultato(String numero){
        try{
            int number = Integer.parseInt(numero);
            System.out.println(number);
        }catch (NumberFormatException ex){
            System.out.println("TI PIACEREBBE...");
        }
    }
}
