public class ChocolateFactory {
    public static void main(String[] args) {
        var bar1 = new ChocolateBar("Strawberry"); // estamos creando una instancia de la clase ChocolateBar

        bar1.setFlavour("Pepinillo");
        System.out.println(bar1.getFlavour());
    }
}
