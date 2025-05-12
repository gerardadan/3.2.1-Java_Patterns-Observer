Gracias por la captura. Con base en la estructura que me has mostrado, actualizo el README para reflejar los nombres de clases reales que usas en el proyecto:

---

# Readme for Exercise: Observer – Stock Market Notification System

## 📄 Description

This exercise demonstrates the **Observer Design Pattern** in the context of a stock market simulation. A central `StockExchange` acts as the observable and notifies various `Broker` instances (observers) when the market value changes. This design promotes loose coupling between the data source and the reacting components.

---

## 🚀 Exercise

### Exercise 1: Stock Market Observer

Design a system where a `StockExchange` notifies multiple `Broker` instances whenever stock prices change.

#### 🧩 Functionality:

* Use the **Observer Pattern** to implement:

  * `BrokerObserver`: Interface for observers (brokers).
  * `BrokerObserverSubject`: Interface for the observable (stock exchange).
  * `StockExchange`: Implements `BrokerObserverSubject` and manages a list of observers.
  * `Broker`: Implements `BrokerObserver` and reacts to market changes.
  * `StockActionMarket`: Represents the current state of the market (e.g., stock up/down).
* The `Main` class demonstrates:

  * Registering brokers to the stock exchange.
  * Simulating market changes using `StockActionMarket`.
  * Broadcasting updates from `StockExchange` to all brokers.

#### 🏗️ Required Components:

* `BrokerObserver` (interface)
* `BrokerObserverSubject` (interface)
* `StockExchange` (observable subject)
* `Broker` (observer)
* `StockActionMarket` (stock state)
* `Main` (entry point and simulation logic)

---

## 💻 Technologies Used

* Java
* Observer Design Pattern

## 📋 Requirements

* JDK 8 or higher
* IntelliJ IDEA, Eclipse or VS Code with Java support

---

¿Quieres que en el próximo ejercicio también adapte los nombres de clases si me pasas la estructura?
