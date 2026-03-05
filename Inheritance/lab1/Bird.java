public class Bird extends Animal {
    private boolean canFly;

    public Bird(boolean alive, boolean canFly) {
        super(alive);
        this.canFly = canFly;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public String speak() {
        return "Feathers for me";
    }

    public String toString() {
        return super.toString() + ", canFly: " + canFly;
    }
}
