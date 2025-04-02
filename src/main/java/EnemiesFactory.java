public class EnemiesFactory {
    public static void main(String[] args) {
        var zombie1 = new Zombie();
        var skeleton1 = new Skeleton();
        var skeleton2 = new Skeleton();
        System.out.println(zombie1.getType());

        zombie1.attack();
        skeleton1.attack();
        // skeleton1.numberOfEnemies // no se puede 🙅‍♀️
        System.out.println(Enemy.numberOfEnemies); // aquí accedemos a la static numberOfEnemies que solo está disponible a través de la clase
        System.out.println(Enemy.battleInfo());
    }
}
