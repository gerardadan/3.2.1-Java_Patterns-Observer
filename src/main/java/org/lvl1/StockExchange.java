package org.lvl1;

public class StockExchange implements BrokerObserver {
    private String name;

    public StockExchange(String name) {
        this.name = name;
    }

    private void buy() {
        System.out.println("Buy stock market action");
    }

    private void sell() {
        System.out.println("Sell stock market action");
    }

    @Override
    public void stockMarketPriceChanged(StockActionMarket stockActionMarket) {
        if(stockActionMarket.price().longValue() < 0)
            buy();
        else
            sell();
    }
}
