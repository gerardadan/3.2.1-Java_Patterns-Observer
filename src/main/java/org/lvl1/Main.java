package org.lvl1;

/**
 * Main class to demonstrate the Observer design pattern.
 * This class creates a news channel (subject) and multiple users (observers),
 * and shows how users receive updates when the news channel publishes new news.
 */
public class Main {
    public static void main(String[] args) {
        BrokerObserver stockExchange1 = new StockExchange("Market 01");
        BrokerObserver stockExchange2 = new StockExchange("Market 02");
        BrokerObserverSubject broker = new Broker();
        broker.subscribe(stockExchange1);
        broker.subscribe(stockExchange2);

        StockActionMarket stockActionMarket1 = new StockActionMarket("Apple", 220.0);
        broker.notifyObservers(stockActionMarket1);

        StockActionMarket stockActionMarket2 = new StockActionMarket("McDonalds", -20.5);
        broker.notifyObservers(stockActionMarket2);


    }
}
