package ObserverHeadFirst;


import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    List<Observer> observers;
    int temp;
    int humidity;

    WeatherData(){
        this.observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.removeFirst();
    }

    public void notifyObservers(){
        for(Observer observer : observers ){
            observer.update(temp,humidity);
        }
    }
    public void setMeasurements(int temp,int humidity){
        this.temp = temp;
        this.humidity = humidity;
        notifyObservers();
    }
}
