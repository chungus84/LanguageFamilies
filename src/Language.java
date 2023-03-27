public class Language {
    /** Parent class for creating language objects */

    // Class variables
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    // Constructor for Languages
    Language(String inputName,
             int inputNumSpeakers,
             String inputRegionsSpoken,
             String inputWordOrder) {

        name = inputName;
        numSpeakers = inputNumSpeakers;
        regionsSpoken = inputRegionsSpoken;
        wordOrder = inputWordOrder;
    }

    public void getInfo() {
        /** Prints out info for the language */
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken +
                " The language follows the ord order: " + this.wordOrder);
    }

    public void setRegion(String newRegion) {
        /** sets region of the instance */
        this.regionsSpoken = newRegion;
    }

    public void setNumSpeakers(int inputNumSpeakers) {
        /** sets numSpeakers of the instance */
        this.numSpeakers = inputNumSpeakers;
    }

    public void setWordOrder(String newWordOrder) {
        /** sets wordOrder of the instance */
        this.wordOrder = newWordOrder;
    }

    public static void main(String[] args) {

        Language japanese = new Language("Japanese",
                126000000,
                "Japan",
                "subject - object - verb");

        Mayan ixil = new Mayan("Ixil",
                83600);

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese",
                920000000);

        SinoTibetan burmese = new SinoTibetan("Burmese",
                33000000);

        Language[] languages = {japanese, ixil, mandarin, burmese};

        for(Language language : languages) {
            language.getInfo();
        }
        // testing setters
        japanese.setRegion("Asia");
        japanese.setNumSpeakers(127000000);
        japanese.setWordOrder("subject-object-verb");
        japanese.getInfo();

    }
}
