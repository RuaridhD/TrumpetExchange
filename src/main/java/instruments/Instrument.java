package instruments;

import items.Item;

public abstract class Instrument extends Item {

    String type;
    String colour;

    public Instrument(String description, double buyPrice, double sellPrice, String type, String colour) {
        super(description, buyPrice, sellPrice);
        this.type = type;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }
}
