package instruments;

public class Guitar extends Instrument {

    int numberOfStrings;

    public Guitar(String description, double buyPrice, double sellPrice, String type, String colour, int numberOfStrings) {
        super(description, buyPrice, sellPrice, type, colour);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }


    public String play(){
        return "Twing twang";
    }
}
