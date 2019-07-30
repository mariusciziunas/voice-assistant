package edu.ciziunas.voiceassistant.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.client.RestTemplate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherService {

    private String apiKey;

    public WeatherService(String apiKey) {
        this.apiKey = apiKey;
    }

    public void getWeatherData(String city, String countryCode) {
        RestTemplate restTemplate = new RestTemplate();
        WeatherData weather = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?q=London,uk&units=metric&appid=", WeatherData.class);
        System.out.println(weather);
    }
}
