package edu.ciziunas.voiceassistant.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {

    private Main main;
    private Weather weather;

    public WeatherData() {

    }

    public WeatherData(Main main, Weather weather) {

        this.main = main;
        this.weather = weather;
    }

    public Main getMain() {
        return main;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "main=" + main +
                ", weather=" + weather +
                '}';
    }
}
