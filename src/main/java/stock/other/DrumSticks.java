package stock.other;

import stock.StockItem;

public class DrumSticks extends StockItem {

    String colour;

    public DrumSticks(double purchasePrice, double retailPrice, String colour) {
        super(purchasePrice, retailPrice);

        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
