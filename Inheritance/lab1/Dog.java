public class Dog extends Mammal {
    private String name;

    public Dog(boolean alive, String hairType, String name) {
        super(alive, hairType);
        this.name = name;
    }

    public String speak() {
        return "bark, bark";
    }

    public String toString() {
        return "Dog - " + super.toString() + ", name: " + name;
    }
}
