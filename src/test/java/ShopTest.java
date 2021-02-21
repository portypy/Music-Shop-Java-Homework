import org.junit.Before;
import org.junit.Test;
import shop.ISell;
import shop.Shop;
import stock.instuments.Guitar;
import stock.instuments.InstrumentType;
import stock.other.GuitarStrings;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    GuitarStrings strings;

    @Before
    public void before(){
        guitar = new Guitar(10, 15, "wood", "red", InstrumentType.STRING,5);
        strings = new GuitarStrings(2,4.50,"Yamaha");
        ArrayList<ISell>stock = new ArrayList<>();
        shop = new Shop(stock);
    }

    @Test
    public void canAddToStock(){
        this.shop.addItemToStock(guitar);
        assertEquals(true, this.shop.getStock().contains(guitar));
    }

    @Test
    public void canRemoveFromStock(){
        this.shop.addItemToStock(guitar);
        this.shop.removeFromStock(guitar);
        assertEquals(0, this.shop.getStock().size());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        this.shop.addItemToStock(guitar);
        this.shop.addItemToStock(strings);
        assertEquals(7.5, this.shop.getTotalPossibleProfit(), 0.01);

    }
}
