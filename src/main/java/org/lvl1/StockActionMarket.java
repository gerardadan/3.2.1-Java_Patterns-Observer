package org.lvl1;

public class StockActionMarket {
    private String name;
    private Double price;

    public StockActionMarket(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String name() {
        return name;
    }

    public Double price() {
        return price;
    }

}
