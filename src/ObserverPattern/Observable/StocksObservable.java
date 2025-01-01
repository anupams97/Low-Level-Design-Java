package ObserverPattern.Observable;


import ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void addObserver(NotificationAlertObserver observer);
    public void deleteObserver(NotificationAlertObserver observer);
    public void notifyObservers();
    public void setStock(int stock);
    public int getStockCount();
}
