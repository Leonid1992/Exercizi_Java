//Scrivere un metodo in java che presa in input una temperatura in Celsius la trasformi in Frahrenheit.212Fahrenheit = 100 Celsius

package exercizio_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double celsius = scan.nextDouble();
        double fahrenheit = trasforma(celsius);

        System.out.println(celsius + " gradi Celsius corrispondono a " + fahrenheit + " gradi Fahrenheit");
    }

    public static double trasforma(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
}
