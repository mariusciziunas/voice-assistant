package edu.ciziunas.voiceassistant.weather;

import java.util.List;

public class WeatherData {

    private Main main;
    private List<Weather> weather;
    private String name;

    public WeatherData() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "main=" + main +
                ", weather=" + weather +
                ", name='" + name + '\'' +
                '}';
    }
}
