/*Scrivere un metodo in java preso in input un numero stampi un triangolo come il seguente:
ES:input = 6
1
12
123
1234
12345
123456
 */

package exercizio_14;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        stampa(n);
    }

    public static void stampa(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
