package edu.ciziunas.voiceassistant;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

public class VoiceAssistantApplication {


    public static void main(String[] args) {
        VoiceAssistant voiceAssistant = new VoiceAssistant();
        voiceAssistant.start();
        String command = "";
        while ((command = voiceAssistant.getCommand()) != null) {
            System.out.println(command);
        }
    }

}
