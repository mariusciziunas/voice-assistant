package edu.ciziunas.voiceassistant.weather;

public class Weather {

    private String description;

    public Weather() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "description='" + description + '\'' +
                '}';
    }
}
