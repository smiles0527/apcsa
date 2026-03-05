import java.util.ArrayList;

public class InheritanceDriver {
    public static void main(String[] args) {
        Cat c1 = new Cat(true, "Fuzzy", "Kitty");
        Cat c2 = new Cat(false, "Short", "Mittens");
        Dog d1 = new Dog(true, "Curly", "Buddy");
        Dog d2 = new Dog(true, "Wire", "Max");
        Robin r1 = new Robin(true, true, "Red");
        Robin r2 = new Robin(false, true, "Ruby");
        Crow cr1 = new Crow(true, true, "Shadow");
        Crow cr2 = new Crow(true, false, "Midnight");

        System.out.println(c1.speak());

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(c1);
        animals.add(c2);
        animals.add(d1);
        animals.add(d2);
        animals.add(r1);
        animals.add(r2);
        animals.add(cr1);
        animals.add(cr2);

        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
            System.out.println();
        }
    }
}
