import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private int mPressure;
    private int mTemperature;
    private int mHumidity;
    private List<Observer> mObserverList;

    public WeatherStation() {
        mObserverList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        mObserverList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        mObserverList.remove(mObserverList.indexOf(o));
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : mObserverList)
            observer.update(mPressure, mTemperature, mHumidity);
    }

    public void setPressure(int pressure) {
        mPressure = pressure;
        notifyAllObservers();
    }

    public void setTemperature(int temperature) {
        mTemperature = temperature;
        notifyAllObservers();
    }

    public void setHumidity(int humidity) {
        mHumidity = humidity;
        notifyAllObservers();
    }
}
