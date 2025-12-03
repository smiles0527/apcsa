package src;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3.5, 10, 20, "red", "A", true, 2);
        System.out.println(c);
        c.setRadius(5);
        c.moveTo(15, 25);
        c.updateDerived();
        System.out.println(c);
    }
}
