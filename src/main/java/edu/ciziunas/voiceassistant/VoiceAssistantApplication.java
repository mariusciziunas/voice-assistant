package edu.ciziunas.voiceassistant;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

//@SpringBootApplication
public class VoiceAssistantApplication {

//	public static void main(String[] args) {
//		System.out.println("Labas");
//		SpringApplication.run(VoiceAssistantApplication.class, args);
//	}


    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();

        String acousticModelPath = "resource:/edu/cmu/sphinx/models/en-us/en-us";
        configuration.setAcousticModelPath(acousticModelPath);
        String dictionaryPath = "resource:/ciziunas-en-us.dict";
//        String dictionaryPath = "resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict";
        configuration.setDictionaryPath(dictionaryPath);
        String languageModelPath = "resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin";
        configuration.setLanguageModelPath(languageModelPath);

//        StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(configuration);
//        InputStream stream = new FileInputStream(new File("oh-my-god-1.wav"));

        LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
//        SpeechAligner aligner = new SpeechAligner(acousticModelPath, dictionaryPath, null);
//        recognizer.align(new URL("101-42.wav"), "one oh one four two");

// Start recognition process pruning previously cached data.
        recognizer.startRecognition(true);

        SpeechResult result = recognizer.getResult();
// Pause recognition process. It can be resumed then with startRecognition(false).



        while ((result = recognizer.getResult()) != null) {
            System.out.println(result.getHypothesis());
            String hypothesis = result.getHypothesis();
            System.out.println(hypothesis);
        }
        recognizer.stopRecognition();

//        recognizer.startRecognition(stream);
//        SpeechResult result;
//        while ((result = recognizer.getResult()) != null) {
//            System.out.format("Hypothesis: %s\n", result.getHypothesis());
//        }
//        recognizer.stopRecognition();
    }
}
