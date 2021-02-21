package stock.other;

import stock.StockItem;

public class GuitarStrings extends StockItem {

    String brand;

    public GuitarStrings(double purchasePrice, double retailPrice, String brand) {
        super(purchasePrice, retailPrice);

        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
