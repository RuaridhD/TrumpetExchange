import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums("Pearl", 250, 340, "Acoustic", "Blue", 3);

    }

    @Test
    public void canGetNumberOfPieces(){
        assertEquals(3, drums.getNumberOfPieces());
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Bang crash ding", drums.play());
    }

}
