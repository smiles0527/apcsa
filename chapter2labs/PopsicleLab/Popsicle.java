package Chapter2Labs.PopsicleLab;

/**
 * Chapter 2 Popsicle Lab - Popsicle class.
 */
public class Popsicle {

    private String flavour;
    private int size;
    private int remaining;

    /**
     * Constructs a Popsicle with the provided flavour and size.
     *
     * @param flavour the flavour of the popsicle
     * @param size the total size of the popsicle
     */
    public Popsicle(String flavour, int size) {
        this.flavour = flavour;
        this.size = size;
        this.remaining = size;
    }

    /**
     * Returns the flavour of the popsicle.
     *
     * @return flavour value
     */
    public String getFlavour() {
        return flavour;
    }

    /**
     * Bites the popsicle and returns the remaining amount.
     *
     * @param amount amount taken in the bite
     * @return remaining popsicle amount
     */
    public int bite(int amount) {
        if (amount < 0) {
            return remaining;
        }
        remaining -= amount;
        if (remaining < 0) {
            remaining = 0;
        }
        return remaining;
    }

    
    public String toString() {
        return "Popsicle{flavour='" + flavour + "', size=" + size
                + ", remaining=" + remaining + "}";
    }
}


