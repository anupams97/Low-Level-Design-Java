package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void addObserver(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStock(int stock) {
        if (stockCount == 0  && stock > 0){
            notifyObservers();
        }
        stockCount = stock;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
