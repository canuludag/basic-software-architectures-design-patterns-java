public class WeatherObserver implements Observer, DataPresenter {

    private int mPressure;
    private int mTemperature;
    private int mHumidity;
    private Subject mSubject;

    public WeatherObserver(Subject subject) {
        mSubject = subject;
        mSubject.addObserver(this);
    }


    @Override
    public void update(int pressure, int temperature, int humidity) {
        mPressure = pressure;
        mTemperature = temperature;
        mHumidity = humidity;

        showData();
    }

    @Override
    public void showData() {
        System.out.println(mPressure + "-" + mTemperature + "-" + mHumidity);

    }
}
