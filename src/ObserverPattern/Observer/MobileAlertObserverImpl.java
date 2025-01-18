package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String username;
    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String username, StocksObservable stocksObservable){
        this.username = username;
        this.stocksObservable = stocksObservable;
    }


    @Override
    public void update() {
        sendMsgOnMobile(username, "product is in stock. Hurry up!!");
    }

    public void sendMsgOnMobile(String username, String msg){
        System.out.println("msg sent to  : " + username);
    }
}
