import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(String stockName, double price);
}

// Concrete Observer
class MobileApp implements Observer {

    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(user + " received update: " + stockName + " price is ₹" + price);
    }
}

// Subject
class StockMarket {

    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStockPrice(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }
}

// Main Class
public class ObserverPatternExample {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer user1 = new MobileApp("Sathwik");
        Observer user2 = new MobileApp("Rahul");

        stockMarket.registerObserver(user1);
        stockMarket.registerObserver(user2);

        stockMarket.setStockPrice("TCS", 3850.50);

        System.out.println();

        stockMarket.removeObserver(user2);

        stockMarket.setStockPrice("Infosys", 1620.75);
    }
}