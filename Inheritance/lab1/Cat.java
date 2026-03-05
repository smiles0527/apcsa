public class Cat extends Mammal {
    private String name;

    public Cat(boolean alive, String hairType, String name) {
        super(alive, hairType);
        this.name = name;
    }

    public String speak() {
        return "meow";
    }

    public String toString() {
        return "Cat - " + super.toString() + ", name: " + name;
    }
}
