package ObserverHeadFirst;

public class CurrentWeather implements Observer{
    Subject wd;
    CurrentWeather(Subject wd){
      this.wd = wd;
      wd.registerObserver(this);
    }
    @Override
    public void update(int temp, int humidity) {
        System.out.println("Current temperature is:"+ temp +" and humidity is "+ humidity);
    }
}
