package stock.instuments;

import stock.StockItem;

public abstract class Instrument extends StockItem implements IPlay {
    public Instrument(double purchasePrice, double retailPrice) {
        super(purchasePrice, retailPrice);
    }
}
