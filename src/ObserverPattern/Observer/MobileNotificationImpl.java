package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileNotificationImpl implements NotificationAlertObserver {

    String mobileNo;
    StocksObservable observer;

    public MobileNotificationImpl(String mobileNo, StocksObservable observer) {
        this.mobileNo = mobileNo;
        this.observer = observer;
    }
    @Override
    public void update(){
        sendMessage(mobileNo);
    }
    private void sendMessage(String mobileNo){
        System.out.println("Message sent to:"+mobileNo);
    }
}
