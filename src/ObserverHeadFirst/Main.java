package ObserverHeadFirst;

public class Main {
    public static void main(String[] args){
        WeatherData wd = new WeatherData();
        CurrentWeather ob = new CurrentWeather(wd);

        wd.setMeasurements(100,100);
        wd.setMeasurements(150,150);
        wd.removeObserver(ob);
        wd.setMeasurements(150,150);

    }
}
