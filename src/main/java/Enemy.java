public class Enemy {
    private String type;
    private int life;
    public static int numberOfEnemies = 0; // esta variable static es accesible a través de la clase Enemy. No puedo acceder a ella a través de objetos heredados de esta clase

    public static String battleInfo() {
        return "El número de enemigos es: " + numberOfEnemies;
    }

    public Enemy(String type, int life) {
        setLife(life);
        setType(type);
        numberOfEnemies++;
    }

    public void attack() {
        System.out.println(type + " ha atacado.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
