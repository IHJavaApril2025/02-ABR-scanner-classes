public class ChocolateBar {
    private String flavour;
    final private int WEIGHT = 100;

    ChocolateBar(String flavour) { // esto es el constructor

        this.flavour = flavour;
    }

    //
    public static void main(String[] args) {
        var bar1 = new ChocolateBar("Vanilla");
        var bar2 = new ChocolateBar("Dark chocolate");
        var bar3 = new ChocolateBar("Milk");

        System.out.println(bar1.flavour);
        System.out.println(bar2.flavour);
        System.out.println(bar3.flavour);
        System.out.println(bar1.WEIGHT);
    }

    public String getFlavour() {
        return flavour;
    }

    public String getWeight() {
        return WEIGHT + "g";
    }

    public void setFlavour(String flavour) {
        if (flavour.equals("Nocilla")) { // en java no se puede usar el == para strings.
            System.out.println("No trabajamos con nocilla, sorry, somos mas de Nutella");
        } else {
            this.flavour = flavour;
        }
    }


}
