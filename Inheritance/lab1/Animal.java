public class Animal {
    private boolean alive;

    public Animal(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public String speak() {
        return "";
    }

    public String toString() {
        if (alive) {
            return "alive";
        } else {
            return "dead";
        }
    }
}
