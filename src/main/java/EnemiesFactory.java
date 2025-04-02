public class EnemiesFactory {
    public static void main(String[] args) {
        var zombie1 = new Zombie();
        var skeleton1 = new Skeleton();
        System.out.println(zombie1.getType());

        zombie1.attack();
        skeleton1.attack();
    }
}
