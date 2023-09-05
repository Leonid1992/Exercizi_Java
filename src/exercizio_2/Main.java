//Scrivere un programma java che verifichi se una stringa e palindroma;

package exercizio_2;

public class Main {
    public static void main(String[] args) {
        String text = "otto";
        String inversa = "";
        for (int i = text.length()-1; i >= 0; i--){
            inversa += text.charAt(i);
        }
        if (text.equals(inversa)){
            System.out.println(inversa + ": la parola e palindroma");
        }else {
            System.out.println(inversa + ": la parola non e palindroma");
        }
    }
}