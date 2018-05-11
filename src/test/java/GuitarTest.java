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
}
