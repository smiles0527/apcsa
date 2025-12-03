package popsicle;

public class MakePop {

    public static void main(String[] args) {
        Popsicle treat = new Popsicle("Cherry", 100);

        System.out.println("Flavour: " + treat.getFlavour());
        System.out.println("Details: " + treat.toString());

        int remaining = treat.bite(25);
        System.out.println("After a bite, popsicle remaining: " + remaining);
    }
}


