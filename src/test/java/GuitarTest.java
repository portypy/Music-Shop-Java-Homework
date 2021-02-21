import org.junit.Before;
import org.junit.Test;
import stock.instuments.Guitar;
import stock.instuments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    private Guitar guitar = new Guitar(10, 15, "wood", "red", InstrumentType.STRING,5);

    @Before
    public void before() {
    }

    @Test
    public void hasCalculateMarckup() {
        assertEquals(5, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Sound of a guitar", guitar.play());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar.getType());
    }
}
