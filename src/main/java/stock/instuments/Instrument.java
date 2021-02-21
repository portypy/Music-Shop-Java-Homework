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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }
}
