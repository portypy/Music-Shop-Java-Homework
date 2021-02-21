import org.junit.Before;
import org.junit.Test;
import shop.ISell;
import shop.Shop;
import stock.instuments.Guitar;
import stock.instuments.InstrumentType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    ArrayList<ISell>stock;

    @Before
    public void before(){
        guitar = new Guitar(10, 15, "wood", "red", InstrumentType.STRING,5);
        ArrayList<ISell>stock = new ArrayList<>();
        shop = new Shop(stock);
    }

    @Test
    public void canAddToStock(){
        this.shop.getStock().add(guitar);
        assertEquals(true, this.shop.getStock().contains(guitar));
    }
}
