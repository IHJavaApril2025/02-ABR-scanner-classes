public class Skeleton extends Enemy {
    public Skeleton() {
        super("Skeleton", 100);
    }

    @Override // anotación para indicar que vamos a sobreescribir el método siguiente
    public void attack() {
        System.out.println(this.getType() + " ataca y se desmonta");
    }
    // si hay más métodos a sobreescribir debemos repetir el @Override
    // polimorfismo. Según el contexto el objeto adopta distintas formas. En este caso con el método attack
}
