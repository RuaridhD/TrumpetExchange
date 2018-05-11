package instruments;

public class Piano extends Instrument {

    int numberOfKeys;

    public Piano(String description, double buyPrice, double sellPrice, String type, String colour, int numberOfKeys) {
        super(description, buyPrice, sellPrice, type, colour);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
