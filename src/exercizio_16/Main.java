//Scrivere un metodo per verificare se esistono duplicati in un array

package exercizio_16;

class Main
{
    public static String [] arr = {"leo", "marco", "anna", "giovanni", "leo"};
    public static void main(String[] args) {
        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i].equals(arr[j])){
                    System.out.println("duplicato trovato : " + arr[i].toUpperCase());
                }
            }
        }

    }
}
