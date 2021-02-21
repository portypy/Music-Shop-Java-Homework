package stock;

import shop.ISell;

public abstract class StockItem implements ISell {
    double PurchasePrice;
    double retailPrice;

    public StockItem(double purchasePrice, double retailPrice) {
        PurchasePrice = purchasePrice;
        this.retailPrice = retailPrice;
    }

    public double getPurchasePrice() {
        return PurchasePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        PurchasePrice = purchasePrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
    public double calculateMarkup() {
        return getRetailPrice() - getPurchasePrice();
    }
}
