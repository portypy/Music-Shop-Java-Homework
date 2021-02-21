package shop;

import stock.StockItem;

import java.util.ArrayList;

public class Shop {
    ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }
    public ArrayList<ISell> getStock() {
        return stock;
    }
    public void addItemToStock(StockItem item){
        this.stock.add(item);
    }
    public void removeFromStock(StockItem item){
        this.stock.remove(item);
    }
    public double getTotalPossibleProfit() {
       double profit = this.stock.stream().mapToDouble(ISell::calculateMarkup).sum();
       return profit;
    }
}
