import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Por favor introduce una string:");
        String phrase = scanner.nextLine();
        // comprobación inicial
        System.out.println("phrase = " + phrase);

        String[] words = phrase.split(" ");

        System.out.println(Arrays.toString(words));

        for (String word : words) {
            if(word.matches("^[AEIOUaeiou].*")){
                counter++;
            }
            /*if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {
                counter++;
            }*/ else {
                System.out.println(word + " No empieza por vocal");
            }
        }
        System.out.println("El número de palabras que empiezan por vocal es: " + counter);
    }
}
