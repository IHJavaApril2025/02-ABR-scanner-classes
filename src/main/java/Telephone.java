public class Telephone {
    private String number; // privado para no tener acceso a él fuera de esta clase y modificarlo erroneamente


    Telephone(String number) { // constructor que genera una nueva instancia a través de esta clase
        setNumber(number);
        // this.number = number; // tenemos esta opción, pero ya que existe el setter, vamos a utilizarlo. Mayormente si tenemos restricciones, comprobaciones, etc
    }

    public String getNumber() {
        return "***" + number.substring(number.length() - 4);
    }

    public void setNumber(String newNumber) {
        if (newNumber.length() == 9) { // hacemos comprobación antes de modificar el objeto
            this.number = newNumber;
        } else {
            System.out.println("tienes que poner un número válido");
        }
    }

}
