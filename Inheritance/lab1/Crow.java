public class Crow extends Bird {
    private String name;

    public Crow(boolean alive, boolean canFly, String name) {
        super(alive, canFly);
        this.name = name;
    }

    public String speak() {
        return "caw, caw";
    }

    public String toString() {
        return "Crow - " + super.toString() + ", name: " + name;
    }
}
