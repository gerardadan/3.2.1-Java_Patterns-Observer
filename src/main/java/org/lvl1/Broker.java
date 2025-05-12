package org.lvl1;

import java.util.ArrayList;
import java.util.List;

public class Broker implements BrokerObserverSubject {
    private final List<BrokerObserver> brokerObserverSubject = new ArrayList<>();
    private Double price;

    public Broker() {

    }

    @Override
    public void subscribe(BrokerObserver observer) {
        brokerObserverSubject.add(observer);
    }

    @Override
    public void unsubscribe(BrokerObserver observer) {
        brokerObserverSubject.remove(observer);
    }

    @Override
    public void notifyObservers(StockActionMarket stockActionMarket) {
        for (BrokerObserver observerSubject : brokerObserverSubject) {
            observerSubject.stockMarketPriceChanged(stockActionMarket);
        }
    }
}
