package stock.instuments;

import stock.StockItem;



public abstract class Instrument extends StockItem implements IPlay {
    String material;
    String colour;
    InstrumentType type;

    public Instrument(double purchasePrice, double retailPrice, String material, String colour, InstrumentType type) {
        super(purchasePrice, retailPrice);
        this.material = material;
        this.colour = colour;
        this.type = type;
    }
}
