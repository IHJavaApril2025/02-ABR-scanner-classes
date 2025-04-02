public class Enemy {
    private String type;
    private int life;

    public Enemy(String type, int life) {
        setLife(life);
        setType(type);
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
