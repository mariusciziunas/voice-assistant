package edu.ciziunas.voiceassistant;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;

import java.io.IOException;

public class VoiceAssistant {

    private LiveSpeechRecognizer recognizer;

    public VoiceAssistant() {
        try {
            recognizer = new LiveSpeechRecognizer(getConfig());
        } catch (IOException e) {
            throw new RuntimeException("unable to init config", e);
        }
    }

    public void start() {
        recognizer.startRecognition(true);
    }

    public void stop() {
        recognizer.stopRecognition();
    }

    public String getCommand() {
        return recognizer.getResult().getHypothesis();
    }


    private Configuration getConfig() {
        Configuration configuration = new Configuration();
        String acousticModelPath = "resource:/edu/cmu/sphinx/models/en-us/en-us";
        configuration.setAcousticModelPath(acousticModelPath);
        String dictionaryPath = "resource:/reduced-voc-en-us.dict";
        configuration.setDictionaryPath(dictionaryPath);
        String languageModelPath = "resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin";
        configuration.setLanguageModelPath(languageModelPath);
        return configuration;
    }
}
