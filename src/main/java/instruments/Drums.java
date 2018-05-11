package instruments;

public class Drums extends Instrument {

    int numberOfPieces;

    public Drums(String description, double buyPrice, double sellPrice, String type, String colour, int numberOfPieces) {
        super(description, buyPrice, sellPrice, type, colour);
        this.numberOfPieces = numberOfPieces;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public String play(){
        return "Bang crash ding";
    }
}
