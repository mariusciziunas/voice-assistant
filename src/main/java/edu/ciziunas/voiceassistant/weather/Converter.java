package edu.ciziunas.voiceassistant.weather;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Converter<T> {

    public T convertToObj(String json, Class<T> valueType) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            return objectMapper.readValue(json, valueType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Error when parsing weather json");
    }

}
