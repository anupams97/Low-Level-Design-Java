package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailNotificationImpl;
import ObserverPattern.Observer.MobileNotificationImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneObservable = new IphoneObservableImpl();
        NotificationAlertObserver ob1 = new EmailNotificationImpl("xyz@gmail.com",iphoneObservable);
        NotificationAlertObserver ob2 = new EmailNotificationImpl("abc@gmail.com",iphoneObservable);
        NotificationAlertObserver ob3 = new MobileNotificationImpl("999999",iphoneObservable);

        iphoneObservable.addObserver(ob1);
        iphoneObservable.addObserver(ob2);
        iphoneObservable.addObserver(ob3);

        iphoneObservable.setStock(10);
        iphoneObservable.setStock(0);
        iphoneObservable.setStock(10);

    }
}
