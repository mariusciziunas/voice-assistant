package edu.ciziunas.voiceassistant.weather;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;

import java.io.IOException;

public class WeatherService {

    private String apiKey;

    public WeatherService(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getWeatherData(String city, String countryCode) {
        HttpRequestFactory requestFactory
                = new NetHttpTransport().createRequestFactory();
        try {
            HttpRequest request = requestFactory.buildGetRequest(
                    new GenericUrl("https://api.openweathermap.org/data/2.5/weather?q=" + city + "," + countryCode + "&units=metric&appid="+apiKey));
            return request.execute().parseAsString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Error when extracting weather data");
    }
}
