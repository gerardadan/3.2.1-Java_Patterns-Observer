package org.lvl1;

public interface BrokerObserverSubject {
    void subscribe(BrokerObserver observer);
    void unsubscribe(BrokerObserver observer);
    void notifyObservers(StockActionMarket stockActionMarket);
}
