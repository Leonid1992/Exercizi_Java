//Scrivere un metodo java che preso in input una stringa di piu parole restituisca un'array contenente ogni singola parola

package exercizio_7;


public class Main {
    public static void main(String[] args) {
        String stringa = "Scrivere un metodo java";
        String[] array = splitString(stringa);

        for (String str : array){
            System.out.println(str);
        }
    }

    public static String[] splitString(String input) {

        String[] array = input.split("\\s+");

        return array;
    }
}

