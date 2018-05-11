package items;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Item implements ISell {

    String description;
    double buyPrice;
    double sellPrice;

    public Item(String description, double buyPrice, double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkUp(){
        double markUp;
        markUp = sellPrice -= buyPrice;
        return markUp;
    }
}
