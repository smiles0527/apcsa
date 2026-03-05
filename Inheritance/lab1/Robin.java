public class Robin extends Bird {
    private String name;

    public Robin(boolean alive, boolean canFly, String name) {
        super(alive, canFly);
        this.name = name;
    }

    public String speak() {
        return "chirp, chirp";
    }

    public String toString() {
        return "Robin - " + super.toString() + ", name: " + name;
    }
}
