import java.util.Scanner;

public class StandardInputs {
    public static void main(String[] args) {
        var myScanner = new Scanner(System.in); // creamos una instancia de un scanner

        System.out.println("Cómo te llamas?");
        String name = myScanner.nextLine();

        System.out.printf("Hola %s, te doy la bienvenida a Matrix", name);

        System.out.println("¿Cuántos años tienes?");
        int age = myScanner.nextInt();

        if(age < 18){
            System.out.println("Lo siento no puedes tener una cuenta bancaria");
        }else{
            System.out.println("Accede a tu perfil para crear la cuenta");
        }
    }
}
