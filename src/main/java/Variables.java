public class Variables {
    public static void main(String[] args) {
        int number;
        number = 10;

        var name = "Marcel";
        var number2 = 20.65;
        int age = 38;

        System.out.println("name = " + name);
        System.out.printf("El nombre es %s %n", name); // otra forma de mostrar strings con valores de variables

        // %d es para ints
        // %f es para float o double
        // %s para strings
        // %c para chars
        // %b para booleans
        // %n para una nueva línea
        System.out.printf("El number es %f %n", number2);
        System.out.printf("%s tiene %d años", name, age); // en el mismo orden en el que aparecen en la string, los ponemos como argumentos
    }
}
