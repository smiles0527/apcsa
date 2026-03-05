public class Mammal extends Animal {
    private String hairType;

    public Mammal(boolean alive, String hairType) {
        super(alive);
        this.hairType = hairType;
    }

    public String getHairType() {
        return hairType;
    }

    public String speak() {
        return "I'm hairy";
    }

    public String toString() {
        return super.toString() + ", hairType: " + hairType;
    }
}
