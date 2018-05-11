import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", 300, 400, "Electric", "Red", 6);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Fender", guitar.getDescription());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(300, guitar.getBuyPrice(), 0.01);
    }


    @Test
    public void canGetSellPrice(){
        assertEquals(400, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetType(){
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Twing twang", guitar.play());
    }
}
