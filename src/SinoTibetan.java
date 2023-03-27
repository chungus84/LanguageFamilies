public class SinoTibetan extends Language {
    /** sets out a class specifically for SinoTibetan languages */

    SinoTibetan(String inputLanguageName, int inputNumSpeakers) {
        super(inputLanguageName,
                inputNumSpeakers,
                "Asia",
                "subject-object-verb");
        if(inputLanguageName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }

}
