import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Bösendorfer", 500, 650, "Grand", "Black", 88);
    }

    @Test
    public void canGetNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canPlayInstrument(){
        assertEquals("Plink plonk", piano.play());
    }

}
