//Scrivere un programma java per invertire una stringa.

package exercizio_1;

public class Main {
    public static void main(String[] args) {
        String text = "parola";
        String inversa = "";
        for (int i = text.length()-1; i >= 0;i--){
            inversa += text.charAt(i);
        }
        System.out.println(inversa);
    }
}
