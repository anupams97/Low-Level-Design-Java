package ObserverPattern.Observer;
import ObserverPattern.Observable.StocksObservable;
public class EmailNotificationImpl  implements NotificationAlertObserver{
    String email;
    StocksObservable observable;
    public EmailNotificationImpl(String email, StocksObservable observable) {
        this.email = email;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail(email);
    }
    private void sendEmail(String email) {
        System.out.println("mail sent to " + email + ": " + "product is in stock hurry up");
    }
}
