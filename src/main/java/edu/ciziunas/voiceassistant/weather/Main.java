package edu.ciziunas.voiceassistant.weather;

public class Main {

    private int humidity;
    private float temp;
    private int pressure;

    public Main() {
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Main{" +
                "humidity=" + humidity +
                ", temp=" + temp +
                ", pressure=" + pressure +
                '}';
    }
}
