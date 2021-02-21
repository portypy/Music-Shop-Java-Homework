package stock.other;

import stock.StockItem;

public class SheetMusic extends StockItem {

    String title;

    public SheetMusic(double purchasePrice, double retailPrice, String title) {
        super(purchasePrice, retailPrice);

        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
