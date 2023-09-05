//Scrivere un metodo che stampi la serie di Fibonacci


package exercizio_8;
public class Main {

    public static void main(String[] args) {
        int totale = 10;

        fibonacci(totale);
    }

    public static void fibonacci(int numero) {

        int primo = 0;
        int secondo = 1;


        for (int i = 0; i < numero; i++) {
            System.out.print(primo);
            int prossimo = primo + secondo;
            primo = secondo;
            secondo = prossimo;
        }

        System.out.println();
    }

}
