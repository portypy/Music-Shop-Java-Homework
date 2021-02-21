package stock;

import shop.ISell;

public abstract class StockItem implements ISell {
    double PurchasePrice;
    double retailPrice;

    public StockItem(double purchasePrice, double retailPrice) {
        PurchasePrice = purchasePrice;
        this.retailPrice = retailPrice;
    }
}
