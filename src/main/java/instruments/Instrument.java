package instruments;

import interfaces.IPlay;
import interfaces.ISell;
import items.Item;

public abstract class Instrument extends Item implements IPlay, ISell {

    String type;
    String colour;
    IPlay iPlay;

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

    public String play(String sound){
        return this.iPlay.play(sound);
    }
}
